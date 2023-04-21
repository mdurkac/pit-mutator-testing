# Demonstration of `USE_MD5_FOR_ENCRYPTION_DIGEST_UTILS_MUTATOR` mutator

## Use weak digest mutator

Goal: `USE_MD5_FOR_ENCRYPTION_DIGEST_UTILS_MUTATOR` changes secure hash function for weaker hash function, such as MD5, which can be deemed insecure nowadays.

Implementation: mutator intercepts function call to the methods of`DigestUtils` class. For each intercepted method call, `md5` method is used regardless of the return type of method argument (`String`, `InputStream` or array of `byte`).

## Content

Project contains an example of a test that on its own kills the mutator and a test that on its own does not kill the mutator.

## Source

1) DURKÁČ, Martin. Security-aware Mutation Testing, 2023.