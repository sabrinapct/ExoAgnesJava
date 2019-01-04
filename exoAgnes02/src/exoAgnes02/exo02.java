package exoAgnes02;

import java.util.Scanner;

//Écrire un programme permettant de lire le nom et le prénom d'un étudiant, ensuite
//transforme le nom en majuscule, la première lettre du prénom en majuscule et le reste en
//minuscule.

public class exo02 {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez votre nom : ");
        String nom = sc.nextLine();
        System.out.println("Entrez votre prénom : ");
        String prenom = sc.nextLine();

        System.out.println(nom +" "+prenom);

        System.out.println(nom.toUpperCase() );
        System.out.println(Character.toString(prenom.charAt(0)).toUpperCase()+prenom.substring(1));
        sc.close();		
}
}