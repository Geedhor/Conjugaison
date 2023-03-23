package Verbes.Groupe1;
import Verbes.Verbe;

public class VerbeGroupe1 extends Verbe{

	public VerbeGroupe1(String v) {
		super(v);
	}

	public String getFin() {
		return "er";
	}

	//---------------------------------------------//

	public String avantTerminaison1erePersonneSingulierIndicatifPresent() {
		return ""; 
	}

	public String terminaison1erePersonneSingulierIndicatifPresent() {
		return avantTerminaison1erePersonneSingulierIndicatifPresent() + "e";
	}

	
	public String avantTerminaison2emePersonneSingulierIndicatifPresent() {
		return ""; 
	}
	
	public String terminaison2emePersonneSingulierIndicatifPresent() {
		return avantTerminaison2emePersonneSingulierIndicatifPresent() + "es";
	}
	
	
	public String avantTerminaison3emePersonneSingulierIndicatifPresent() {
		return "";
	}

	public String terminaison3emePersonneSingulierIndicatifPresent() {
		return avantTerminaison3emePersonneSingulierIndicatifPresent() + "e";
	}


	public String avantTerminaison1erePersonnePlurielIndicatifPresent() {
		return "";
	}
	
	public String avantTerminaison2emePersonnePlurielIndicatifPresent() {
		return "";
	}

}
