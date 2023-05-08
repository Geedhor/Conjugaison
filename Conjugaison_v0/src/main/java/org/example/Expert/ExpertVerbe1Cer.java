package org.example.Expert;

import org.example.Verbes.Groupe1.VerbeGroupe1C;
import org.example.Verbes.Verbe;

public class ExpertVerbe1Cer extends ExpertEnsemble {

	public ExpertVerbe1Cer(ExpertEnsemble e) {
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
