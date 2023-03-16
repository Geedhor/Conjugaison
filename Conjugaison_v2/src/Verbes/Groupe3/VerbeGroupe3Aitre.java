package Verbes.Groupe3;

import Verbes.Verbe;
	
public class VerbeGroupe3Aitre extends Verbe{

	public VerbeGroupe3Aitre(String v) {
		super(v);
	}

	public String getFin() {
		return "aitre";
	}
	
	public String terminaison1erePersonneSingulier() {
		return "ais";
	}

	public String avantTerminaison1erePersonnePluriel() {
		return "aiss";
	}

	public String avantTerminaisonParticipePresent() {
		return "aiss";
	}

	public String terminaisonParticipePasse() {
		return "u";
	}
}
