package Verbes.Groupe2;
import Verbes.Verbe;

public class VerbeGroupe2 extends Verbe{

	public VerbeGroupe2(String v) {
		super(v);
	}
	
	public String getFin() {
		return "ir";
	}


	public String avantTerminaison1erePersonneSingulier() {
		return "";
	}
	
	public String terminaison1erePersonneSingulierIndicatifPresent() {
		return avantTerminaison1erePersonneSingulier() + "is";
	}

	
	public String avantTerminaison2emePersonneSingulier() {
		return "";
	}

	public String terminaison2emePersonneSingulierIndicatifPresent() {
		return avantTerminaison2emePersonneSingulier() + "is";
	}
	
	
	public String avantTerminaison3emePersonneSingulier() {
		return "";
	}

	public String terminaison3emePersonneSingulierIndicatifPresent() {
		return avantTerminaison3emePersonneSingulier() + "it";
	}
	
	
	public String avantTerminaison1erePersonnePluriel() {
		return "iss";
	}
	
	public String avantTerminaison2emePersonnePluriel() {
		return "iss";
	}

}
