/*Exercice1
Écrire un programme qui lit un mot au clavier et qui indique combien de fois sont
présentes chacune des voyelles a, e, i, o, u ou y, que celles-ci soient écrites en
majuscules ou en minuscules, comme dans cet exemple :*/




package exoAgnesPart2_01;

import java.util.Scanner;

public class Voyelles {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);                //importe le scanner
		System.out.println("Veuillez entrer un mot");      //pose la question a user
		String rep = sc.nextLine();                        //recupere sa saisie dans rep
		System.out.println("Vous avez saisi : "+ rep);     // imprime la saisie de user
		
		int voye[]=new int[6];                             // initialise un tableau de 6 cases
		char voyal[]= {'a','e','y','o','i','u'};           // initialise les voyelles en char dans mon  tableau
		rep = rep.toLowerCase();                           // retourne rep en minuscules
		
		for(int i=0;i<rep.length();i++){                  // boucle qui parcours la longueur de rep
			for(int j=0;j<6;j++){                         // je sais qu'il y a 6 voyelles boucle for 
				
				if(rep.charAt(i)==voyal[j])               // Condition si dans rep il trouve les char voyelles
				{
					voye[j]++;                            // compteur qui ajoute si trouvé 
				}
			}
		}
		for(int i=0;i<6;i++){							 // boucle qui parcours mon tableau et ajoute 1 au compteur voye
			System.out.println("Il y a "+ voye[i]+" fois la lettre  " + voyal[i]);
			sc.close();
			
		}
	}
}


