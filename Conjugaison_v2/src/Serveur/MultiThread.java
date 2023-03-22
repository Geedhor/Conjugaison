package Serveur;

import Conjugaison.Conjugaison;
import Conjugaison.Indicatif.ConjugaisonIndicatifPresent;
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

        Expert expert;
        ExpertVerbe e6 = new ExpertVerbe6Indre(null);
        ExpertVerbe e5 = new ExpertVerbe5Aitre(e6);
        ExpertVerbe e4 = new ExpertVerbe4Ir(e5);
        ExpertVerbe e3 = new ExpertVerbe3Er(e4);
        ExpertVerbe e2 = new ExpertVerbe2Ger(e3);
        ExpertVerbe e1 = new ExpertVerbe1Cer(e2);
        expert = e1;
        //------------------------//
        try{


            while (true){

                String verbe = fluxEntrant.readLine();
                System.out.println(" le client n° "+this._numClient+" a envoyé : " + verbe);
                verbe = verbe.trim();


                Verbe res = expert.resoudre(verbe);
                Conjugaison c = new ConjugaisonIndicatifPresent();

                String texte;
                if(res==null){
                    texte = "Le verbe '" + verbe + "' n'est pas géré";
                }else{
                    texte = c.conjuger(res);
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
