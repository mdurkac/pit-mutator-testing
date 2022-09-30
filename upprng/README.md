### Module for testing USE_PREDICTABLE_PSEUDO_RAND_NUM_GEN (UPPRNG) mutator

#### Description

Use predictable pseudo random number generator
(UPPRNG). Context: Pseudo Random Number Generators
(PRNGs) are widely used in secure-aware contexts and es-
pecially in cryptography to avoid prediction that could ease
undesired decryption. Goal: the UPPRNG operator tries to
make the application vulnerable to predictable random num-
ber generator attacks potentially leading to various security
leaks (authentication, authorization, etc.). Implementation: this
operator replaces the unpredictable pseudo random generators
from the SecureRandom class by predictable ones using the
Random class.

#### TODO:
- [ ] implementation
- [ ] tests

#### Source (BibTex):

```
@inproceedings{loise2017towards,
title={Towards security-aware mutation testing},
author={Loise, Thomas and Devroey, Xavier and Perrouin, Gilles and Papadakis, Mike and Heymans, Patrick},
booktitle={2017 IEEE International Conference on Software Testing, Verification and Validation Workshops (ICSTW)},
pages={97--102},
year={2017},
organization={IEEE}
}
```
