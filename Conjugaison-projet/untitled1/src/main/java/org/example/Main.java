package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
        public static void main(String[] args) {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/magasinlivre","root","");
                Statement stmt=con.createStatement();
                System.out.println("Connected");
                ResultSet rs=stmt.executeQuery("Select * from livre join stock on livre.IdLivre = stock.IdLivre;");

                while(rs.next()) {
                    System.out.println("-"
                                + rs.getString("Titre") + ", "
                                + rs.getString("Auteur") + ", "
                                + rs.getString("Prix") + "€" + ", "
                                + rs.getString("NbLivre") + " pièces \n");
                }
                rs.close();
                stmt.close();
                rs.close();

            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
}