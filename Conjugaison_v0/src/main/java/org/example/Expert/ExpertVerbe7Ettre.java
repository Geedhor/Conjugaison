package org.example.Expert;

import org.example.Verbes.Groupe3.VerbeGroupe3Ettre;
import org.example.Verbes.Groupe3.VerbeGroupe3Oudre;
import org.example.Verbes.Verbe;

public class ExpertVerbe7Ettre extends ExpertEnsemble {

    public ExpertVerbe7Ettre(ExpertEnsemble e) {
        super(e);
    }

    public Verbe resoudre2(String s) {
        try {
            return new VerbeGroupe3Ettre(s);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

}
