package Verbes.Groupe3;

import Verbes.Verbe;

public class VerbeGroupe3Indre extends Verbe{
	
	public VerbeGroupe3Indre(String v) {
		super(v);
	}
	
	public String getFin() {
		return "indre";
	}


	public String terminaison1erePersonneSingulierIndicatifPresent() {
		return avantTerminaisonSingulierIndicatifPresent() + "ins";
	}

	public String terminaison2emePersonneSingulierIndicatifPresent() {
		return avantTerminaisonSingulierIndicatifPresent() + "ins";
	}

	public String terminaison3emePersonneSingulierIndicatifPresent() {
		return avantTerminaisonSingulierIndicatifPresent() + "int";
	}


	public String avantTerminaisonSingulierIndicatifPresent() { return ""; }

	public String avantTerminaison1erePersonnePlurielIndicatifPresent() {
		return "ign";
	}
	
	public String avantTerminaison2_3emePersonnePlurielIndicatifPresent() {
		return "ign";
	}

}
