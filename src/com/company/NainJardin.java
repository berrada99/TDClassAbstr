package com.company;

public class NainJardin implements Victime {

    protected int solidite;

    public NainJardin(int solidite) {
        this.solidite = solidite;
    }

    public int getSolidite() {
        return this.solidite;
    }

    @Override
    public int subitFrappe(int coup) {

        int contrecoup;
        if (this.getSolidite() > coup) {
            contrecoup = this.getSolidite();
            this.solidite = 0;
        } else {
            contrecoup = coup;
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
