package Expert;

import Verbes.Groupe1.VerbeGroupe1G;
import Verbes.Verbe;

public class ExpertVerbe2Ger extends ExpertEnsemble {

	public ExpertVerbe2Ger(ExpertEnsemble e) {
		super(e);
	}

	public Verbe resoudre2(String s) {
		try {
			return new VerbeGroupe1G(s);
		} catch (IllegalArgumentException e) {
			return null;
		}
	}
	
}
