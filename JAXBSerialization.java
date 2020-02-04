package uf1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
 
public class JAXBSerialization {
	
	private static final String ALUMNES_XML_FILE = "cinemes.xml";
 
	public static void main(String[] args) throws JAXBException, IOException {
		
		JAXBContext context = JAXBContext.newInstance(Dataroot.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Dataroot cinemes = ompleAlumnes();
		
		//Mostrem el document XML generat por la sortida estandard
		marshaller.marshal(cinemes, System.out);
		
		FileOutputStream fos = new FileOutputStream(ALUMNES_XML_FILE);
		//guardem l'objecte serializat en un document XML
		marshaller.marshal(cinemes, fos);
		fos.close();
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		//Deserialitzem a partir de un document XML
		Dataroot cinemesAux = (Dataroot) unmarshaller.unmarshal(new File(ALUMNES_XML_FILE));
		System.out.println("********* Cinemes carregat desde fitxer XML***************");
		//Mostrem l'objeto Java obtingut
		marshaller.marshal(cinemesAux, System.out);
		
	}
	
	private static Dataroot ompleAlumnes(){
		
		String[] nomsCinemes = {"Cinemes Girona", "Cines Verdi Park", "Filmoteca de Catalunya", "Cines FULL de Cornellà de Llobregat", "CAT Cines Figueres ACEC"};
        String[] adreçesCinemes = {"C. de Girona, 173, 08025 Barcelona", "C. de Torrijos, 49, 08012 Barcelona",
        		"Pl. de Salvador Seguí, 1-9, 08001 Barcelona",
        		"Av. Baix Llobregat, s/n, Centre Comercial Splau, 08940 Cornellà de Llobregat", "Ronda Sud, 17, 17600 Figueres, Girona 17600 Figueras"};
        String[] localitatsCinemes = {"Barcelona", "Barcelona", "Barcelona", "Cornellà de Llobregat", "Figueres"};
		String[] comarquesCinemes = {"Barcelonès", "Barcelonès", "Barcelonès", "Baix Llobregat", "Alt Empordà"};
		String[] provinciesCinemes = {"BARCELONA", "BARCELONA", "BARCELONA", "BARCELONA", "GIRONA"};
		Cinemes[] ArrayCinemes = new Cinemes[5];
		
		for(int i=0; i < 5; i++){
			ArrayCinemes[i] = new Cinemes();
			ArrayCinemes[i].setNom(nomsCinemes[i]);
			ArrayCinemes[i].setAdreça(adreçesCinemes[i]);
			ArrayCinemes[i].setLocalitat(localitatsCinemes[i]);
			ArrayCinemes[i].setComarca(comarquesCinemes[i]);
			ArrayCinemes[i].setProvincia(provinciesCinemes[i]);
			ArrayCinemes[i].setId(i+1);			
		}
		
		Dataroot cinemes = new Dataroot();
		cinemes.setCinemes(ArrayCinemes);
		
		return cinemes;
	}
 
}