package org.example.Expert;

import org.example.Conjugaison.Conjugaison;
import org.example.Conjugaison.Indicatif.ConjugaisonIndicatifPasseCompose;

public class ExpertConjugaisonIndPaC extends ExpertEnsemble{

    public ExpertConjugaisonIndPaC(ExpertEnsemble e){ super(e); }

    public Conjugaison resoudre2(String s) {
        try {
            return new ConjugaisonIndicatifPasseCompose(s);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
