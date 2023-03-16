package main.java.org.example.Verbe.SearchVerbe;

import org.example.Verbe.Verbe;
import org.example.VerbeGroupe3.VerbeGroupe3Indre;

public class Groupe3INDRE extends TrouverGroupe{
    public Groupe3INDRE(TrouverGroupe groupe3AITRE) {
        super(groupe3AITRE);
    }

    @Override
    protected Verbe SearchGroupe(String string) {
        if(string.endsWith("indre")){
            return new VerbeGroupe3Indre(string);
        }
        return null;
    }
}
