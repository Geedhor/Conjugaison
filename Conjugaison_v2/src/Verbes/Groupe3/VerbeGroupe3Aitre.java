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
		return avantTerminaisonSingulierIndicatifPresent() + "ais";
	}

	public String terminaison2emePersonneSingulierIndicatifPresent() {
		return avantTerminaisonSingulierIndicatifPresent() + "ais";
	}

	public String terminaison3emePersonneSingulierIndicatifPresent() {
		return avantTerminaisonSingulierIndicatifPresent() + "aît";
	}


	public String avantTerminaisonSingulierIndicatifPresent() {
		return "";
	}

	public String avantTerminaison1erePersonnePlurielIndicatifPresent() {
		return "aiss";
	}
	
	public String avantTerminaison2_3emePersonnePlurielIndicatifPresent() {
		return "aiss";
	}

	//------------------------------------------------//

	public String avantTerminaisonIndicatifFutur() { return "aîtr"; }

}
