package Conjugaison.Participe;

import Conjugaison.Conjugaison;
import Verbes.Verbe;

public class ConjugaisonParticipePasse extends Conjugaison {

	public String conjuger(Verbe v) {

		return v.conjugueParticipePasse();

	}
	
}
