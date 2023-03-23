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

	public String terminaison1erePersonneSingulierIndicatifPresent() {
		return avantTerminaison1erePersonneSingulier() + "ais";
	}

	
	public String avantTerminaison2emePersonneSingulier() {
		return "";
	}

	public String terminaison2emePersonneSingulierIndicatifPresent() {
		return avantTerminaison2emePersonneSingulier() + "ais";
	}
	
	
	public String avantTerminaison3emePersonneSingulier() {
		return "";
	}

	public String terminaison3emePersonneSingulierIndicatifPresent() {
		return avantTerminaison3emePersonneSingulier() + "aît";
	}

	
	public String avantTerminaison1erePersonnePluriel() {
		return "aiss";
	}
	
	public String avantTerminaison2emePersonnePluriel() {
		return "aiss";
	}

}
