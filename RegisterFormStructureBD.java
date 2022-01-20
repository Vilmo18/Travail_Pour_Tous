/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travail_pour_tous;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author HP
 */

public class RegisterFormStructureBD {
    protected String user;
    protected String nom;
    protected String password;
    protected String password_1;
    protected String date_de_creation;
    protected String email;
    protected String bp;
    protected String numero_contribuable;
    protected String localisation;
    protected String domaine;
    protected int statut_save=0;
    
     Statement stmt, stmt1;
    Connexion MaCon=new Connexion();

    public RegisterFormStructureBD(String user, String nom, String password,String password_1 ,String date_de_creation, String email, String bp, String numero_contribuable, String localisation, String Domaine) {
        this.user = user;
        this.nom = nom;
        this.password = password;
        this.password_1=password_1;
        this.date_de_creation = date_de_creation;
        this.email = email;
        this.bp = bp;
        this.numero_contribuable = numero_contribuable;
        this.localisation = localisation;
        this.domaine = Domaine;
    }
    public void enregistrer(){
        
        String requete ="INSERT INTO structure(username,nom,num_contribuable,localisation,e_mail,boite_postale,date_creation,domaine,password) VALUES('"+user+"','"+nom+"','"+numero_contribuable+"','"+localisation+"','"+email+"','"+bp+"','"+date_de_creation+"','"+domaine+"','"+password+"')";
        String verifier="SELECT username,e_mail,num_contribuable,boite_postale FROM structure WHERE username = '"+user+"' and e_mail='"+email+"' and num_contribuable='"+numero_contribuable+"' and boite_postale='"+bp+"'";
        String is_username=null;
        String is_e_mail=null;
        String is_num_contribuable=null;
        String is_bp=null;
        try{
            stmt1=MaCon.obt_connex().createStatement();
            ResultSet result=stmt1.executeQuery(verifier);//execute query ne passe jamais pour une valeur dans une base mysql
            if(result.next()){
                is_username=result.getString(1);
                is_e_mail=result.getString(2);
                is_num_contribuable=result.getString(3);
                is_bp=result.getString(4);
            }
            result.close();
            stmt1.close();
            JOptionPane.showMessageDialog(null,"requete de verification execute avec success");

        }
        catch(SQLException ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null,"requete de verification du username et e_mail execute sans success");
        }
        try{
            if(password.equals(password_1) && !user.equals(is_username) && !email.equals(is_e_mail) && !numero_contribuable.equals(is_num_contribuable) && !bp.equals(is_bp)){
                stmt=MaCon.obt_connex().createStatement();
                stmt.executeUpdate(requete);//execute query ne passe jamais pour une valeur dans une base mysql
                JOptionPane.showMessageDialog(null,"requete d'ajout éxécute avec success");
                statut_save=1;

        }
            else{
                if(!password.equals(password_1)){
                    JOptionPane.showMessageDialog(null,"mot de passe incorrect");
                }
                else{
                    JOptionPane.showMessageDialog(null,"nom d'utilssateur ou telephone ou e-mail deja existant ");
                }

            }
        }
        catch(SQLException ex){
            System.out.println(ex);
            JOptionPane.showMessageDialog(null,"requete d'enregistrement execute sans success");
        }
    }
    
}
