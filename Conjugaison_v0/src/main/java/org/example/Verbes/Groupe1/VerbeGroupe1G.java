package org.example.Verbes.Groupe1;

public class VerbeGroupe1G extends VerbeGroupe1{

	public VerbeGroupe1G(String v) {
		super(v);
	}

	public String getFin() {
		return "ger";
	}

	
	public String avantTerminaisonSingulierIndicatifPresent() {
		return "g";
	}
	
	public String avantTerminaison1erePersonnePlurielIndicatifPresent() {
		return "ge";
	}
	
	public String avantTerminaison2_3emePersonnePlurielIndicatifPresent() {
		return "g";
	}

	public String avantTerminaisonIndicatifPasseCompose() { return "g"; }

}
