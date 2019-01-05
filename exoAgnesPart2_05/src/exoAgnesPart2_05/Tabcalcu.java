/*Écrire un programme permettant de remplir un tableau de 5 éléments, ensuite calcule et
affiche la somme des éléments de ce tableau.*/


package exoAgnesPart2_05;

import java.util.Scanner;

public class Tabcalcu {

	public static void main(String[] args) {

		int i; // boucle de tab
		float[] tabsaisie = new float [5];// tab de 5 cases
		int sum= 0;// somme
		System.out.println("Donner les entiers à ajouter au tableau ");
		Scanner sc = new Scanner (System.in); // scanner

		for (i=0;i<5;i++){
			tabsaisie[i]= sc.nextInt() ;
		}
		for (i=0;i<5;i++) {
			sum+=tabsaisie[i];
		}
		System.out.println("La somme des éléments saisie est égale à " + sum);
		sc.close();
	}
}

