/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travail_pour_tous;

public class Structure {
    private String nom;
    private String numero_contribuable;
    private String localisation;
    private String Domaine;
    private String email;
    private String boite_postale;
    private String date_de_creation;
    private String user;
    private String password;
    private String password_1;
    
    public Structure(String user,String nom,String numero,String localisation,String email,String boite,String date,String Domaine,String password,String password_1)
    {
        this.nom=nom;
        this.numero_contribuable=numero;
        this.localisation=localisation;
        this.Domaine=Domaine;
        this.email=email;
        this.boite_postale=boite;
        this.date_de_creation=date;
        this.user=user;
        this.password=password;
        this.password_1=password_1;
    }
    // Ajout des offres
    /*
    
     String requete="INSERT INTO offre(structure,description,domaine,age,localisation,place,
    composition,date_d_ouv,date_fermeture)
    VALUES()"; IL FAUT COMPLETER SUIVANT LES CHAMPS QUE TU VAS NOMMER
    
    try{
            Statement stmt1=MaCon.obt_connex().createStatement();
            ResultSet result=stmt1.executeQuery(verifier);//execute query ne passe jamais pour une valeur dans une base mysql
            
            result.close();
            stmt1.close();
            JOptionPane.showMessageDialog(null,"requete de verification execute avec success");

        }
        catch(SQLException ex){
            System.out.println(ex);
        }
    */
    
    
    
    /* Recherche d'offre par le client CEST UNE REQUETE PREPAREE
    
    String req="Select * from offre group by champ=? order by ordre=?";
    PreparedStatement pst=MaCon.prepareStatement(req);
    pst.setString(1,nomdumultiplechoice.getText());   ICI ON RECUPERE DONC SUIVANT LE NOM DU CHAMP 
     pst.setString(2,,nomdumultiplechoice.getText());
    ResultSet result=pst.executeQuery();
    
    */
    
    
    /* Recherhe
    
    */
    
     
}
