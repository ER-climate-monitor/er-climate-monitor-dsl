# er-climate-monitor-dsl
Domain Specific Language for sensors configuration

## Usage

### Writing with the DSL

A web based playground can be used in order to write correct sensor's configurations. The editor
is a slightly modified version of the Xtext default one, and can be easily used through
the following docker container:

```
docker run -p 8080:8080 --name dsl-editor sfuri/er-climate-monitor-dsl-editor:1.0.4
```

Then visit [http://localhost:8080](http://localhost:8080) on your machine.

Once the sensor configuration does not show any error, it can be pasted
into a `<my-sensor-config>.uanciutri` file and can be later processed
with the next steps.

### Conversion

In order to convert a `.unaciutri` DSL file, you can choose between the following two options.

### Jar

Download the jar of the latest release with:
```bash
wget https://github.com/ER-climate-monitor/er-climate-monitor-dsl/releases/download/<latest_version>/sensorDsl-.jar
```

And simply run
```bash
java -jar sensorDsl-v0.2.6.jar <absolute_dsl_file_path> <absolute_output_path>`
```

### Using sources

You can convert a file written with the custom DSL through the provided bash script:

```bash
./generate_file.sh <dsl_file_path> <output_path>
```

Or else you can go to `it.unibo.sensor.dsl.parent` folder and run the associated gradle task:

```bash
./gradlew :it.unibo.sensor.dsl:run --args '<absolute_dsl_file_path> <absolute_output_path>'
```
