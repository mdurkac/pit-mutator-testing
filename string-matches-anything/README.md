# Demonstration of `STRING_MATCHER_MATCHES_ANYTHING_MUTATOR` mutator

## Remove regex sanitization (RRS)

Goal: the `RRS` operator tries to introduce vulnerabilities in external input filters of a web application.

Implementation: it detects regular expressions usages and replace them by a dummy expression, which is always true.

## Content

Project contains an example of a test that on its own kills the mutator and a test that on its own does not kill the mutator.

## Source

1) LOISE, Thomas; DEVROEY, Xavier; PERROUIN, Gilles; PAPADAKIS, Mike; HEYMANS, Patrick. Towards security-aware mutation testing. In: 2017 IEEE International Conference on Software Testing, Verification and Validation Workshops (ICSTW). IEEE, 2017, pp. 97–102.

2) https://github.com/Iotho/pitest-sec