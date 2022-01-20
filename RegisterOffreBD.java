/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travail_pour_tous;

import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Carré Vilmorin
 */
public class RegisterOffreBD {
    private String entreprise;
    private String description;
    private String  domaine;
    private String diplome;
    private String age;
    private String places;
    private String date_d_ouverture;
    private String localisation;
    private String composition_dossier;
    private String date_de_delai;
     protected int statut_save=0;
     Statement stmt, stmt1;
    Connexion MaCon=new Connexion();
     
    
    public RegisterOffreBD(String entreprise,String description,String domaine,String diplome,String age,String places,String date_ouv,String localisation,String compo,String delai)
    {
        this.entreprise=entreprise;
        this.description=description;
        this.domaine=domaine;
        this.diplome=diplome;
        this.age=age;
        this.places=places;
        this.date_d_ouverture=date_ouv;
        this.date_de_delai=delai;
        this.localisation=localisation;
        this.composition_dossier=compo;
        
    }
    
    public void enregistrer(){
        
        String requete ="INSERT INTO offre(entreprise,description,diplome,age,place,date_d_ouverture,localisation,composition_du_dossier,date_delai) VALUES('"+entreprise+"','"+description+"','"+diplome+"','"+age+"','"+places+"','"+date_d_ouverture+"','"+localisation+"','"+composition_dossier+"','"+date_de_delai+"')";
        
       
        
        try{
                stmt=MaCon.obt_connex().createStatement();
                stmt.executeUpdate(requete);//execute query ne passe jamais pour une valeur dans une base mysql
                JOptionPane.showMessageDialog(null,"requete d'ajout éxécute avec success");
                statut_save=1;
        }
        catch(SQLException ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null,"requete d'enregistrement execute sans success");
        }
    }
}
