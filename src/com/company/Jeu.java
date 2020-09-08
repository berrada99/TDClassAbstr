package com.company;

import java.util.ArrayList;
import java.util.List;

public class Jeu {

    private int nbMonstre;
    private int nbSorcier;
    private int nbMagicien;
    private int nbNainJardin;
    private int nbGnomeJardin;
    private int nbTour;

    public Jeu(int nbMonstre, int nbSorcier, int nbMagicien, int nbNainJardin, int nbGnomeJardin, int nbTour) {
        this.nbMonstre = nbMonstre;
        this.nbSorcier = nbSorcier;
        this.nbMagicien = nbMagicien;
        this.nbNainJardin = nbNainJardin;
        this.nbGnomeJardin = nbGnomeJardin;
        this.nbTour = nbTour;
    }

    public List<Victime> genererVicitme() {
        List<Victime> listVictimes = new ArrayList<Victime>();
        for (int i = 0 ; i < this.nbMonstre; i++ ) {
            String si = Integer.toString(i);
            Personnage monstre = new Monstre((int)(Math.random()*100), "Monstre " + si);
            listVictimes.set(i, monstre);
        }
        for (int i = 0 ; i < this.nbSorcier; i++ ) {
            int j = i + this.nbMonstre;
            String sj = Integer.toString(j);
            Personnage sorcier = new Sorcier((int)(Math.random()*100), "Sorcier " + sj);
            listVictimes.set(j, sorcier);
        }
        for (int i = 0 ; i < this.nbMagicien; i++ ) {
            int j = i + this.nbMonstre + this.nbSorcier;
            String sj = Integer.toString(j);
            Personnage magicien = new Magicien((int)(Math.random()*100), "Magicien " + sj);
            listVictimes.set(j, magicien);
        }
        for (int i = 0 ; i < this.nbNainJardin; i++ ) {
            int j = i + this.nbMonstre + this.nbSorcier + this.nbMagicien;
            NainJardin nainJardin = new NainJardin((int)(Math.random()*25));
            listVictimes.set(j, nainJardin);
        }
        for (int i = 0 ; i < this.nbGnomeJardin; i++ ) {
            int j = i + this.nbMonstre + this.nbSorcier + this.nbMagicien + this.nbNainJardin;
            NainJardin nainJardin = new GnomeJardin((int)(Math.random()*25));
            listVictimes.set(j, nainJardin);
        }
        return listVictimes;
    }

    public initJeu() {

    }


}
