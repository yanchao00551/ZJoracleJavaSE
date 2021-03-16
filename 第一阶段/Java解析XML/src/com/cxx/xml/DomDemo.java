package com.cxx.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Dom操作xml
 * @author 10947
 *
 */
public class DomDemo {
	
	public static void element(NodeList list) {
		for(int i=0; i<list.getLength(); i++) {
			Element element = (Element) list.item(i);
			NodeList childNodes = element.getChildNodes();
			for(int j = 0; j < childNodes.getLength(); j++) {
				if(childNodes.item(j).getNodeType() == Node.ELEMENT_NODE) {
					System.out.print(childNodes.item(j).getNodeName() + ":");
					System.out.println(childNodes.item(j).getFirstChild().getNodeValue());
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//1.创建DocumentBuilderFactory 对象
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//2.创建DocumentBuilder对象
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document d = builder.parse("resources/student.xml");
		NodeList sList= d.getElementsByTagName("student");
		element(sList);
	}
	

}
