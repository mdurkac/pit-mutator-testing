# Demonstration of `HOST_NAME_VERIFY_TO_TRUE` mutator

## Remove host name verification (RHNV)

Goal: the `RHNV` operator removes this authentication, making the application vulnerable to man-in-the-middle attacks. 

Implementation: it removes standard methods used to authenticate clients using their host names.

## Content

Project contains an example of a test that on its own kills the mutator and a test that on its own does not kill the mutator.

## Source

1) LOISE, Thomas; DEVROEY, Xavier; PERROUIN, Gilles; PAPADAKIS, Mike; HEYMANS, Patrick. Towards security-aware mutation testing. In: 2017 IEEE International Conference on Software Testing, Verification and Validation Workshops (ICSTW). IEEE, 2017, pp. 97–102.

2) https://github.com/Iotho/pitest-sec