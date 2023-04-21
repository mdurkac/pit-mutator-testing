# Demonstration of `AUTH_TOKEN_IS_ALWAYS_AUTHENTICATED_MUTATOR` mutator

## Authentication token is always authenticated mutator

Goal: `AUTH_TOKEN_IS_ALWAYS_AUTHENTICATED_MUTATOR` always presents an authentication token to the AuthenticationManager regardless of the conditions.

Implementation: the implementation of the isAuthenticated method is intercepted and true is returned.

## Content

Project contains an example of a test that on its own kills the mutator and a test that on its own does not kill the mutator.

## Source

1) DURKÁČ, Martin. Security-aware Mutation Testing, 2023.