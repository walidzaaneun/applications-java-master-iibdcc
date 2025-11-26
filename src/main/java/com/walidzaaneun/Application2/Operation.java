package com.walidzaaneun.Application2;

import java.time.LocalDate;

public class Operation {
    private LocalDate date;
    private double montant;
    private TypeOperation typeOperation;

    public Operation(LocalDate date, double montant, TypeOperation typeOperation) {
        this.date = date;
        this.montant = montant;
        this.typeOperation = typeOperation;
    }

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public TypeOperation getTypeOperation() {
        return typeOperation;
    }
    public void setTypeOperation(TypeOperation typeOperation) {
        this.typeOperation = typeOperation;
    }


    @Override
    public String toString() {
        return "Operation{\n" +
                "  \"date\": \"" + date + "\",\n" +
                "  \"montant\": " + montant + ",\n" +
                "  \"typeOperation\": \"" + typeOperation + "\"\n" +
                "}";
    }

}
