package com.company;

public class Magicien extends Sorcier implements SuperPouvoir {

    public Magicien(int pdv, String nomPersonnage) {
        super(pdv, nomPersonnage);
    }

    @Override
    public double getPouvoir() {
        return super.getPouvoir()*extra;
    }

    @Override
    public double sort() {
        return Math.random()*this.getPouvoir();
    }

    @Override
    public int subitCharme(int coup) {
        int contrecoup;
        if(!(this.mort())) {
            contrecoup = (int) this.sort();
        } else {
            contrecoup =  0;
        }
        return contrecoup;

    }
}
