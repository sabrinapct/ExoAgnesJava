/*
Générer un nombre aléatoire compris entre 0 et 1000. Demander ensuite à l’utilisateur de
deviner le nombre choisi par l’ordinateur. Il doit saisir un nombre compris entre 0 et 1000
lui aussi. Comparer le nombre saisi avec celui choisi par l’ordinateur et afficher sur la
console « c’est plus » ou « c’est moins » selon le cas. Recommencer jusqu’à ce que
l’utilisateur trouve le bon nombre. Afficher alors le nombre d’essais nécessaires pour
trouver la bonne réponse.
Indice : pour récupérer les caractères saisis au clavier, nous avons à notre disposition le
flux System.in. Malheureusement, celui-ci ne propose que des fonctions rudimentaires
pour la récupération des saisies de l’utilisateur (lecture caractère par caractère). Pour une
utilisation plus confortable, il vaut mieux utiliser un objet Scanner. Nous aurons ainsi à
notre disposition une série de fonctions permettant la récupération d’entiers, de float, de
chaînes de caractères... Ces fonctions sont nommées nextxxxx où xxxx doit être remplacé
par le type de données que l’on souhaite obtenir, par exemple nextInt pour un entier,
nextLine pour une chaîne de caractères, etc.
String chaine;
Scanner sc;
sc=new Scanner(System.in);
chaine=sc.nextLine();
Exercice 7
Ajouter au jeu de l’exercice 6 l’affichage du temps mis par l’utilisateur pour obtenir la
bonne réponse
*/



package exoAgnes0607;

import java.util.Random;
import java.util.Scanner;

public class ChiffreMystere {

	public static void main(String[] args) {
		
		int Nombre = 0; //initialisation nombre 
		int nbrEssais = 0;// compteur
	    Random rand = new Random();// declaration chiffre aleatoire avec methode random
	    int NombreMystere = rand.nextInt(1001); // attribution du chiffre aleatoire au nbr mystere

	    System.out.println("Trouvez le nombre mystere entre 0 et 1000 !"); // question user
	    
	        do{
	        Scanner nombre = new Scanner(System.in);
	        System.out.println("Veuillez entrer un nombre...");
	        Nombre=nombre.nextInt();       
	         
	        if (Nombre<NombreMystere) // condition si nbr choisi est inferieur au nbr mystere
	            {
	            System.out.println("C est plus ! ");// imprime c'est plus
	            nbrEssais++;
	            }
	        else if (Nombre >NombreMystere)// sinon si le nbr et plus grand 
	            {
	            System.out.println("C est moins !");// imprime c'est moins
	            nbrEssais++;
	            }
	        else // sinon le nbr est trouvé imprime le nbr essais + felicitation
	            {
	            System.out.println("Trouver en " + nbrEssais + " essais ! Bien Joué !");
	            }
	        }
	        while(Nombre!=NombreMystere);
	     
	             
	    }

	}


