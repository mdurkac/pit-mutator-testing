# Demonstration of `PERMIT_ALL_ON_AUTHENTICATED_MUTATOR` mutator

## Permit all URLs without authentication mutator

Goal: `PERMIT_ALL_ON_AUTHENTICATED_MUTATOR` permits access to endpoints that are requiring user to be authenticated.

Implementation: intercepts function call to `authenticated` method and replace it with `permitAll` method.

## Content

Project contains an example of a test that on its own kills the mutator and a test that on its own does not kill the mutator.

## Source

1) DURKÁČ, Martin. Security-aware Mutation Testing, 2023.