package com.project.jb;

import java.util.Random;

public enum Couleur {
    PIQUE, COEUR, CARREAU, TREFLE;

    private static final Random random = new Random();

    public static Couleur randomCouleur()  {
        Couleur[] couleurs = values();
        return couleurs[random.nextInt(couleurs.length)];
    }
}
