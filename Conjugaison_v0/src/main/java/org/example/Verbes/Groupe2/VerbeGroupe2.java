package org.example.Verbes.Groupe2;
import org.example.Verbes.Verbe;

public class VerbeGroupe2 extends Verbe{

	public VerbeGroupe2(String v) {
		super(v);
	}
	
	public String getFin() {
		return "ir";
	}

	
	public String terminaison1erePersonneSingulierIndicatifPresent() {
		return avantTerminaisonSingulierIndicatifPresent() + "is";
	}

	public String terminaison2emePersonneSingulierIndicatifPresent() {
		return avantTerminaisonSingulierIndicatifPresent() + "is";
	}

	public String terminaison3emePersonneSingulierIndicatifPresent() {
		return avantTerminaisonSingulierIndicatifPresent() + "it";
	}

	public String avantTerminaisonSingulierIndicatifPresent() {
		return "";
	}
	
	public String avantTerminaison1erePersonnePlurielIndicatifPresent() {
		return "iss";
	}
	
	public String avantTerminaison2_3emePersonnePlurielIndicatifPresent() {
		return "iss";
	}


	//------------------------------------------------//

	public String avantTerminaisonIndicatifFutur() { return getFin(); }

	//------------------------------------------------//


	public String terminaisonIndicatifPasseCompose() {
		return avantTerminaisonIndicatifPasseCompose() + "i";
	}

	public String avantTerminaisonIndicatifPasseCompose() { return ""; }

}
