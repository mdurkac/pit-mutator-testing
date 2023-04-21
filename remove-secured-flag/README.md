# Demonstration of `REMOVE_SECURE_FLAG_MUTATOR` mutator

## Unsecure cookie (UC)

Goal: the `UC` operator allows to send sensitive cookies during unsecured HTTP communication. 

Implementation: it removes the call to the methods setting the secure flag on cookies.

## Content

Project contains an example of a test that on its own kills the mutator and a test that on its own does not kill the mutator.

## Source

1) LOISE, Thomas; DEVROEY, Xavier; PERROUIN, Gilles; PAPADAKIS, Mike; HEYMANS, Patrick. Towards security-aware mutation testing. In: 2017 IEEE International Conference on Software Testing, Verification and Validation Workshops (ICSTW). IEEE, 2017, pp. 97–102.

2) https://github.com/Iotho/pitest-sec