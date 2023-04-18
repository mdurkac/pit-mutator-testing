package cz.muni.fi;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.io.StringReader;

public class XMLReaderWrapper {

    public static XMLReader newSAXParser(boolean enable) throws SAXException {
        XMLReader xmlReader = XMLReaderFactory.createXMLReader();
        xmlReader.setFeature("http://apache.org/xml/features/disallow-doctype-decl", enable);
        return xmlReader;
    }

    public static void parse(XMLReader reader, String XML) throws SAXException, IOException {
        reader.parse(new InputSource(new StringReader(XML)));
    }
}