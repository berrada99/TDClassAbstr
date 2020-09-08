package com.company;

public class GnomeJardin extends NainJardin {

    protected int sort;

    public GnomeJardin(int solidite) {
        super(solidite);
        this.sort = (int) (Math.random()*this.getSolidite());
    }

    public int getSort() {
        return this.sort;
    }

    public int subitCharme(int coup) {
        if (this.getSort() > coup) {
            return this.getSort();
        } else {
            return 0;
        }
    }
}


