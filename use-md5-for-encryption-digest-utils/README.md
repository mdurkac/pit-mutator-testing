### Module for testing USE_WEAK_MESSAGE_DIGEST (UWMD) mutator

#### Description

Use weak message digest (UWMD). Context: message
digests, or hashing functions, are very often used to assure the
integrity of received data. However, some hash functions are
weak because of their high collision degree: in this case, for a
hashed string, a malicious user can easily craft another string
producing the same hash. Goal: the UWMD operator introduces
a vulnerability in integrity checking of received data by using
a weak hash function (i.e., MD5). Implementation: it identifies
hash function calls and replaces them by MD5 hashing.

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
