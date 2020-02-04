package uf1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Cinemes")
public class Cinemes {

	private int id;	
	private String nom;
	private String adreça;
	private String localitat;
	private String comarca;
	private String provincia;

	@XmlAttribute(name="id")        
	public int getId() {
		return this.id;
	}        

	public void setId(int id) {
		this.id = id;
	}

	//@XmlAttribute(name="Nom")    
	public String getNom() {
		return nom;
	}        

	public void setNom(String nom) {
		this.nom = nom;
	}

	//@XmlAttribute(name="adreça")    
	public String getAdreça() {
		return adreça;
	}
	public void setAdreça(String adreça) {
		this.adreça = adreça;
	}        

	//@XmlAttribute(name="localitat")    
	public String getLocalitat() {
		return localitat;
	}
	public void setLocalitat(String localitat) {
		this.localitat = localitat;
	}
	
	//@XmlAttribute(name="comarca")    
	public String getComarca() {
		return comarca;
	}

	public void setComarca(String comarca) {
		this.comarca = comarca;
	}

	//@XmlAttribute(name="provincia")    
	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}        
	
}
