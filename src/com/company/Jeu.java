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
            listVictimes.add(monstre);
        }
        for (int i = 0 ; i < this.nbSorcier; i++ ) {
            int j = i + this.nbMonstre;
            String sj = Integer.toString(j);
            Personnage sorcier = new Sorcier((int)(Math.random()*100), "Sorcier " + sj);
            listVictimes.add(sorcier);
        }
        for (int i = 0 ; i < this.nbMagicien; i++ ) {
            int j = i + this.nbMonstre + this.nbSorcier;
            String sj = Integer.toString(j);
            Personnage magicien = new Magicien((int)(Math.random()*100), "Magicien " + sj);
            listVictimes.add(magicien);
        }
        for (int i = 0 ; i < this.nbNainJardin; i++ ) {
            NainJardin nainJardin = new NainJardin((int)(Math.random()*25));
            listVictimes.add(nainJardin);
        }
        for (int i = 0 ; i < this.nbGnomeJardin; i++ ) {
            NainJardin nainJardin = new GnomeJardin((int)(Math.random()*25));
            listVictimes.add(nainJardin);
        }
        return listVictimes;
    }


    public int getNbVictime() {
        return this.nbGnomeJardin + this.nbNainJardin + this.nbMagicien + this.nbSorcier + this.nbMonstre;
    }

    public int getNbPersonnage() {
        return this.nbMagicien + this.nbSorcier + this.nbMonstre;
    }
    public void afficherJeu(List<Victime> listvictimes) {

        for (int i = 0 ; i < listvictimes.size() ; i++) {
            System.out.println(listvictimes.get(i).toString());
        }

    }

    public void jouerTour (List<Victime> listvictime) {

        int nbVictimes = this.getNbVictime();
        int nbPersonnages = this.getNbPersonnage();
        int k = (int)(Math.random()*nbPersonnages);
        int l = (int)(Math.random()*nbVictimes); //
        if ( k != l ) {
            if (l < this.getNbPersonnage()) {
                System.out.println(((Personnage) listvictime.get(k)).getNom() + " attaque " + ((Personnage) listvictime.get(l)).getNom());
            } else {
                System.out.println(((Personnage) listvictime.get(k)).getNom() + " attaque un nain de jardin." );
            }
            ((Personnage)listvictime.get(k)).attaque(listvictime.get(l));
            System.out.println("\n");
            if (k >= this.nbMonstre + this.nbSorcier && l >= this.getNbPersonnage() + this.nbNainJardin) {
                for (int i = 0 ; i < this.nbMonstre + this.nbSorcier ; i++) {
                    System.out.println("Cette attaque provoque un clash de magie et affecte tout les personnages non magiques perdent un point de vie");
                    ((Personnage)listvictime.get(i)).addVie(-1);
                }
            }
        }
    }

    public void jouer() {

        List<Victime> listvictime = this.genererVicitme();
        this.afficherJeu(listvictime);
        System.out.println("\n");
        for(int i = 0; i < this.nbTour ; i++) {
            this.jouerTour(listvictime);
        }
        System.out.println("\n");
        this.afficherJeu(listvictime);


    }

}
