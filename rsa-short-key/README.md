# Demonstration of `RSA_WITH_SHORT_KEY_MUTATOR` mutator

## Use RSA with short key (URSAWSK)

Goal: the `URSAWSK` operator tries to weaken RSA encryption to make brute force attacks possible, allowing confidential data to leak. 

Implementation: it detects the use of RSA encryption with a sufficient key size and sets its to 512 bits.

## Content

Project contains an example of a test that on its own kills the mutator and a test that on its own does not kill the mutator.

## Source

1) LOISE, Thomas; DEVROEY, Xavier; PERROUIN, Gilles; PAPADAKIS, Mike; HEYMANS, Patrick. Towards security-aware mutation testing. In: 2017 IEEE International Conference on Software Testing, Verification and Validation Workshops (ICSTW). IEEE, 2017, pp. 97–102.

2) https://github.com/Iotho/pitest-sec