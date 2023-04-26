package Expert;

import Verbes.Groupe3.VerbeGroupe3Indre;
import Verbes.Verbe;

public class ExpertVerbe6Indre extends ExpertEnsemble {

	public ExpertVerbe6Indre(ExpertEnsemble e) {
		super(e);
	}

	public Verbe resoudre2(String s) {
		try {
			return new VerbeGroupe3Indre(s);
		} catch (IllegalArgumentException e) {
			return null;
		}
	}
	
}
