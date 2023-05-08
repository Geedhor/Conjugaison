package org.example.Expert;

import org.example.Verbes.Groupe3.VerbeGroupe3Oudre;
import org.example.Verbes.Verbe;
import org.example.Verbes.Groupe3.VerbeGroupe3Oudre;
import org.example.Verbes.Verbe;

public class ExpertVerbe8Oudre extends ExpertEnsemble {

    public ExpertVerbe8Oudre(ExpertEnsemble e) {
        super(e);
    }

    public Verbe resoudre2(String s) {
        try {
            return new VerbeGroupe3Oudre(s);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
