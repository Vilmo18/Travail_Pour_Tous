/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travail_pour_tous;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class LoginBD {
    protected String user;
    protected String password;
    protected int statut_login=0;
    protected int statut_login_struct=0;
    protected String is_username=null;
        protected String is_password=null;
     Statement stmt;
    Connexion MaCon=new Connexion();

    public LoginBD(String user, String password) {
        this.user = user;
        this.password = password;
        
    }
    public void connecter(){
        
        String verifier="SELECT nom_utilisateur, password FROM users WHERE nom_utilisateur = '"+user+"' and password= '"+password+"'";
        String is_username=null;
        String is_password=null;
        statut_login=0;
        try{
            Statement stmt1=MaCon.obt_connex().createStatement();
            ResultSet result=stmt1.executeQuery(verifier);//execute query ne passe jamais pour une valeur dans une base mysql
            if(result.next()){
              is_username=result.getString(1);
              is_password=result.getString(2);
            }
            result.close();
            stmt1.close();
            System.out.println("la recherche de username dans la bd est :"+is_username+" et le password est "+is_password);
           if(is_username.equals(user) && is_password.equals(password)){ 
               JOptionPane.showMessageDialog(null,"BIENVENUE DANS L'APPLICATION DE RECHERCHE D'EMPLOIS");
               statut_login=1;
           }
            
        }
        catch(SQLException ex){
            System.out.println(ex);
             JOptionPane.showMessageDialog(null,"requete de verification du username execute sans success");
        }
    }
    
     public void connecter_struct(){
        
        String verifier="SELECT username, password FROM structure WHERE username = '"+user+"' and password= '"+password+"'";
        String is_username=null;
        String is_password=null;
        statut_login_struct=0;
        try{
            Statement stmt1=MaCon.obt_connex().createStatement();
            ResultSet result=stmt1.executeQuery(verifier);//execute query ne passe jamais pour une valeur dans une base mysql
            if(result.next()){
              is_username=result.getString(1);
              is_password=result.getString(2);
            }
            result.close();
            stmt1.close();
           if(is_username.equals(user) && is_password.equals(password)){ 
               JOptionPane.showMessageDialog(null,"BIENVENUE DANS L'APPLICATION DE DEPOT D'EMPLOIS");
               statut_login_struct=1;
           }
            
        }
        catch(SQLException ex){
            System.out.println(ex);
             JOptionPane.showMessageDialog(null,"requete de verification du username execute sans success");
        }
    }
    
}
