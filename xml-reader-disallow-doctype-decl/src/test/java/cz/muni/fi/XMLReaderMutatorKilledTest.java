package cz.muni.fi;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import java.io.IOException;

public class XMLReaderMutatorKilledTest {

    private static final String XML = "<?xml version=\"1.0\"?>\n" +
            "\n" +
            "<poem xmlns=\"http://www.megginson.com/ns/exp/poetry\">\n" +
            "<title>Roses are Red</title>\n" +
            "<l>Roses are red,</l>\n" +
            "<l>Violets are blue;</l>\n" +
            "<l>Sugar is sweet,</l>\n" +
            "<l>And I love you.</l>\n" +
            "</poem>";

    /**
     - Statistics
     ================================================================================
     >> Line Coverage: 5/6 (83%)
     >> Generated 1 mutations Killed 1 (100%)
     >> Mutations with no coverage 0. Test strength 100%
     >> Ran 2 tests (2 tests per mutation)
     */
    @Test
    public void test_mutantKilled() throws SAXException, IOException {
        XMLReader reader = XMLReaderWrapper.newSAXParser(true);
        XMLReaderWrapper.parse(reader, XML);
        Assert.assertTrue(reader.getFeature("http://apache.org/xml/features/disallow-doctype-decl"));
    }
}
