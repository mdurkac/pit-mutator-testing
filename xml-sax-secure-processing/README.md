# Demonstration of `XML_PARSER_VULNERABLE_TO_DOS_WITH_SAX` mutator

## Make XML parser vulnerable to XML Entity Expansion attack (XMLPVXEE)

Goal: the `XMLPVXEE` operator introduces a vulnerability in external XML parsers to expose the application to DOS attacks.

Implementation: the operator disables standard security options of the XML parsers just before the XML parser begins parsing. It performs this task by identifying methods used on standard XML Java parsers, like `XMLReader` or `SAXParser` instances.

## Content

Project contains an example of a test that on its own kills the mutator and a test that on its own does not kill the mutator.

## Source

1) LOISE, Thomas; DEVROEY, Xavier; PERROUIN, Gilles; PAPADAKIS, Mike; HEYMANS, Patrick. Towards security-aware mutation testing. In: 2017 IEEE International Conference on Software Testing, Verification and Validation Workshops (ICSTW). IEEE, 2017, pp. 97–102.

2) https://github.com/Iotho/pitest-sec