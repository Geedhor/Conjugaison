package Groupe1;

public class VerbeGroupe1C extends VerbeGroupe1{

	public VerbeGroupe1C(String v) {
		super(v);
	}
	
	public String avantTerminaison1erePersonneSingulier() {
		return "c";
	}
	
	public String avantTerminaison1erePersonnePluriel() {
		return "�";	
	}
	
	public String avantTerminaisonParticipePresent() {
		return "�";
	}
	
	public String terminaisonParticipePasse() {
		return "c";
	}
	
	public String getFin() {
		return "cer";
	}
}
