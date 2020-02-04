package uf1;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBSerilization2 {

	public static void main(String[] args) {
		
		File xmlFile = new File("cinemes.xml");
		 
		JAXBContext jaxbContext;
		try
		{
		    jaxbContext = JAXBContext.newInstance(Dataroot2.class);              
		 
		    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		 
		    Dataroot2 cinemes = (Dataroot2) jaxbUnmarshaller.unmarshal(xmlFile);
		     
		    System.out.println(cinemes);
		}
		catch (JAXBException e) 
		{
		    e.printStackTrace();
		}

	}

}
