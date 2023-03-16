package Expert;

import Verbes.Groupe1.VerbeGroupe1C;
import Verbes.Verbe;

public class ExpertVerbe1Cer extends ExpertVerbe{

	public ExpertVerbe1Cer(ExpertVerbe e) {
		super(e);
	}

	public Verbe resoudre2(String s) {
		try {
			return new VerbeGroupe1C(s);
		} catch (IllegalArgumentException e) {
			return null;
		}
	}
}
