package travail_pour_tous;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.sql.*;
public class Connexion {
    String urlpilote="com.mysql.jdbc.Driver";
    String urlBaseDonnees="jdbc:mysql://localhost:3306/netbeans";
    
    Connection con;
    public Connexion() {
    
        
    try{
    Class.forName(urlpilote);
        System.out.println("chargement du pilote reussie");
}
    catch(ClassNotFoundException ex){

            System.out.println(ex);
}
    try{
    con=DriverManager.getConnection(urlBaseDonnees,"root","");
     System.out.println("chargement de la bd  reussie");
        
    }
    catch(SQLException ex){
        System.out.println(ex);
        
    }
    
    }
    Connection obt_connex(){
        return con;
    }
}
