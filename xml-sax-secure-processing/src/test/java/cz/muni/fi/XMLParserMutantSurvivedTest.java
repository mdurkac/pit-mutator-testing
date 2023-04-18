package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;

public class XMLParserMutantSurvivedTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 3/4 (75%)
     >> Generated 1 mutations Killed 0 (0%)
     >> Mutations with no coverage 0. Test strength 0%
     >> Ran 2 tests (2 tests per mutation)
     */
    @Test
    public void test_mutantKilled() throws ParserConfigurationException, SAXException {
        SAXParser parser = XMLParserWrapper.newSAXParser(false);
        Assert.assertFalse(parser.getXMLReader().getFeature("http://javax.xml.XMLConstants/feature/secure-processing"));
    }
}
