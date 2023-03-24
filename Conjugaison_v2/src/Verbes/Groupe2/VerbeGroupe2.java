package Verbes.Groupe2;
import Verbes.Verbe;

public class VerbeGroupe2 extends Verbe{

	public VerbeGroupe2(String v) {
		super(v);
	}
	
	public String getFin() {
		return "ir";
	}

	
	public String terminaison1erePersonneSingulierIndicatifPresent() {
		return avantTerminaison1erePersonneSingulierIndicatifPresent() + "is";
	}

	public String terminaison2emePersonneSingulierIndicatifPresent() {
		return avantTerminaison2emePersonneSingulierIndicatifPresent() + "is";
	}

	public String terminaison3emePersonneSingulierIndicatifPresent() {
		return avantTerminaison3emePersonneSingulierIndicatifPresent() + "it";
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
		return "iss";
	}
	
	public String avantTerminaison2emePersonnePlurielIndicatifPresent() {
		return "iss";
	}

	public String avantTerminaison3emePersonnePlurielIndicatifPresent() { return "iss"; }

}
