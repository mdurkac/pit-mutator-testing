# Demonstration of `TRUST_USER_INPUT_IN_FILES_RETRIEVEMENT` mutator

## Remove path traversal sanitization (RPTS)

Goal: the `RPTS` operator introduces a vulnerability which allows a malicious user to enter a path to access directories or files regardless of the file access policy defined by the web application. 

Implementation: the operator simply removes calls to input file names sanitization functions, generally used to avoid this vulnerability.

## Content

Project contains an example of a test that on its own kills the mutator and a test that on its own does not kill the mutator.

## Source

1) LOISE, Thomas; DEVROEY, Xavier; PERROUIN, Gilles; PAPADAKIS, Mike; HEYMANS, Patrick. Towards security-aware mutation testing. In: 2017 IEEE International Conference on Software Testing, Verification and Validation Workshops (ICSTW). IEEE, 2017, pp. 97–102.

2) https://github.com/Iotho/pitest-sec