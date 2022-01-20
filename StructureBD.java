/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travail_pour_tous;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class StructureBD {
    protected String nom;
    protected String numero_contribuable;
    protected String localisation;
    protected String Domaine;
    protected String email;
    protected String boite_postale;
    protected String date_de_creation;
    protected String user;
    protected String password;
    protected String password_1;
    
     Statement stmt;
    Connexion MaCon=new Connexion();

    public StructureBD(String user) {
        this.user = user;
    }
    
   public void recherche_propriete(){
        String verifier="SELECT nom, num_contribuable FROM structure WHERE username = '"+this.user+"'";
        
        try{
            Statement stmt1=MaCon.obt_connex().createStatement();
            ResultSet result=stmt1.executeQuery(verifier);//execute query ne passe jamais pour une valeur dans une base mysql
            if(result.next()){
              this.nom=result.getString(1);
              this.numero_contribuable=result.getString(2);
              
            }
            result.close();
            stmt1.close();
           
            
        }
        catch(SQLException ex){
            System.out.println(ex);
             JOptionPane.showMessageDialog(null,"requete d'affichage de nom, numero de contribuable execute sans success");
        }
    }
   
   public void recherche_infos(){
        
        String verifier="SELECT * FROM structure WHERE username = '"+this.user+"'";
        
        try{
            Statement stmt1=MaCon.obt_connex().createStatement();
            ResultSet result=stmt1.executeQuery(verifier);//execute query ne passe jamais pour une valeur dans une base mysql
            if(result.next()){
              this.user=result.getString(1);
              this.nom=result.getString(2);
              this.numero_contribuable=result.getString(3);
              this.localisation=result.getString(4);
              this.email=result.getString(5);
              this.boite_postale=result.getString(6);
              this.date_de_creation=result.getString(7);
              this.Domaine=result.getString(8);
              this.password=result.getString(9);
              this.password_1=result.getString(9);
              
            }
            result.close();
            stmt1.close();
           
            
        }
        catch(SQLException ex){
            System.out.println(ex);
             JOptionPane.showMessageDialog(null,"requete d'affichage de nom, prenom et age execute sans success");
        }
        
    }
    
}
