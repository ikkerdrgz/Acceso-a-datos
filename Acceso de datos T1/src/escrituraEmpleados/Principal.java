/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escrituraEmpleados;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

/**
 *
 * @author FP
 */
public class Principal {
    public static void main(String[] args) throws ParserConfigurationException, TransformerConfigurationException, FileNotFoundException, TransformerException {
        String nombreFichero = "empleados2";
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.newDocument();
        
        Element root = doc.createElement("empleados");
        doc.appendChild(root);
        
        Element modulo = doc.createElement("empleado");
        modulo.setAttribute("id", "111");
        root.appendChild(modulo);
        
        Element nombreEmpleado = doc.createElement("nombre");
        nombreEmpleado.appendChild(doc.createTextNode("Marc"));
        modulo.appendChild(nombreEmpleado);
        
        Element apellidoEmpleado = doc.createElement("apellido");
        apellidoEmpleado.appendChild(doc.createTextNode("Zuckerberg"));
        modulo.appendChild(apellidoEmpleado);
        
        Element ciudadEmpleado = doc.createElement("ciudad");
        ciudadEmpleado.appendChild(doc.createTextNode("Florida"));
        modulo.appendChild(ciudadEmpleado);
        
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new FileOutputStream(nombreFichero + ".xml"));
        transformer.transform(source, result);
        System.out.println("Datos actualizados en el archivo XML");
    }
}