package Verbes.Groupe3;

import Verbes.Verbe;
	
public class VerbeGroupe3Aitre extends Verbe{

	public VerbeGroupe3Aitre(String v) {
		super(v);
	}

	public String getFin() {
		return "aitre";
	}

	public String avantTerminaison1erePersonneSingulier() {
		return "";
	}

	public String terminaison1erePersonneSingulier() {
		return avantTerminaison1erePersonneSingulier() + "ais";
	}

	
	public String avantTerminaison2emePersonneSingulier() {
		return "";
	}

	public String terminaison2emePersonneSingulier() {
		return avantTerminaison2emePersonneSingulier() + "ais";
	}
	
	
	public String avantTerminaison3emePersonneSingulier() {
		return "";
	}

	public String terminaison3emePersonneSingulier() {
		return avantTerminaison3emePersonneSingulier() + "aît";
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
