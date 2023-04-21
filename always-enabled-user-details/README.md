# Demonstration of `ALWAYS_ENABLED_USER_DETAILS_MUTATOR` mutator

## Always enabled user details mutator

Goal: `ALWAYS_ENABLED_USER_DETAILS_MUTATOR` introduces vulnerability, where even if account disabled, expired, locked or credentials are expired, it will not matter and user is logged in.

Implementation: following methods from UserDetails are intercepted and always return true:

- `isAccountNonExpired`,
- `isAccountNonLocked`,
- `isCredentialsNonExpired`,
- `isEnabled`.

## Content

Project contains an example of a test that on its own kills the mutator and a test that on its own does not kill the mutator.

## Source

1) DURKÁČ, Martin. Security-aware Mutation Testing, 2023.