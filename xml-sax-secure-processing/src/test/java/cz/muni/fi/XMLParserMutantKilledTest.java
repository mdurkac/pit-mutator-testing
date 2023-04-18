package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;

public class XMLParserMutantKilledTest {

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 3/4 (75%)
     >> Generated 1 mutations Killed 1 (100%)
     >> Mutations with no coverage 0. Test strength 100%
     >> Ran 2 tests (2 tests per mutation)
     */
    @Test
    public void test_mutantKilled() throws ParserConfigurationException, SAXException {
        SAXParser parser = XMLParserWrapper.newSAXParser(true);
        Assert.assertTrue(parser.getXMLReader().getFeature("http://javax.xml.XMLConstants/feature/secure-processing"));
    }
}
