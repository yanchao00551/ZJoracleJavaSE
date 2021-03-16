package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties settings = new Properties();
		try {
			settings.load(new FileInputStream("d:\\count.txt"));
		}catch(Exception e) {
			settings.setProperty("count", new Integer(0).toString());
		}
		int c = Integer.parseInt(settings.getProperty("count")) + 1;
		System.out.println("���Ǳ������" + c + "�α�ʹ��");
		
		settings.put("count", new Integer(c).toString());
		
		try {
			settings.store(new FileOutputStream("d:\\count.txt"), "PropertiesFile use");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}


}
