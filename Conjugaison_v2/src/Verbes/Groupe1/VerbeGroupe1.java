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

	public String avantTerminaison1erePersonneSingulier() { 
		return ""; 
	}

	public String terminaison1erePersonneSingulierIndicatifPresent() {
		return avantTerminaison1erePersonneSingulier() + "e";
	}

	
	public String avantTerminaison2emePersonneSingulier() { 
		return ""; 
	}
	
	public String terminaison2emePersonneSingulierIndicatifPresent() {
		return avantTerminaison2emePersonneSingulier() + "es";
	}
	
	
	public String avantTerminaison3emePersonneSingulier() { 
		return "";
	}

	public String terminaison3emePersonneSingulierIndicatifPresent() {
		return avantTerminaison3emePersonneSingulier() + "e";
	}


	public String avantTerminaison1erePersonnePluriel() {
		return "";
	}

}
