# Demonstration of `REMOVE_SECURE_SOCKET_MUTATOR` mutator

## Remove encryption in socket (REIS)

Goal: the `REIS` operator tries to weaken the application’s sent data to expose it to a confidentiality leak. 

Implementation: it removes the SSL encryption in sockets by identifying and removing standard Java SSL-encryption. For instance, it can replace sockets created with a `SSLSocketFactory` by sockets created with a `SocketFactory`.

## Content

Project contains an example of a test that on its own kills the mutator and a test that on its own does not kill the mutator.

## Source

1) LOISE, Thomas; DEVROEY, Xavier; PERROUIN, Gilles; PAPADAKIS, Mike; HEYMANS, Patrick. Towards security-aware mutation testing. In: 2017 IEEE International Conference on Software Testing, Verification and Validation Workshops (ICSTW). IEEE, 2017, pp. 97–102.

2) https://github.com/Iotho/pitest-sec