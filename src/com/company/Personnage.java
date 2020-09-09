package com.company;

public abstract class Personnage implements Victime {

    protected int pdv;
    protected String nomPersonnage;

    public Personnage(int pdv, String nomPersonnage) {
        this.pdv = pdv;
        this.nomPersonnage = nomPersonnage;
    }

    public String toString() {
        if (this.mort()) {
            return this.getNom() + " est mort.";
        } else {
            return "Je m'appelle " + this.getNom() + " et j'ai " + this.getVie() + " Point de vie.";
        }
    }

    public String getNom() {
        return this.nomPersonnage;
    }

    public boolean mort() {
        return this.pdv <= 0;
    }

    public int getVie() {
        return this.pdv;
    }

    public void addVie(int num) {
        this.pdv += num;
        if (num > 0) {
            System.out.println(this.getNom() + " gagne " + num + " points de vie.");
        } else if (num < 0) {
            System.out.println(this.getNom() + " perds " + num + " points de vie.");
        } else {
            System.out.println(this.getNom() + " n'est pas affecté.");
        }
    }

    public abstract void attaque(Victime v);

    public abstract int subitFrappe(int coup);

    public abstract int subitCharme(int coup);


}
