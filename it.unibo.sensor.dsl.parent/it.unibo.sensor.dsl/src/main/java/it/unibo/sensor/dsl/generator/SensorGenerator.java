package it.unibo.sensor.dsl.generator;

import it.unibo.sensor.dsl.sensorDSL.*;
import it.unibo.sensor.dsl.validation.DayUtils;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SensorGenerator extends AbstractSensorGenerator {
    @Override
    public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
        final File inFile = new File(input.getURI().toFileString());
        final SensorDefinition sensorDefinition = (SensorDefinition) input.getContents().get(0);
        final String inFileName = inFile.getName().split("\\.")[0];
        try {
            var template = pythonTemplateFile("Sensor");
            final  var replacements = List.of(
                getGeneralInfoReplacements(sensorDefinition.getSensor()),
                getNetworkInfoReplacements(sensorDefinition.getSensor().getNetwork()),
                getGatewayInfoReplacements(sensorDefinition.getSensor().getGateway()),
                getSensorRegistryInfoReplacements(sensorDefinition.getSensor().getRegistry()),
                getCronJobInfoReplacements(sensorDefinition.getSensor().getCronjob())
            );
            for (final var replacement: replacements) {
                template = replace(template, replacement);
            }
            fsa.generateFile("sensor_" + inFileName + ".py", template);
        } catch (final IOException e) {
            throw new Error("Error while generating template", e);
        }
    }

    private Map<String, String> getCronJobInfoReplacements(final GeneralCronjobInfo cronjob) {
        // TODO: correctly represent cronjob into python template
        final String type = cronjob.getType();
        final Map<String, String> map = new HashMap<>();
        if (type.equals("at")){
            final String unit = cronjob.getUnit().toLowerCase();
            String hours, minute;
            if (unit.equals("minute")) {
                hours = "*";
                minute = cronjob.getValue();
            } else {
                hours = cronjob.getValue();
                minute = "*";
            }
            map.put("SENSOR_CRONJOB_HOUR", hours);
            map.put("SENSOR_CRONJOB_MINUTE",minute);
        } else {
            map.put("SENSOR_CRONJOB_HOUR", cronjob.getHour());
            map.put("SENSOR_CRONJOB_MINUTE", cronjob.getMinute());
        }
        String dayFormat = "";
        if (cronjob.getRepeat().equals("from")){
            dayFormat = DayUtils.dayRange(cronjob.getFrom(), cronjob.getTo());
        } else {
            dayFormat = String.valueOf(DayUtils.getIndex(cronjob.getTo()));
        }
        map.put("SENSOR_CRONJOB_DAY_OF_WEEK", dayFormat);
        return map;
    }

    private Map<String, String> getGatewayInfoReplacements(final GeneralGatewayInfo gateway) {
        return Map.of(
                "SENSOR_APIGATEWAY_URL", gateway.getUrl(),
                "SENSOR_APIGATEWAY_PORT", String.valueOf(gateway.getPort()),
                "SENSOR_REGISTRY_REGISTERPATH", gateway.getRegister(),
                "SENSOR_REGISTRY_SHUTDOWNPATH", gateway.getShutdown(),
                "SENSOR_ALERTPATH", gateway.getAlert(),
                "SENSOR_DETECTIONPATH", gateway.getDetection()

        );
    }

    private Map<String, String> getSensorRegistryInfoReplacements(final SensorRegistryInfo sensorRegistryInfo) {
        return Map.of(
                "SENSOR_REGISTRY_URL", sensorRegistryInfo.getRegistryUrl(),
                "SENSOR_REGISTRY_KEY", sensorRegistryInfo.getApiKey()
        );
    }

    private Map<String, String> getNetworkInfoReplacements(final GeneralNetworkInfo network) {
        return Map.of(
            "SENSOR_ETHERNET_IP", network.getIp(),
            "SENSOR_ETHERNET_PORT", String.valueOf(network.getPort())
        );
    }

    private Map<String, String> getGeneralInfoReplacements(final Sensor sensor) {
        final var infos = sensor.getInfos();
        return Map.of(
                "SENSOR_INFORMATION_NAME", sensor.getName(),
                "SENSOR_INFORMATION_TYPE", infos.getType().toString(),
                "SENSOR_INFORMATION_DESCRIPTION", infos.getDescription(),
                "SENSOR_INFORMATION_QUERIES", getFormattedQueries(infos.getQuery())
        );
    }

    /**
     * NOTE: here logic does not account for thresholds and custom queries, they will require
     * a rewrite of the python sensor template. By now alert queries are entirely regulated by the
     * real world sensor that backs this sensor.
     *
     * In future version, a full query parsing must be made and yield a string of valid python (or at least,
     * that matches the expected format in the template).
     */
    private String getFormattedQueries(final List<Query> queries) {
        final var qs = queries.stream().map(q -> "\"" + q.getName() + "\"").collect(Collectors.joining(", "));
        return String.format("[ %s ]", qs);
    }
}
