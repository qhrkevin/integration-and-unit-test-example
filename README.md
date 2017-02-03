# Example Unit & Integration Test Project

A simple example project for running Unit Test and Integration Tests together or independently 
This example uses the maven-surefire plugin, and the maven-failsafe plugin

Tests will not run when the following actions are take in the IDE:

* Build
* Clean & Build
* Run
* Debug
* Build with Dependencies

## How to run tests

To run a custom goal in Netbeans, right click the project and select Custom, followed by the desired goal

| Command Line | Custom Goal | Integration Tests | Unit Tests |
| --- | --- | :---: | :---: | 
| `mvn clean verify` | Unit Tests + Integration Tests | :heavy_check_mark: | :heavy_check_mark: |
| `mvn clean verify -Dsurefire.skip=true` | Integration Tests | :heavy_check_mark: | :x: |
| `mvn clean verify -DskipITs=true` | Unit Tests | :x: | :heavy_check_mark: |

