/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xmlPrueba;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import org.xml.sax.SAXException;
/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) throws SAXException, ParserConfigurationException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        
        Document document = builder.parse(new File("taburetes.xml"));
        
        document.getDocumentElement().normalize();
        
        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());
        
        NodeList nList = document.getElementsByTagName("taburete");
        System.out.println("-,-");
        
        for (int i = 0; i < nList.getLength(); i++) {
            Node node = nList.item(i);
            System.out.println("");
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
                System.out.println("Registro " + (i+1));
                System.out.println("Nombre : " + eElement.getElementsByTagName("nombre").item(0).getTextContent());
                System.out.println("Giro " + eElement.getElementsByTagName("giro").item(0).getTextContent());
                System.out.println("Base y pie " + eElement.getElementsByTagName("baseYpie").item(0).getTextContent());
                System.out.println("Reposapiés " + eElement.getAttribute("reposapies"));
                System.out.println("Protección " + eElement.getElementsByTagName("proteccion").item(0).getTextContent());
                System.out.println("Acabado " + eElement.getElementsByTagName("acabado").item(0).getTextContent());
                System.out.println("Asiento " + eElement.getElementsByTagName("asiento").item(0).getTextContent());
                System.out.println("Altural total : " + eElement.getAttribute("altura"));
                System.out.println("Asiento : " + eElement.getElementsByTagName("asiento2").item(0).getTextContent());
                System.out.println("Base : " + eElement.getElementsByTagName("base").item(0).getTextContent());
                System.out.println("Distancia reposapiés al asiento : " + eElement.getElementsByTagName("distancia").item(0).getTextContent());
                System.out.println("Pie : " + eElement.getElementsByTagName("pie").item(0).getTextContent());
                System.out.println("Peso : " + eElement.getElementsByTagName("peso").item(0).getTextContent());
                System.out.println("Material : " + eElement.getElementsByTagName("material").item(0).getTextContent());
               
                if (i != nList.getLength()-1) {
                    System.out.println(";;");
                } else {
                    System.out.println(";;;;");
                }
            }
        }
    }
}
