# Demonstration of `XML_PARSER_VULNERABLE_TO_XXE_WITH_XMLREADER` mutator

## Make XML parser vulnerable to XML eXternal Entity attack (XMLPVXXE)

Goal: the `XMLPVXXE`operator introduces a vulnerability in external XML parsers to expose the application to XXE attacks. 

Implementation: it disables standard XXE security option of the XML parsers before an XML parsing. Like the `XMLPVXEE` operator, the XMLPVXXE operator performs this by identifying methods used on standard XML Java parsers.

## Content

Project contains an example of a test that on its own kills the mutator and a test that on its own does not kill the mutator.

## Source

1) LOISE, Thomas; DEVROEY, Xavier; PERROUIN, Gilles; PAPADAKIS, Mike; HEYMANS, Patrick. Towards security-aware mutation testing. In: 2017 IEEE International Conference on Software Testing, Verification and Validation Workshops (ICSTW). IEEE, 2017, pp. 97–102.

2) https://github.com/Iotho/pitest-sec