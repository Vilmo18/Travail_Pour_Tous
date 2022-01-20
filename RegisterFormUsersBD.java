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
public class RegisterFormUsersBD {

    public RegisterFormUsersBD(String user_b, String nom_b, String prenom_b, String password_b, String password_1_b, String birthday_b, String e_mail_b, String profession_b, String telephone_b, String quartier_b, String diplo_b, String filiere_b, String serie_b, String domaine_b) {
        this.stmt = stmt;
        this.stmt1 = stmt1;
        this.user_b = user_b;
        this.nom_b = nom_b;
        this.prenom_b = prenom_b;
        this.password_b = password_b;
        this.password_1_b = password_1_b;
        this.birthday_b = birthday_b;
        this.e_mail_b = e_mail_b;
        this.profession_b = profession_b;
        this.telephone_b = telephone_b;
        this.quartier_b = quartier_b;
        this.diplo_b = diplo_b;
        this.filiere_b = filiere_b;
        this.serie_b = serie_b;
        this.domaine_b = domaine_b;
    }
    
    int statut_save=0;
     Statement stmt, stmt1;
    Connexion MaCon=new Connexion();
    private String user_b;
    private String nom_b;
    private String prenom_b;
    private String password_b;
    private String password_1_b;
    private String birthday_b;
    private String e_mail_b;  
    private String profession_b;
    private String telephone_b;
    private String quartier_b;
    private String diplo_b;
    private String filiere_b;
    private String serie_b;
    private String domaine_b;
    
    public void enregistrer(){
        
    String requete="INSERT INTO users(nom_utilisateur,nom,prenom,password,date_naiss,profession,e_mail,telephone,quartier,dernier_diplo,filiere,serie,domaine) VALUES('"+user_b+"','"+nom_b+"','"+prenom_b+"','"+password_b+"','"+birthday_b+"','"+profession_b+"','"+e_mail_b+"','"+telephone_b+"','"+quartier_b+"','"+diplo_b+"','"+filiere_b+"','"+serie_b+"','"+domaine_b+"')";
        String verifier="SELECT nom_utilisateur,e_mail,telephone FROM users WHERE nom_utilisateur = '"+user_b+"' and e_mail='"+e_mail_b+"' and telephone='"+telephone_b+"'";
        String is_username=null;
        String is_e_mail=null;
        String is_telephone=null;
        try{
            stmt1=MaCon.obt_connex().createStatement();
            ResultSet result=stmt1.executeQuery(verifier);//execute query ne passe jamais pour une valeur dans une base mysql
            if(result.next()){
                is_username=result.getString(1);
                is_e_mail=result.getString(2);
                is_telephone=result.getString(3);
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
            if(password_b.equals(password_1_b) && !user_b.equals(is_username) && !e_mail_b.equals(is_e_mail) && !telephone_b.equals(is_telephone)){
                statut_save=1;
                stmt=MaCon.obt_connex().createStatement();
                stmt.executeUpdate(requete);//execute query ne passe jamais pour une valeur dans une base mysql
                JOptionPane.showMessageDialog(null,"requete d'ajout éxécute avec success");
                
            }
            else{
                if(!password_b.equals(password_1_b)){
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
