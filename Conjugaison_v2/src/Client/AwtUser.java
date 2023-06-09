package Client;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class AwtUser extends Frame{
    public Socket clientSocket;
    public AwtUser()
    {
        // Configuration de la page //
        Font myFont = new Font("Conjugaison", Font.PLAIN, 15);
        setSize(700,600);
        //setTitle("Utilisateur1");
        setLayout(null);
        setBackground(new java.awt.Color(211,211,211));
        setVisible(true);

        //fermeture de la fenêtre
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });

        //setResizable(false);
        //**************************//

        // Label de la partie adresse //
        Label label1 = new Label("Adresse");
        add(label1);
        label1.setBounds(20,30,100,30);
        label1.setForeground(new java.awt.Color(0,0,0));
        label1.setFont(myFont);
        //****************************//

        // Entrer de texte pour l'adresse //
        TextField Adresse = new TextField();
        add(Adresse);
        Adresse.setBounds(20,60,100,25);
        //********************************//

        // Label de la partie port //
        Label label2 = new Label("Port");
        add(label2);
        label2.setBounds(20,100,100,30);
        label2.setForeground(new java.awt.Color(0,0,0));
        label2.setFont(myFont);
        //*************************//

        // Entrer de texte pour le port //
        TextField Port = new TextField();
        add(Port);
        Port.setBounds(20,130,100,25);
        //******************************//

        // Boutton de connexion //
        Button connexion = new Button("Connexion");
        add(connexion);
        connexion.setBounds(160,100,90,30);
        //**********************//

        // Label de la partie infinitif //
        Label infinitiftxt = new Label("Entrez l'infinitif et le temps :");
        Label exemple = new Label("ex: 'parler, Inficatif Présent'");

        add(infinitiftxt);
        add(exemple);
        infinitiftxt.setBounds(20,280,200,20);
        exemple.setBounds(20,300,200,30);
        infinitiftxt.setForeground(new java.awt.Color(0,0,0));
        exemple.setForeground(new java.awt.Color(0,0,0));
        infinitiftxt.setFont(myFont);
        exemple.setFont(myFont);
        //******************************//

        // Entrer de texte pour l'infinitif //
        TextField Infinitif = new TextField();
        add(Infinitif);
        Infinitif.setBounds(20,330,200,30);
        //**********************************//

        // Label de la partie infinitif //
        /*Label tempsTxt = new Label("Entrez le temps");
        add(tempsTxt);
        tempsTxt.setBounds(20,360,200,30);
        tempsTxt.setForeground(new java.awt.Color(0,0,0));
        tempsTxt.setFont(myFont);*/
        //******************************//

        // Entrer de texte pour l'infinitif //
        /*TextField temps = new TextField();
        add(temps);
        temps.setBounds(20,390,200,30);*/
        //**********************************//

        // boutton de demande de conjugaison//
        Button Requete = new Button("Conjuger");
        add(Requete);
        Requete.setBounds(70,450,100,25);
        //**********************************//

        // Texte indiquant si on est connecter au serveur //
        TextField EstConnecter = new TextField("Not connected");
        add(EstConnecter);
        EstConnecter.setBounds(500,30,200,25);
        EstConnecter.setEditable(false);
        EstConnecter.setForeground(new java.awt.Color(255,0,0));
        //************************************************//

        // Texte indiquant les conjugaisons de l'infinitif demander //
        TextArea Conjugaison = new TextArea();
        add(Conjugaison);
        Conjugaison.setBounds(280,250,350,300);
        Conjugaison.setEditable(false);
        //***********************************************************//

        // Declaration des ActionListener //
        connexion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    clientSocket = new Socket(Adresse.getText(), Integer.parseInt(Port.getText()));
                    EstConnecter.setText("Connected");
                    System.out.println("socket connecté : " + clientSocket);

                    EstConnecter.setForeground(new java.awt.Color(0,255,0));
                }
                catch (Exception exception)
                {
                    EstConnecter.setText("Not connected");
                    EstConnecter.setForeground(new java.awt.Color(255,0,0));
                }
            }
        });

        Requete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BufferedReader fluxEntrant;
                PrintStream fluxSortant;

                try {
                    fluxEntrant = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    fluxSortant = new PrintStream(clientSocket.getOutputStream());

                    fluxSortant.println(Infinitif.getText());
                    Conjugaison.setText(null);
                    int line;

                    line = Integer.parseInt(fluxEntrant.readLine());
                    for (int i = 0; i <= line; i++){
                        Conjugaison.append(fluxEntrant.readLine());
                        Conjugaison.append("\n");
                    }


                }  catch (UnknownHostException ee) {
                    ee.printStackTrace();
                } catch (IOException eee) {
                }
            }
        });
        //********************************//
    }
}
