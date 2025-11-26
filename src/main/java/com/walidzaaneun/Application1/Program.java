package com.walidzaaneun.Application1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Departement departement = new Departement(1,"IT");
        Departement departement2 = new Departement(2,"Administration");

        departement.ajoutersalarie(new Salarie(1,"zaanoun","walid",3500));
        departement.ajoutersalarie(new Salarie(2,"yousfi","mohammed",8000));
        departement.ajoutersalarie(new Salarie(3,"alaoui","souad",3000));

        departement2.ajoutersalarie(new Salarie(4,"reddad","nada",9000));
        departement2.ajoutersalarie(new Salarie(5,"sekkak","rachid",7000));
        departement2.ajoutersalarie(new Salarie(6,"rafik","hamza",6000));



        System.out.println(departement);
        System.out.println("========================");
        System.out.println(departement2);

    }
}
