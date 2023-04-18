package cz.muni.fi;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class XMLParserWrapper {

    public static SAXParser newSAXParser(boolean enable) throws ParserConfigurationException, SAXException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", enable);
        return factory.newSAXParser();
    }
}