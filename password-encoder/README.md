# Demonstration of `NOOP_PASSWORD_ENCODER` mutator

## Always enabled user details mutator

Goal: `NOOP_PASSWORD_ENCODER_MUTATOR` removes the ability to store passwords in the hashed form using any hashing function.

Implementation: in the Spring Security module, the `PasswordEncoder` is responsible for this functionality. Every time there is a function call to encode or matches, the mutator switches the implementation of the user-defined `PasswordEncoder` to `NoopPasswordEncoder` which does not use any hashing function. `NoopPasswordEncoder` is used regardless of `PasswordEncoder` implementation.

## Content

Project contains an example of a test that on its own kills the mutator and a test that on its own does not kill the mutator.

## Source

1) DURKÁČ, Martin. Security-aware Mutation Testing, 2023.