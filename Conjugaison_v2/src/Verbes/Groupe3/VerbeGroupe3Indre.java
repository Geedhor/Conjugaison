package Verbes.Groupe3;

import Verbes.Verbe;

public class VerbeGroupe3Indre extends Verbe{
	
	public VerbeGroupe3Indre(String v) {
		super(v);
	}
	
	public String getFin() {
		return "indre";
	}

	public String avantTerminaison1erePersonneSingulierIndicatifPresent() {
		return "";
	}

	public String terminaison1erePersonneSingulierIndicatifPresent() {
		return avantTerminaison1erePersonneSingulierIndicatifPresent() + "ins";
	}


	public String avantTerminaison2emePersonneSingulierIndicatifPresent() {
		return "";
	}

	public String terminaison2emePersonneSingulierIndicatifPresent() {
		return avantTerminaison2emePersonneSingulierIndicatifPresent() + "ins";
	}
	
	
	public String avantTerminaison3emePersonneSingulierIndicatifPresent() {
		return "";
	}

	public String terminaison3emePersonneSingulierIndicatifPresent() {
		return avantTerminaison3emePersonneSingulierIndicatifPresent() + "int";
	}

	
	public String avantTerminaison1erePersonnePlurielIndicatifPresent() {
		return "ign";
	}
	
	public String avantTerminaison2emePersonnePlurielIndicatifPresent() {
		return "ign";
	}

}
