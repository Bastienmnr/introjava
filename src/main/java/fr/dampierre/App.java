package fr.dampierre;

import java.util.Random;
import java.util.Scanner;

public class App {

  // System.out.println( "Bonjour") ;

  // Récupérer le nombre de d'heures travaillés
  // int heuresTravaillees = 120;

  // Scanner clavier = new Scanner(System.in);
  // System.out.print("Entrez le nombre d'heures travaillées: ");
  // int heuresTravaillees = clavier.nextInt();

  // Récupérer le taux horaire
  // System.out.print("Entrez le taux horaire: ");
  // double tauxHoraire = clavier.nextDouble();

  // clavier.close();

  // Multiplier le nombre d'heures par le taux horaire
  // double salaireBrut = heuresTravaillees * tauxHoraire ;

  // Afficher le résultat}

  // System.out.print("Le salaire brut est de: ");
  // System.out.println(salaireBrut);

  // System.out.println("Le salaire brut est de : " + salaireBrut);

  // System.out.println("Votre salaire est de: "+ salaire);

  // int salaire = 400;
  // int quota = 10;
  // int prime = 250 ;
  // Scanner clavier = new Scanner(System.in);
  // System.out.print("Entrez le nombre de ventes de la semaine: ");
  // int nbVentesSemaine = clavier.nextInt();

  // if (nbVentesSemaine >= quota ) {
  // salaire = salaire + prime;
  // System.out.println(
  // "Félicitation, vous avez rempli les " + quota + " ventes, votre salaire est
  // de: " + salaire);
  // } else {
  // int ventesManquantes = quota - nbVentesSemaine;
  // System.out.println("Il vous manque " + ventesManquantes + " ventes pour
  // atteindre le quota");
  // clavier.close();

  // int coutCafe = 100 ;

  // Scanner clavier = new Scanner(System.in);

  // System.out.print ("Entrez le nombre de pièce de 1cents: ");
  // int nbrpiece1 = clavier.nextInt();

  // System.out.print ("Entrez le nombre de pièce de 5cents: ");
  // int nbrpiece5 = clavier.nextInt();

  // System.out.print ("Entrez le nombre de pièce de 10cents: ");
  // int nbrpiece10 = clavier.nextInt();

  // System.out.print ("Entrez le nombre de pièce de 20cents: ");
  // int nbrpiece20 = clavier.nextInt();

  // System.out.print ("Entrez le nombre de pièce de 50cents: ");
  // int nbrpiece50 = clavier.nextInt();

  // int piece1 = 1 * nbrpiece1 ;
  // int piece5 = 5 * nbrpiece5 ;
  // int piece10 = 10 * nbrpiece10 ;
  // int piece20 = 20 * nbrpiece20 ;
  // int piece50 = 50 * nbrpiece50 ;

  // int argentEntre = piece1 + piece5 + piece10 +piece20+ piece50 ;

  // if (argentEntre<coutCafe ) {
  // System.out.print ("Il vous manque "+ (coutCafe - argentEntre )+ " cents pour
  // acheter le café-crème" ) ;
  // }

  // else if (argentEntre == coutCafe) {
  // System.out.print ("Vous avez exactement de quoi vous payer le café-crème
  // edition spéciale !") ;
  // }
  // else {
  // System.out.print (" Il vous restera "+ (argentEntre - coutCafe) + " cents
  // après avoir pris votre café !") ;
  // }

  // public static void main(String[] args) {

  // Scanner clavier = new Scanner(System.in);
  // System.out.print("Entrez une lettre: ");
  // String entrée = clavier.nextLine();

  // if(entrée.equals("r")) {
  // System.out.println("Vous avez choisi le rouge");

  // }
  // else if (entrée.equals("v")){
  // System.out.println("Vous avez choisi le vert");

  // }
  // else if (entrée.equals("b")) {
  // System.out.println("Vous avez choisi le bleu");
  // }
  // else {System.out.println("Lettre inconnue");}

  // clavier.close();

  // Scanner clavier = new Scanner(System.in);
  // System.out.print("entrez vos heures travaillées cette semaine: ");
  // int heuresTravaillees= clavier.nextInt();
  // double tauxHoraire = 10;
  // while (heuresTravaillees>42 || heuresTravaillees<0) {
  // System.out.println("Vous devez donner un nombre entre 0 et 42: ");
  // heuresTravaillees= clavier.nextInt();
  // }
  // double salaire = tauxHoraire * heuresTravaillees;
  // System.out.println("Salaire: " + salaire);
  // clavier.close();

  // Random generateur = new Random();
  // int total = 0;
  // while (total != 20) {
  // for (int i = 0; i < 5; i++) {

  // int lancer = generateur.nextInt(6) + 1;
  // System.out.println("résultat du dé " + (i + 1) + " : " + lancer);
  // total = total + lancer;
  // System.out.println("Le pion est sur la case " + total + " !");
  // }

  // if (total > 20 || total < 20) {
  // System.out.println("Vous avez perdu");
  // total = 0 ;
  // } else {
  // System.out.println("Vous avez gagné");

  // }
  // }

  public static void main(String[] args) {

    System.out.println("Devinez au nombre auquel je pense compris entre 0 et 100 : ");
    Random generateur = new Random();
    int nombreAleatoire = generateur.nextInt(100) + 1;
    boolean gagne=false;
    int tentative =0 ;

    Scanner clavier = new Scanner(System.in);
    
    
    while (gagne=true) {;
    int nombreChoisi = clavier.nextInt();
    
    System.out.println("Vous proposez : " + nombreChoisi);
    tentative=(tentative+1);

    if (nombreAleatoire == nombreChoisi) {
      System.out.println("Vous avez trouvé " + nombreAleatoire + " ! Félicitations !");
      gagne=true;
      System.out.println("Il vous a fallu "+tentative+" tentative(s)");
    } else {
      System.out.println("Essayez encore un nombre: ");


      if (nombreAleatoire > nombreChoisi) {
        //int differencePlusGrand = (nombreAleatoire - nombreChoisi);
        //System.out.println("Le nombre auquel je pensais était : " + nombreAleatoire);
        //System.out.println("Vous étiez à " + differencePlusGrand + " de trouver la bonne réponse ");
        System.out.println("Trop petit");
         

      } else {
        //System.out.println("Le nombre auquel je pensais était : " + nombreAleatoire);
      //System.out.println("Vous étiez à " + (nombreChoisi - nombreAleatoire) + " de trouver la bonne réponse");}
      System.out.println("Trop grand");
      

    }
  }
}
  clavier.close();

  } }
