# Demonstration of `USE_BLOWFISH_WITH_SHORT_KEY` mutator

## Use Blowfish with short key (UBFWSK)

Goal: The `UBFWSK` operator tries to weaken Blowfish encryption to expose the application to brute force attacks, also allowing data to confidentiality leaks. 

Implementation: When the operator detects the usage of Blowfish with a sufficient key size, it sets the key size to 64 bits.

## Content

Project contains an example of a test that on its own kills the mutator and a test that on its own does not kill the mutator.

## Source 

1) LOISE, Thomas; DEVROEY, Xavier; PERROUIN, Gilles; PAPADAKIS, Mike; HEYMANS, Patrick. Towards security-aware mutation testing. In: 2017 IEEE International Conference on Software Testing, Verification and Validation Workshops (ICSTW). IEEE, 2017, pp. 97–102.

2) https://github.com/Iotho/pitest-sec