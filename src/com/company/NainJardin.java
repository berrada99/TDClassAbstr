package com.company;

public class NainJardin implements Victime {

    protected int solidite;

    public NainJardin(int solidite) {
        this.solidite = solidite;
    }

    public int getSolidite() {
        return this.solidite;
    }

    public String toString() {
        return "Je suis un nain de jardin et j'ai " + this.getSolidite() + " de solidité";
    }
    @Override
    public int subitFrappe(int coup) {

        int contrecoup;
        if (this.getSolidite() > coup) {
            contrecoup = coup;
        } else {
            contrecoup = this.getSolidite();
            this.solidite = 0;
        }
        return contrecoup;

    }

    @Override
    public int subitCharme(int coup) {
        if (this.getSolidite() > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
