package Verbes.Groupe3;

import Verbes.Verbe;
	
public class VerbeGroupe3Aitre extends Verbe{

	public VerbeGroupe3Aitre(String v) {
		super(v);
	}

	public String getFin() {
		return "aitre";
	}


	public String terminaison1erePersonneSingulierIndicatifPresent() {
		return avantTerminaison1erePersonneSingulierIndicatifPresent() + "ais";
	}

	public String terminaison2emePersonneSingulierIndicatifPresent() {
		return avantTerminaison2emePersonneSingulierIndicatifPresent() + "ais";
	}

	public String terminaison3emePersonneSingulierIndicatifPresent() {
		return avantTerminaison3emePersonneSingulierIndicatifPresent() + "aît";
	}


	public String avantTerminaison1erePersonneSingulierIndicatifPresent() {
		return "";
	}

	public String avantTerminaison2emePersonneSingulierIndicatifPresent() {
		return "";
	}

	public String avantTerminaison3emePersonneSingulierIndicatifPresent() {
		return "";
	}

	public String avantTerminaison1erePersonnePlurielIndicatifPresent() {
		return "aiss";
	}
	
	public String avantTerminaison2emePersonnePlurielIndicatifPresent() {
		return "aiss";
	}

	public String avantTerminaison3emePersonnePlurielIndicatifPresent() {
		return "aiss";
	}

}
