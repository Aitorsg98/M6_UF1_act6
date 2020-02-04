package uf1;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Dataroot {
	
private Cinemes[] cinemes; 
	
	public Cinemes[] getCinemes() {
		return cinemes;
	}
	public void setCinemes(Cinemes[] cinemes) {
		this.cinemes = cinemes;
	}
 
}
