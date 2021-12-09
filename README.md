# java-cli-maven-spring-surefire-findbugs-pmd-testng-car-data

## Description
Analyze source code for potential bugs.
A POC for spring app using testng
framework with surefire and
pmd plugins.

## Tech stack
- java
- maven
	- findbugs
  - spring
  - testng
  - surefire
  - pmd

## Docker stack
- maven:3-openjdk-17

## To run
`sudo ./install.sh -u`
- pmd report found at bin/target/site
- findbugs report at bin/target/findbugs

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
[Code concept](https://github.com/eugenp/tutorials/tree/master/testing-modules/testng)
