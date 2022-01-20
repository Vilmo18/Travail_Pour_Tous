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
    private String domaine;
    private String email;
    private String boite_postale;
    private String date_de_creation;
    
    public Structure(String nom,String numero,String localisation,String domaine,String email,String boite,String date)
    {
        this.nom=nom;
        this.numero_contribuable=numero;
        this.localisation=localisation;
        this.domaine=domaine;
        this.email=email;
        this.boite_postale=boite;
        this.date_de_creation=date;
    
    }
