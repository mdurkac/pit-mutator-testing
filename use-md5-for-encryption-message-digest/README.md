# Demonstration of `USE_MD5_FOR_ENCRYPTION_JAVA_STANDARD_MUTATOR` mutator

## Use weak message digest (UWMD)

Goal: the `UWMD` operator introduces a vulnerability in integrity checking of received data by using a weak hash function (i.e., MD5).

Implementation: it identifies hash function calls and replaces them by MD5 hashing.

## Content

Project contains an example of a test that on its own kills the mutator and a test that on its own does not kill the mutator.

## Source

1) LOISE, Thomas; DEVROEY, Xavier; PERROUIN, Gilles; PAPADAKIS, Mike; HEYMANS, Patrick. Towards security-aware mutation testing. In: 2017 IEEE International Conference on Software Testing, Verification and Validation Workshops (ICSTW). IEEE, 2017, pp. 97–102.

2) https://github.com/Iotho/pitest-sec