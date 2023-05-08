package Serveur;

import Conjugaison.Conjugaison;
import Conjugaison.Indicatif.ConjugaisonIndicatifPasseCompose;
import Expert.*;
import Verbes.Verbe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class MultiThread extends Thread {

    private Socket _s; // recevra le socket liant au client

    BufferedReader fluxEntrant;	PrintStream fluxSortant;


    private int _numClient=0;

    MultiThread(Socket s, ThreadGroup groupe, int noConnexion) throws IOException {
        super(groupe, "MultiThread");

        this._numClient = noConnexion;
        _s = s;

        fluxEntrant = new BufferedReader(new InputStreamReader(this._s.getInputStream()));
        fluxSortant = new PrintStream(this._s.getOutputStream());
    }

    private static int countLines(String str){
        String[] lines = str.split("\r\n|\r|\n");
        return  lines.length;
    }


    @Override
    public void run() {

        ExpertEnsemble v8 = new ExpertVerbe8Oudre(null);
        ExpertEnsemble v7 = new ExpertVerbe7Ettre(v8);
        ExpertEnsemble v6 = new ExpertVerbe6Indre(v7);
        ExpertEnsemble v5 = new ExpertVerbe5Aitre(v6);
        ExpertEnsemble v4 = new ExpertVerbe4Ir(v5);
        ExpertEnsemble v3 = new ExpertVerbe3Er(v4);
        ExpertEnsemble v2 = new ExpertVerbe2Ger(v3);
        ExpertEnsemble v1 = new ExpertVerbe1Cer(v2);
        Expert expertV = v1;

        ExpertEnsemble c3 = new ExpertConjugaisonIndFut(null);
        ExpertEnsemble c2 = new ExpertConjugaisonIndPaC(c3);
        ExpertEnsemble c1 = new ExpertConjugaisonIndPre(c2);
        Expert expertC = c1;
        //------------------------//
        try{


            while (true){

                /*String verbe = fluxEntrant.readLine();
                System.out.println(" le client n° "+this._numClient+" a envoyé : " + verbe);
                verbe = verbe.trim();
                */

                String verbe = fluxEntrant.readLine();
                String [] reception = verbe.split(", ");
                System.out.println(" le client n° "+this._numClient+" a envoyé : " + verbe);
                verbe = reception[0].trim();


                //String temps = "Indicatif Present";
                String temps = reception[1];

                Verbe res = (Verbe) expertV.resoudre(verbe);
                Conjugaison c = (Conjugaison) expertC.resoudre(temps);

                String texte;
                if(res==null){
                    texte = "Le verbe '" + verbe + "' n'est pas géré";
                }else{
                    if(c==null){
                        texte = "Ce temps n'est pas reconnu";
                    }else{
                        texte = c.conjuger(res);
                    }
                }

                int nbline = countLines(texte);

                fluxSortant.println(nbline + "\n" + texte);
                sleep(5);
            }

        } catch(InterruptedException erreur) {}
            // le thread s'arrête
        catch(IOException erreur) {
            System.err.println(" on ne peut pas lire sur le socket provenant du client");
        }
    }
}
