package com.walidzaaneun.Application1;

import java.util.Comparator;

public class Salarie {
    private int matricule;
    private String nom;
    private String prenom;
    private double salaire;

    public Salarie() {}

    public Salarie(int matricule, String nom, String prenom, double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom=prenom;
        setSalaire(salaire);
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSalaire(double salaire) {
        if (salaire <= 0) {
            System.out.println("Erreur : Le salaire doit être supérieur à 0 !");
        } else {
            this.salaire = salaire;
        }
    }

    @Override
    public String toString() {
        return "Salarie{" +
                "matricule=" + matricule +
                ", nom='" + nom + '\'' +
                ", prenom=" + prenom +
                ", salaire=" + salaire +
                '}';
    }

}
