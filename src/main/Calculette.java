package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculette {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // System.in is a standard input stream
		System.out.println("Entrer un chiffre: ");
		long chiffre1 = 0;
		boolean testChiffre1 = true;
		while (testChiffre1) {
			try {
				chiffre1 = sc.nextLong();
				testChiffre1 = false;
			} catch (Exception e) {
				System.out.println("La saisie est incorrecte. Veuillez recommencer");
				chiffre1 = new Scanner(System.in).nextLong();
			}

		}

//		while(chiffre1!=long) {
		System.out.println("Veuillez saisir un chiffre");
//		}
		System.out.println("Rentrer l'opération (-+/*)");
		String operation = new Scanner(System.in).nextLine();
		System.out.println("Entrer un deuxième chiffre: ");
		long chiffre2 = sc.nextLong();

		double resultat = 0.0;

		if (operation.equals("+")) {
			resultat = Math.addExact(chiffre1, chiffre2);
		} else if (operation.equals("-")) {
			resultat = Math.subtractExact(chiffre1, chiffre2);
		} else if (operation.equals("*")) {
			resultat = Math.multiplyExact(chiffre1, chiffre2);
		} else if (operation.equals("/")) {
			resultat = Math.floorDiv(chiffre1, chiffre2);
		}
		while (operation == "+-/*") {
			System.out.println("Veuillez saisir un signe d'opération");
		}
//		while(chiffre2!=long) {
//			System.out.println("Veuillez saisir un chiffre");
//		}
		System.out.println("Résultat: " + resultat);

	}
}
