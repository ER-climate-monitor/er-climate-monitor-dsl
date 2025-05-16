# er-climate-monitor-dsl
Domain Specific Language for sensors configuration

## Usage

In order to convert a `.unaciutri` DSL file, you can choose between the following two options.

### Jar

Download the jar of the latest release with:
```bash
wget https://github.com/S-furi/er-climate-monitor-dsl/releases/download/<latest_version>/sensorDsl-.jar
```

And simply run
```bash
java -jar sensorDsl-.jar <absolute_dsl_file_path> <absolute_output_path>`
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
