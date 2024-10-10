/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actualizarXml;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerConfigurationException, TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        
        Document document = builder.parse(new File("empleados.xml"));
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        
        document.getDocumentElement().normalize();
        
        Element root = document.getDocumentElement();
        
        NodeList nList = document.getElementsByTagName("empleado");
        
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node node = nList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
                
                String id = eElement.getAttribute("id");
                String nombre = eElement.getElementsByTagName("nombre").item(0).getTextContent();
                String apellido = eElement.getElementsByTagName("apellidos").item(0).getTextContent();
                String ciudad = eElement.getElementsByTagName("ciudad").item(0).getTextContent();
                
                empleados.add(new Empleado(id,nombre,apellido,ciudad));
            }
        }
        
        Empleado empleadoNuevo = new Empleado("444","Iker","Rodríguez","Fuenlabrada");
        empleados.add(empleadoNuevo);
        
        Document doc = builder.newDocument();
        String nombreFichero = "empleadosConArrays";
        
        Element rootElement = doc.createElement("empleados");
        doc.appendChild(rootElement);
        
        for(Empleado e : empleados) {
            Element modulo = doc.createElement("empleado");
            modulo.setAttribute("id", e.getId());
            rootElement.appendChild(modulo);
            
            Element nombre = doc.createElement("nombre");
            nombre.appendChild(doc.createTextNode(e.getNombre()));
            modulo.appendChild(nombre);
            
            Element apellidos = doc.createElement("apellidos");
            apellidos.appendChild(doc.createTextNode(e.getApellido()));
            modulo.appendChild(apellidos);
            
            Element ciudad = doc.createElement("ciudad");
            ciudad.appendChild(doc.createTextNode(e.getCiudad()));
            modulo.appendChild(ciudad);
        }
        
        for(Empleado e : empleados) {
            System.out.println(e.toString());
        }
        
        TransformerFactory transformerFactory = TransformerFactory.newDefaultInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new FileOutputStream(nombreFichero + ".xml"));
        transformer.transform(source, result);
        System.out.println("Datos actualizados en el archivo XML");
    }
}
