package design.patterns.structural.adapter.demomotor;

import javax.xml.parsers.*;

import org.w3c.dom.*;

import java.io.*;
import java.net.URL;

class ReadXML {
    public static Object getObject() {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            URL url = ReadXML.class.getClassLoader().getResource("config-adapter.xml");
            doc = builder.parse(new File(url.getFile()));
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = "design.patterns.structural.adapter.demomotor." + classNode.getNodeValue();
            Class<?> c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}



