package com.walidzaaneun.Application2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compte {
    private long numero;
    private LocalDate dateCreation;
    private double solde;
    private Client client;
    private List<Operation> operations = new ArrayList<>();

    public Compte(long numero, LocalDate dateCreation, double solde, Client client) {
        this.numero = numero;
        this.dateCreation = dateCreation;
        this.solde = solde;
        this.client = client;
    }

    public double getSolde(){
        double totalVers = 0;
        double totalRetr = 0;
        for( Operation operation : operations ){
            if(operation.getTypeOperation()==TypeOperation.RETR) totalRetr += operation.getMontant();
            if(operation.getTypeOperation()==TypeOperation.VERS) totalVers += operation.getMontant();
        }
        return solde = totalVers-totalRetr;
    }

    public List<Operation> getOperations() {
        Collections.sort(operations,new OperationDateComparateur());
        return operations;
    }

    public void ajouterOperation(Operation operation){
        operations.add(operation);
    }

    @Override
    public String toString() {
        return "Compte{\n" +
                "  \"numero\": " + numero + ",\n" +
                "  \"dateCreation\": \"" + dateCreation + "\",\n" +
                "  \"client\": " + client + ",\n" +
                "  \"operations\": " + getOperations() + ",\n" +
                "  \"solde\": " + getSolde() + "\n" +
                "}";
    }

}
class OperationDateComparateur implements Comparator<Operation> {
    @Override
    public int compare(Operation o1, Operation o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}
