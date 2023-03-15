package com.project.jb;

import java.util.Random;

public enum Numero {
    DEUX, QUATRE, SIX, HUIT, DIX, DAME, AS, TROIS, CINQ, SEPT, NEUF, VALET, ROI;

    private static final Random random = new Random();

    public static Numero randomNumero()  {
        Numero[] numeros = values();
        return numeros[random.nextInt(numeros.length)];
    }
}
