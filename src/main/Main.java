package main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  static List<String> operations = Arrays.asList("+", "-", "*", "/");
  // test
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    boolean continuerProgramme = true;
    while(continuerProgramme) {
      System.out.println("Nouvelle opération");
      System.out.print("Entrer un chiffre : ");
  
      long chiffre1 = 0;
      boolean testChiffre1 = true;
      while (testChiffre1) {
        try {
          chiffre1 = new Scanner(System.in).nextLong();
          testChiffre1 = false;
        } catch (Exception e) {
          System.out.print("Votre saisie est incorrecte. Veuillez entrer un nouveau chiffre : ");
        }
      }
  
      System.out.print("Entrer une opération [-,+,/,*] : ");
      boolean testOperation = true;
      String operation = "";
      while (testOperation) {
        operation = new Scanner(System.in).nextLine();
        if (operations.contains(operation))
          testOperation = false;
        else
          System.out.print("Votre saisie est incorrecte. Veuillez entrer un nouvelle opération [-,+,/,*] : ");
      }
  
      System.out.print("Entrer un deuxième chiffre : ");
      long chiffre2 = 0;
      boolean testChiffre2 = true;
      while (testChiffre2) {
        try {
          chiffre2 = new Scanner(System.in).nextLong();
          if (chiffre2 == 0l && operation.equals("/"))
            System.out.print("On ne peut pas diviser par zéro. Veuillez entrer un nouveau chiffre : ");
          else
            testChiffre2 = false;
        } catch (Exception e) {
          System.out.print("Votre saisie est incorrecte. Veuillez entrer un nouveau chiffre : ");
        }
      }
  
      double resultat = 0.0;
      if (operation.equals("+"))
        resultat = Math.addExact(chiffre1, chiffre2);
      else if (operation.equals("-"))
        resultat = Math.subtractExact(chiffre1, chiffre2);
      else if (operation.equals("*"))
        resultat = Math.multiplyExact(chiffre1, chiffre2);
      else if (operation.equals("/"))
        resultat = Math.floorDiv(chiffre1, chiffre2);
  
      System.out.println("Résultat: " + chiffre1 + " " + operation + " " + chiffre2 + " = " + resultat);
      System.out.print("Voulez vous refaire une opération (O / N) ? ");
      String nouvelleOperation = new Scanner(System.in).nextLine();
      if(nouvelleOperation.equals("N")) {
        continuerProgramme = false;
        System.out.println("Fin du programme. Au revoir");
        System.exit(0);
      }
    }
  }
}
