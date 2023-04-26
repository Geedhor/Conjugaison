package Expert;

import Verbes.Groupe2.VerbeGroupe2;
import Verbes.Verbe;

public class ExpertVerbe4Ir extends ExpertEnsemble {

	public ExpertVerbe4Ir(ExpertEnsemble e) {
		super(e);
	}

	public Verbe resoudre2(String s) {
		try {
			return new VerbeGroupe2(s);
		} catch (IllegalArgumentException e) {
			return null;
		}
	}
	
}
