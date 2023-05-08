package org.example.Expert;

import org.example.Conjugaison.Conjugaison;
import org.example.Conjugaison.Indicatif.ConjugaisonIndicatifFutur;


public class ExpertConjugaisonIndFut extends ExpertEnsemble {

    public ExpertConjugaisonIndFut(ExpertEnsemble e){ super(e); }

    public Conjugaison resoudre2(String s) {
        try {
            return new ConjugaisonIndicatifFutur(s);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
