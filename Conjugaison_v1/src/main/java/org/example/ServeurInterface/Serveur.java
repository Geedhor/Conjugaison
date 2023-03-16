package main.java.org.example.ServeurInterface;
import main.java.org.example.Verbe.SearchVerbe.*;
import main.java.org.example.Verbe.Verbe;
import java.net.ServerSocket;

import java.io.*;
import java.net.*;
import java.util.Vector;

public class Serveur extends Thread{

    private static Socket socket = null;
    private static ServerSocket server = null;
    private static DataInputStream in = null;
    private static DataOutputStream out = null;
    public static int nbClient;


    public static void main(String[] args) throws IOException {

        /*Déclaration du Serveur*/
        server = new ServerSocket(8000);

        /*Adresse du serveur*/
        InetAddress cetteMachine;
        /*Port du serveur*/
        int portLocal;
        ThreadGroup groupe;

        portLocal = server.getLocalPort();

        cetteMachine = InetAddress.getLocalHost();

        System.out.println("Server started:");
        System.out.println("En attente de connexion d'un client........");
        System.out.println("adresse IP du serveur de majuscule : "+cetteMachine.getHostAddress());
        System.out.println("port du serveur : "+portLocal);


        groupe = new ThreadGroup("socketsClients");
        nbClient = 0;

        while(true){

            MultiThread threading;
            socket = server.accept();

            ++nbClient;
            System.out.println("Connexion réussie n° : "+nbClient);

            threading = new MultiThread(socket, groupe, nbClient);
            threading.start();
        }
    }
}
