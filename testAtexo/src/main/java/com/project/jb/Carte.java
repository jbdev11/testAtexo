package com.project.jb;

public class Carte {
    private Couleur couleur;
    private Numero numero;

    public Carte(Couleur couleur, Numero numero) {
        this.couleur = couleur;
        this.numero = numero;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero + " de " + couleur;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Carte carte = (Carte) obj;
        return this.couleur.equals(carte.couleur) && this.numero.equals(carte.numero);
    }
}
