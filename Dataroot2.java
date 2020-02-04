package uf1;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "dataroot")
public class Dataroot2 implements Serializable {

	private static final long serialVersionUID = 1L;

	private Cinemes2[] cinemes; 

	public Dataroot2() {
		super();
	}

	public Dataroot2(Cinemes2[] cinemes) {
		super();
		this.cinemes = cinemes;
	}

	public Cinemes2[] getCinemes() {
		return cinemes;
	}
	public void setCinemes(Cinemes2[] cinemes) {
		this.cinemes = cinemes;
	}
	
	@Override
	public String toString() {
		String resultat = "";
		for (int i = 0; i < cinemes.length; i++) {
			resultat += "Id: " + cinemes[i].getId() + " | Nom: " + cinemes[i].getNom() + " | Adreça: " + cinemes[i].getAdreça() 
					+ " | Localitat: " + cinemes[i].getLocalitat() + " | Comarca: " + cinemes[i].getComarca() + " | Provincia: "
					+ cinemes[i].getProvincia() + "\n";
		}
		return resultat;
	}
	
}
