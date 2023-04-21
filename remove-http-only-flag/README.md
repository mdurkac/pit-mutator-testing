# Demonstration of `REMOVE_HTTPONLY_FLAG_MUTATOR` mutator

## Remove HTTP-only flag from cookie (RHTTPOFC)

Goal: The`RHTTPOFC` operator exposes the web pages to such session’s cookies confidentiality leaks. 

Implementation: It removes the call of standard methods setting the `httpOnly` flag on cookies, allowing to share the cookie with client-side scripts.

## Content

Project contains an example of a test that on its own kills the mutator and a test that on its own does not kill the mutator.

## Source

1) LOISE, Thomas; DEVROEY, Xavier; PERROUIN, Gilles; PAPADAKIS, Mike; HEYMANS, Patrick. Towards security-aware mutation testing. In: 2017 IEEE International Conference on Software Testing, Verification and Validation Workshops (ICSTW). IEEE, 2017, pp. 97–102.

2) https://github.com/Iotho/pitest-sec