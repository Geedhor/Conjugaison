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

	public String terminaison1erePersonneSingulierIndicatifPresent() {
		return avantTerminaisonSingulierIndicatifPresent() + "e";
	}
	
	public String terminaison2emePersonneSingulierIndicatifPresent() {
		return avantTerminaisonSingulierIndicatifPresent() + "es";
	}

	public String terminaison3emePersonneSingulierIndicatifPresent() {
		return avantTerminaisonSingulierIndicatifPresent() + "e";
	}

	public String avantTerminaisonSingulierIndicatifPresent() { return "";}

	public String avantTerminaison1erePersonnePlurielIndicatifPresent() {
		return "";
	}
	
	public String avantTerminaison2_3emePersonnePlurielIndicatifPresent() {
		return "";
	}

}
