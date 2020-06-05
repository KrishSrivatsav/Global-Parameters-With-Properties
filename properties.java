package GlobalParameters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class properties {
	
	public static void main(String[] args) throws IOException 
	{
		
		//Creating a Properties method obj..
		//import properties..
		Properties prop = new Properties();
		
		//Creating the file method to read the file...
		//And import it..
		FileInputStream fis = new FileInputStream("C:\\Users\\Krish\\eclipse-workspace\\CoreJavaWithTestngAsoociatedConcepts\\src\\GlobalParameters\\Data.properties");
		
		//Load the file read..
		//Add throws Exception
		prop.load(fis);
		
		//To print in console...
		System.out.println(prop.getProperty("Browser"));
		System.out.println(prop.getProperty("Url"));
		
		//TO change the browser Chrome to IE...
		prop.setProperty("Browser", "IE");
		System.out.println(prop.getProperty("Browser"));
		
		//To write a file..
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Krish\\eclipse-workspace\\CoreJavaWithTestngAsoociatedConcepts\\src\\GlobalParameters\\Data.properties");
		prop.store(fos, null);
		
	}

}
