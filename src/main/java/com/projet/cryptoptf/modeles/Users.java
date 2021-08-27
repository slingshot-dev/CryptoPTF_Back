package com.projet.cryptoptf.modeles;

import org.springframework.stereotype.Repository;

@Repository
public class Users {

    private int iduser;
    private String Nom;
    private String Prenom;
    private String Mail;
    private String Password;

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Users() {
    }

    public Users(int iduser, String nom, String prenom, String mail, String password) {
        this.iduser = iduser;
        Nom = nom;
        Prenom = prenom;
        Mail = mail;
        Password = password;
    }
}
