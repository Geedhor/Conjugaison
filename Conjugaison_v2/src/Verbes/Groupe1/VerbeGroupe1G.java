package Verbes.Groupe1;

public class VerbeGroupe1G extends VerbeGroupe1{

	public VerbeGroupe1G(String v) {
		super(v);
	}
	
	public String avantTerminaison1erePersonneSingulierIndicatifPresent() {
		return "g";
	}

	public String avantTerminaison2emePersonneSingulierIndicatifPresent() {
		return "g"; 
	}
	
	public String avantTerminaison3emePersonneSingulierIndicatifPresent() {
		return "g";
	}
	
	public String avantTerminaison1erePersonnePlurielIndicatifPresent() {
		return "ge";
	}
	
	public String avantTerminaison2emePersonnePlurielIndicatifPresent() {
		return "g";
	}

	
	public String getFin() {
		return "ger";
	}
}
