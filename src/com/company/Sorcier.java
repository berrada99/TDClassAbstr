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
    public void attaque(Personnage p) {
        if (!this.mort()) {
            int coup = (int)((double)this.getVie()*this.getPouvoir());
            int contrecoup = p.subitCharme(coup);
            this.subitCharme(-contrecoup);
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
        return 0;
    }
}

