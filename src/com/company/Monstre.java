package com.company;

public class Monstre extends Personnage {

    public Monstre(int pdv, String nomPersonnage) {

        super(pdv, nomPersonnage);
    }

    @Override
    public void attaque(Victime v) {
        if (!this.mort()) {
            int coup = this.getVie();
            int contrecoup = v.subitFrappe(coup);
            this.addVie(-contrecoup);
        }
    }

    @Override
    public int subitFrappe(int coup) {
        if (!this.mort()) {
            this.addVie(-coup);
            return coup/2;
        } else {
            return 0;
        }

    }

    @Override
    public int subitCharme(int coup) {
        if (!this.mort()) {
            this.addVie(-coup);
            return coup/2;
        } else {
            return 0;
        }

    }
}

