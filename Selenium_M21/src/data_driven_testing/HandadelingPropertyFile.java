package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class HandadelingPropertyFile {

	public static void main(String[] args) throws IOException {
		//FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//data//commandata.properties");
		
		FileInputStream file=new FileInputStream("./data/commandata.properties");
		Properties p=new Properties();
		p.load(file);
		
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("pwd"));
		
		Set<String> propertyName = p.stringPropertyNames();
		System.out.println(propertyName);
		
		Set<Object> properyKeySet = p.keySet();
		System.out.println(properyKeySet);
		
		Collection<Object> vaue = p.values();
		System.out.println(vaue);
		
		
	}

}
