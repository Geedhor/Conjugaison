package Verbes.Groupe1;

public class VerbeGroupe1C extends VerbeGroupe1{

	public VerbeGroupe1C(String v) {
		super(v);
	}
	
	public String avantTerminaison1erePersonneSingulier() {
		return "c";
	}

	public String avantTerminaison2emePersonneSingulier() { return "c"; }
	
	public String avantTerminaison1erePersonnePluriel() {
		return "ç";
	}
	
	public String avantTerminaisonParticipePresent() {
		return "ç";
	}
	
	public String avantTerminaisonParticipePasse() {
		return "c";
	}
	
	public String getFin() {
		return "cer";
	}
}
