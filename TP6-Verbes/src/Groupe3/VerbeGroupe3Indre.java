package Groupe3;

import Main.Verbe;

public class VerbeGroupe3Indre extends Verbe{
	
	public VerbeGroupe3Indre(String v) {
		super(v);
	}
	
	public String getFin() {
		return "indre";
	}

	public String terminaison1erePersonneSingulier() {
		return "ins";
	}

	public String avantTerminaison1erePersonnePluriel() {
		return "ign";
	}

	public String avantTerminaisonParticipePresent() {
		return "ign";
	}

	public String terminaisonParticipePasse() {
		return "int";
	}	
}
