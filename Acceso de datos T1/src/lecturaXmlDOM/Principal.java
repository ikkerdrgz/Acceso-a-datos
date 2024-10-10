/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecturaXmlDOM;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import org.xml.sax.SAXException;
/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        //Crear el objeto Document con el archivo xml
        Document document = builder.parse(new File("empleados.xml"));
        //Validar la estructura del documento. Muy importante
        document.getDocumentElement().normalize();
        //Extraer el nodo/elemento raiz
        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());
        //Examinar los atributos, los empleados
        NodeList nList = document.getElementsByTagName("empleado");
        System.out.println("============================");
        
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node node = nList.item(temp);
            System.out.println("");
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
                System.out.println("Empleado id : " + eElement.getAttribute("id"));
                System.out.println("Nombre : " + eElement.getElementsByTagName("nombre").item(0).getTextContent());
                System.out.println("Apellidos : " + eElement.getElementsByTagName("apellidos").item(0).getTextContent());
                System.out.println("Ciudad : " + eElement.getElementsByTagName("ciudad").item(0).getTextContent());
            }
        }
    }
}
