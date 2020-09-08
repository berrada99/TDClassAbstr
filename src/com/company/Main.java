package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] pdv = new int[10];
        for (int i = 0; i<10; i++) {
            pdv[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(pdv));


        Personnage m1 = new Monstre(pdv[0], "blurk");
        Personnage m2 = new Monstre(pdv[1], "bjork");
        Personnage m3 = new Monstre(pdv[2], "beurk");
        Personnage m4 = new Monstre(pdv[3], "brok");
        Personnage m5 = new Monstre(pdv[4], "bartatok");
        Personnage s1 = new Sorcier(pdv[5], "Gandalf");
        Personnage s2 = new Sorcier(pdv[6], "Dumbledore");
        Personnage s3 = new Sorcier(pdv[7], "Docteur Strange");
        Personnage s4 = new Sorcier(pdv[8], "Gargamel");
        Personnage s5 = new Sorcier(pdv[9], "Merlin");

        Personnage d1 = new Magicien(100, "Panoramix");

        Personnage[] personnages = {m1, m2, m3, m4, m5, s1, s2, s3, s4, s5};

        for (int i = 0; i<10; i++) {
            System.out.println(personnages[i].toString());
        }

        int[] solidite = new int[5];
        for (int i = 0; i<5; i++) {
            solidite[i] = (int)(Math.random()*10);
        }


        NainJardin n1 = new NainJardin(solidite[0]);
        NainJardin n2 = new NainJardin(solidite[1]);
        NainJardin n3 = new NainJardin(solidite[2]);
        NainJardin n4 = new GnomeJardin(solidite[3]);
        NainJardin n5 = new GnomeJardin(solidite[4]);

        List<Object> joueurs = new ArrayList<Object>();
        joueurs.set(0, m1);
        joueurs.set(0, m2);
        joueurs.set(0, m3);
        joueurs.set(0, m4);
        joueurs.set(0, m5);
        joueurs.set(0, s1);
        joueurs.set(0, s2);
        joueurs.set(0, s3);
        joueurs.set(0, s4);
        joueurs.set(0, s5);
        joueurs.set(0, d1);
        joueurs.set(0, n1);
        joueurs.set(0, n2);
        joueurs.set(0, n3);
        joueurs.set(0, n4);
        joueurs.set(0, n5);

        /*
        for (int i = 0; i<10; i++) {
            int k = (int) (Math.random() * 10);
            int l = (int) (Math.random() * 10);
            if (k != l) {

                if (k < 11) {
                    Personnage joueurk = (Personnage) joueurs.get(k);
                }
                joueurs.get(k).attaque(personnages[l]);
                System.out.println(personnages[k].getNom() + " a attaqué " + personnages[l].getNom());
            }
        }
        */
        /*
        for (int i = 0; i<10; i++) {
            int k = (int)(Math.random()*10);
            int l = (int)(Math.random()*10);
            if ( k != l ) {
                personnages[k].attaque(personnages[l]);
                System.out.println(personnages[k].getNom() + " a attaqué " + personnages[l].getNom());
            }
        }
        for (int i = 0; i<10; i++) {
            System.out.println(personnages[i].toString());
        }
        */

    }
}
