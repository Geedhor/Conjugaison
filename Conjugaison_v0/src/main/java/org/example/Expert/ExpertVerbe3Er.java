package org.example.Expert;

import org.example.Verbes.Groupe1.VerbeGroupe1;
import org.example.Verbes.Verbe;

public class ExpertVerbe3Er extends ExpertEnsemble {

	public ExpertVerbe3Er(ExpertEnsemble e) {
		super(e);
	}

	public Verbe resoudre2(String s) {
		try {
			return new VerbeGroupe1(s);
		} catch (IllegalArgumentException e) {
			return null;
		}
	}
	
}
