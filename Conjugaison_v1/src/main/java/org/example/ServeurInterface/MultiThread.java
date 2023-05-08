package org.example.ServeurInterface;

import main.java.org.example.Verbe.SearchVerbe.*;
import main.java.org.example.Verbe.Verbe;
import java.io.*;
import java.net.*;
import java.util.*;

import static java.lang.Thread.sleep;

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

        EtrangerGroupe etrangerGroupe;
        TrouverGroupe groupe1ER, groupe1GER, groupe2IR, groupe3AITRE, groupe3INDRE;

        groupe1ER = new Groupe1ER(null);
        groupe1GER = new Groupe1GER(groupe1ER);
        groupe2IR = new Groupe2IR(groupe1GER);
        groupe3AITRE = new Groupe3AITRE(groupe2IR);
        groupe3INDRE = new Groupe3INDRE(groupe3AITRE);
        etrangerGroupe = groupe3INDRE;
        //************************//
        try{


            while (true){

                String verbe = fluxEntrant.readLine();
                String [] reception = verbe.split(",");
                System.out.println(" le client n° "+this._numClient+" a envoyé : " + verbe);
                verbe = reception[0].trim();



                Verbe résultat;
                résultat = etrangerGroupe.traduit(verbe);

                String texte = "Infinitif saisi: " + verbe + "\n"
                        + résultat.conjugue1erePersonneSingulier() + "\n"
                        + résultat.conjugueDeuxiemePersonneSingulier() + "\n"
                        + résultat.conjugueTroisiemePersonneSingulier() + "\n"
                        + résultat.conjugue1erePersonnePluriel() + "\n"
                        + résultat.conjugueDeuxiemePersonnePluriel() + "\n"
                        + résultat.conjugueTroisiemePersonnePluriel();

                int nbline = countLines(texte);

                fluxSortant.println(nbline + "\n" + texte);
                sleep(5);
            }

        } catch(InterruptedException erreur) { /* le thread s'arrête */}
        catch(IOException erreur) { System.err.println(" on ne peut pas lire sur le socket provenant du client");}

    }
}
