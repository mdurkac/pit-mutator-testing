# Project for running PIT mutation testing with different mutators

Project for demonstrating mutators from the thesis. Mutator `SQL_INJECTION_OK_WITH_JDBC` is missing, because it requires not trivial database application to run integration tests on. Mutator `USE_WEAK_PSEUDO_RANDOM_NUMBER_GENERATOR_MUTATOR` is also missing, because testing if random number was generated from `java.util.Random` or `java.security.SecureRandom` is not trivial.

## Usage

- build PIT with security-aware mutators locally
- change directory to specific module
- update `pom.xml` targerTests if you want to run only tests that kill or not kill mutator
- run `mvn test-compile org.pitest:pitest-maven:mutationCoverage`