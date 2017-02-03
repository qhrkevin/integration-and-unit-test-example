# Example Unit & Integration Test Project

A simple example project for running Unit Test and Integration Tests together or independently 
This example uses the maven-surefire plugin, and the maven-failsafe plugin

Tests will not run when the following actions are take in the IDE:

* Build
* Clean & Build
* Run
* Debug
* Build with Dependencies

### To Run Both Unit Tests & Integration Tests

`mvn clean verify`                          Or run Custom Goal: Unit Tests + Integration Tests in Netbeans 

### To Run only Integration Tests

`mvn clean verify -Dsurefire.skip=true`     Or run Custom Goal: Integration Tests in Netbeans

### To Run only Unit Tests

`mvn clean verify -DskipITs=true`           Or run Custom Goal: Unit Tests
