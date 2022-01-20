/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travail_pour_tous;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ChercheurBD {
    protected String user;
    protected String nom;
    protected String prenom;
    protected String username;
    protected String password_b;
    protected String password_1_b;
    protected String birthday_b;
    protected String e_mail_b;  
    protected String profession_b;
    protected String telephone_b;
    protected String quartier_b;
    protected String diplo_b;
    protected String filiere_b;
    protected String serie_b;
    protected String domaine_b;
    protected int statut_verifie=0;

    
     Statement stmt;
    Connexion MaCon=new Connexion();

    public ChercheurBD(String user) {
        this.user = user;
        
    }
    
    
    public void recherche_propriete(){
        System.out.println("l'utisateur est :"+this.user);
        String verifier="SELECT nom, prenom,nom_utilisateur FROM users WHERE nom_utilisateur = '"+user+"'";
        
        try{
            Statement stmt1=MaCon.obt_connex().createStatement();
            ResultSet result=stmt1.executeQuery(verifier);//execute query ne passe jamais pour une valeur dans une base mysql
            if(result.next()){
              this.statut_verifie=1;
              this.nom=result.getString(1);
              this.prenom=result.getString(2);
              this.username=result.getString(3);
              
            }
            result.close();
            stmt1.close();
           
            
        }
        catch(SQLException ex){
            System.out.println(ex);
             JOptionPane.showMessageDialog(null,"requete d'affichage de nom, prenom et age execute sans success");
        }
    }
    
    public void recherche_infos(){
        
        String verifier="SELECT * FROM users WHERE nom_utilisateur = '"+user+"'";
        
        try{
            Statement stmt1=MaCon.obt_connex().createStatement();
            ResultSet result=stmt1.executeQuery(verifier);//execute query ne passe jamais pour une valeur dans une base mysql
            if(result.next()){
              this.statut_verifie=1;
              this.nom=result.getString(1);
              this.prenom=result.getString(2);
              this.username=result.getString(3);
              this.password_b=result.getString(4);
              this.password_1_b=result.getString(4);
              this.birthday_b=result.getString(5);
              this.diplo_b=result.getString(6);
              this.serie_b=result.getString(7);
              this.filiere_b=result.getString(8);
              this.e_mail_b=result.getString(9);
              this.telephone_b=result.getString(10);
              this.profession_b=result.getString(11);
              this.quartier_b=result.getString(12);
              this.domaine_b=result.getString(13);
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
