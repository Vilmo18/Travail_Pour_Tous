/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travail_pour_tous;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */

    
       public class RechercheBD {
           
           Statement stmt, stmt1;
           Connexion MaCon=new Connexion();
           PreparedStatement pst;
          protected ResultSet result;
           
           
    
    
           public void afficher(){
               
        
        try{
            String verifier="SELECT * FROM offre";
            pst=MaCon.obt_connex().prepareStatement(verifier);
            result=pst.executeQuery();//execute query ne passe jamais pour une valeur dans une base mysql
     

           
            
        }
        catch(SQLException ex){
            System.out.println(ex);
             JOptionPane.showMessageDialog(null,"requete d'affichage de nom, prenom et age execute sans success");
        }
           }
}
