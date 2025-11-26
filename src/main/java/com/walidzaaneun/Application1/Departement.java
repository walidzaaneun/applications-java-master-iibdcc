package com.walidzaaneun.Application1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Departement {
    private int id;
    private String nom;
    private List<Salarie> salaries = new ArrayList<>();

    public Departement(int id, String nom) {
        this.nom = nom;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Salarie> getSalaries() {
        Collections.sort(salaries,new SalaireComparateur());
        return salaries;
    }

    public void getSalaries(List<Salarie> salaries) {
        this.salaries = salaries;
    }

    public int totalSalaires() {
        int total = 0;
        for(Salarie salarie : salaries) {
            total += salarie.getSalaire();
        }
        return total;
    }

    public void ajoutersalarie(Salarie salarie) {
        salaries.add(salarie);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", salaries=" + getSalaries() +
                ", total des salaires=" + totalSalaires() +
                '}';
    }
}

class SalaireComparateur implements Comparator<Salarie> {
    @Override
    public int compare(Salarie s1, Salarie s2) {
        return Double.compare(s1.getSalaire(),s2.getSalaire());
    }
}
