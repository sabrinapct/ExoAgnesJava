package exoAgnesPart2_02;

/*Écrire un programme qui lit un entier au clavier et qui l’affiche verticalement comme dans
cet exemple :*/

import java.util.Scanner;

public class ChifVert {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);                                                    //importe le scanner
		System.out.println("Veuillez entrer un nombre d'au moins 5 unités (ex: 10000) ");      //pose la question a user
		int rep = sc.nextInt();                                                                //recupere la saisie de l'entier dans rep
		String chai = String.valueOf(rep);                                                     //transformation du int en string
		for (int i=0 ; i<chai.length(); i++)                                                   //boucle qui parcours le chiffre
		System.out.println(chai.charAt(i));                                                    // imprime avec la methode char a la ligne                         
		sc.close();
	}

}
