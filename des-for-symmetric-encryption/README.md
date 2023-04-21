# Demonstration of `USE_DES_FOR_SYMMETRIC_ENCRYPTION` mutator

## Use DES in symmetric encryption (UDESISE)

Goal: the idea of the `UDESISE`operator is to weaken the confidentiality of symmetrically encrypted data, exposing it to leaks. 

Implementation: it detects the usage of a symmetric encryption algorithm and replaces it with DES encryption. This operator requires to modify several Java code lines. Though, PIT’s architecture wasn’t designed for this kind of modifications. Therefore, `UDESISE` is still under review but our initial implementation provides promising results.

## Content

Project contains an example of a test that on its own kills the mutator and a test that on its own does not kill the mutator.

## Source

1) LOISE, Thomas; DEVROEY, Xavier; PERROUIN, Gilles; PAPADAKIS, Mike; HEYMANS, Patrick. Towards security-aware mutation testing. In: 2017 IEEE International Conference on Software Testing, Verification and Validation Workshops (ICSTW). IEEE, 2017, pp. 97–102.

2) https://github.com/Iotho/pitest-sec