package main.java.org.example.Verbe.SearchVerbe;

import org.example.Verbe.Verbe;
import org.example.VerbeGroupe3.VerbeGroupe3Aitre;

public class Groupe3AITRE extends TrouverGroupe {
    public Groupe3AITRE(TrouverGroupe groupe2IR) {
        super(groupe2IR);
    }

    @Override
    protected Verbe SearchGroupe(String string) {

        try{
            return new VerbeGroupe3Aitre(string);
        }
        catch (Exception e){
            return null;
        }
    }
}
