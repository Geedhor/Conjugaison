package Verbes.Groupe1;
import Verbes.Verbe;

public class VerbeGroupe1 extends Verbe{

	public VerbeGroupe1(String v) {
		super(v);
	}

	public String getFin() {
		return "er";
	}

	public String avantTerminaison1erePersonneSingulier() { return ""; }

	public String terminaison1erePersonneSingulier() {
		return "e";
	}

	public String avantTerminaison2emePersonneSingulier() { return ""; }

	public String terminaison2emePersonneSingulier() { return "es"; }


	public String avantTerminaison1erePersonnePluriel() { return ""; }
	
	public String avantTerminaisonParticipePresent() { return ""; }
	
	public String terminaisonParticipePasse() { return "é"; }

}
