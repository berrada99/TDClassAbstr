package com.company;

public class Monstre extends Personnage {

    public Monstre(int pdv, String nomPersonnage) {

        super(pdv, nomPersonnage);
    }

    @Override
    public void attaque(Personnage p) {
        if (!this.mort()) {
            int coup = this.getVie();
            int contrecoup = p.subitFrappe(coup);
            this.subitFrappe(contrecoup);
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

