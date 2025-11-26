package com.walidzaaneun.Application2;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Client client = new Client("AA123456","Zaanoun","Walid","0612345678");
        Compte compte = new Compte(1234568912345L,LocalDate.of(2020,1,1),0,client);

        compte.ajouterOperation(new Operation(LocalDate.of(2020, 1, 20), 900, TypeOperation.VERS));
        compte.ajouterOperation(new Operation(LocalDate.of(2020, 1, 2), 1000, TypeOperation.VERS));
        compte.ajouterOperation(new Operation(LocalDate.of(2020, 1, 6), 1000, TypeOperation.VERS));
        compte.ajouterOperation(new Operation(LocalDate.of(2020, 1, 9), 3000, TypeOperation.RETR));
        compte.ajouterOperation(new Operation(LocalDate.of(2020, 1, 10), 200, TypeOperation.RETR));
        compte.ajouterOperation(new Operation(LocalDate.of(2020, 1, 4), 1000, TypeOperation.RETR));
        compte.ajouterOperation(new Operation(LocalDate.of(2020, 1, 3), 2000, TypeOperation.VERS));

        System.out.println(compte);

    }
}
