package com.walidzaaneun.Application2;

public class Client {
    private String cin;
    private String nom;
    private String prenom;
    private String telephone;

    public Client(String cin, String nom, String prenom, String telephone) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Client{\n" +
                "  \"cin\": \"" + cin + "\",\n" +
                "  \"nom\": \"" + nom + "\",\n" +
                "  \"prenom\": \"" + prenom + "\",\n" +
                "  \"telephone\": \"" + telephone + "\"\n" +
                "}";
    }
}
