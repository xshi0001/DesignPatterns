package design.patterns.creational.builder.decorationdemo;

import javax.xml.parsers.*;

import org.w3c.dom.*;

import java.io.*;
import java.net.URL;

/**
 * @program: designpatterns
 * @description: 装修验收老板
 * @author: JClearLove
 * @Date: 2020/03/23 16:00
 */
public class ReadXML {



    public static Object getObject() {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            URL url = ReadXML.class.getClassLoader().getResource("config.xml");
            doc = builder.parse(new File(url.getFile()));
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = "design.patterns.creational.builder.decorationdemo." + classNode.getNodeValue();
            System.out.println("新类名：" + cName);
            Class<?> c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}

