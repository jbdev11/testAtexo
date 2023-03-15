package com.project.jb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@SpringBootApplication
public class JbApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(JbApplication.class, args);
		jeuDeCartes();
	}

	public static void jeuDeCartes() throws IOException {
		System.out.println("Jeu de cartes by JB");
		System.out.println("*******************");
		System.out.println();
		String choix;
		do {
			System.out.println("Menu principal - tapez le numero du choix que vous souhaitez.");
			System.out.println("1. Tirer un jeu de carte");
			System.out.println("2. Quitter");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			choix = reader.readLine();
			if (choix.equals("1")) {
				afficherMains();
			}
			System.out.println("*******************");
			System.out.println("*******************");
			System.out.println();
		} while (!choix.equals("2"));
		System.exit(0);
	}

	public static void afficherMains() {
		List<Carte> mainNonTriee = new ArrayList<>();
		while (mainNonTriee.size() < 10) {
			Carte nouvelleCarte = new Carte(Couleur.randomCouleur(), Numero.randomNumero());
			if (mainNonTriee.stream().anyMatch(elm -> elm.equals(nouvelleCarte))) {
				continue;
			}
			mainNonTriee.add(nouvelleCarte);
		}
		System.out.println("Jeu non trié : " + mainNonTriee);
		System.out.println("Jeu trié : " + trierMain(mainNonTriee));
	}

	public static List<Carte> trierMain(List<Carte> mainNonTriee) {
		mainNonTriee.sort(Comparator.comparing(Carte::getCouleur).thenComparing(Carte::getNumero));
		return mainNonTriee;
	}
}
