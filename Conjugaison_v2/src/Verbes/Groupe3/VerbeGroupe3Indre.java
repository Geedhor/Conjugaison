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

	public String terminaison1erePersonneSingulierIndicatifPresent() {
		return avantTerminaison1erePersonneSingulier() + "ins";
	}


	public String avantTerminaison2emePersonneSingulier() {
		return "";
	}

	public String terminaison2emePersonneSingulierIndicatifPresent() {
		return avantTerminaison2emePersonneSingulier() + "ins";
	}
	
	
	public String avantTerminaison3emePersonneSingulier() {
		return "";
	}

	public String terminaison3emePersonneSingulierIndicatifPresent() {
		return avantTerminaison3emePersonneSingulier() + "int";
	}

	
	public String avantTerminaison1erePersonnePluriel() {
		return "ign";
	}

}
