package Verbes.Groupe3;

import Verbes.Verbe;

public class VerbeGroupe3Indre extends Verbe{
	
	public VerbeGroupe3Indre(String v) {
		super(v);
	}
	
	public String getFin() {
		return "indre";
	}

	public String avantTerminaison1erePersonneSingulier() {
		return "";
	}

	public String terminaison1erePersonneSingulier() {
		return avantTerminaison1erePersonneSingulier() + "ins";
	}

	
	public String avantTerminaison2emePersonneSingulier() {
		return avantTerminaison2emePersonneSingulier() + "";
	}

	public String terminaison2emePersonneSingulier() {
		return "ins";
	}
	
	
	public String avantTerminaison3emePersonneSingulier() {
		return "";
	}

	public String terminaison3emePersonneSingulier() {
		return avantTerminaison3emePersonneSingulier() + "int";
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
