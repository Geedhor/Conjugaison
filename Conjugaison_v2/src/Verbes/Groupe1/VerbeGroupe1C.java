package Verbes.Groupe1;

public class VerbeGroupe1C extends VerbeGroupe1{

	public VerbeGroupe1C(String v) {
		super(v);
	}

	public String getFin() {
		return "cer";
	}


	public String avantTerminaisonSingulierIndicatifPresent() {
		return "c";
	}
	
	public String avantTerminaison1erePersonnePlurielIndicatifPresent() {
		return "ç";
	}
	
	public String avantTerminaison2_3emePersonnePlurielIndicatifPresent() {
		return "c";
	}

	public String avantTerminaisonIndicatifPasseCompose() { return "c"; }

}
