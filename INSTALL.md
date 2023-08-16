In order to trace the application, it needs to use the modified btrace. If you are using SDKMAN, do these steps:

```shell
cd implementation/Modified-Btrace
source config_build.sh
./gradlew :btrace-dist:build
cp btrace-dist/build/resources/main/<Btrace-Version> ~/.sdkman/candidates/btrace/2.3.0-SNAPSHOT
sdk default btrace 2.3.0-SNAPSHOT
```
