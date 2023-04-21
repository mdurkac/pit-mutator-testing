# Demonstration of `SECURITY_EXPRESSION_TRUE_MUTATOR` mutator

## Security expression always grants access mutator

Goal: `SECURITY_EXPRESSION_TRUE_MUTATOR` changes the behavior of SpEL functions to always allow access by changing return values to true.

Implementation: in following methods of `SecurityExpressionRoot` return true:

- `hasAuthority`,
- `hasAnyAuthority`,
- `hasRole`,
- `hasAnyRole`,
- `isAuthenticated`,
- `isRememberMe`,
- `isFullyAuthenticated`,
- `hasPermission`.

## Content

Project contains an example of a test that on its own kills the mutator and a test that on its own does not kill the mutator.

## Source

1) DURKÁČ, Martin. Security-aware Mutation Testing, 2023.