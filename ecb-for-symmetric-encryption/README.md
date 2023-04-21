# Demonstration of `USE_ECB_IN_SYMMETRIC_ENCRYPTION` mutator

## Use ECB in symmetric encryption (UECBISE)

Goal: the `UECBISE` operator tries to weaken the confidentiality of symmetrically encrypted data by easing its decryption using ECB mode. 

Implementation: it detects the usage of a symmetric encryption algorithm and replaces its mode by ECB.

## Content

Project contains an example of a test that on its own kills the mutator and a test that on its own does not kill the mutator.

## Source

1) LOISE, Thomas; DEVROEY, Xavier; PERROUIN, Gilles; PAPADAKIS, Mike; HEYMANS, Patrick. Towards security-aware mutation testing. In: 2017 IEEE International Conference on Software Testing, Verification and Validation Workshops (ICSTW). IEEE, 2017, pp. 97–102.

2) https://github.com/Iotho/pitest-sec