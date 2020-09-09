package com.company;

public class Sorcier extends Personnage {

    protected double pouvoir;

    public Sorcier(int pdv, String nomPersonnage) {
        super(pdv, nomPersonnage);
        this.pouvoir = Math.random();
    }

    public double getPouvoir() {
        return this.pouvoir;
    }

    @Override
    public void attaque(Victime v) {
        if (!this.mort()) {
            int coup = (int)((double)this.getVie()*this.getPouvoir());
            int contrecoup = v.subitCharme(coup);
            this.addVie(-contrecoup);
        }
    }

    @Override
    public int subitFrappe(int coup) {
        int contrecoup;
        if (!this.mort()) {
            this.addVie(-coup);
            contrecoup = (int)((double)coup * this.getPouvoir());
        } else {
            contrecoup = 0;
        }
        return contrecoup;

    }

    @Override
    public int subitCharme(int coup) {
        this.addVie(0);
        return 0;
    }
}

