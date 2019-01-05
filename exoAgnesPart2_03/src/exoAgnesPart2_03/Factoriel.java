package exoAgnesPart2_03;

import java.util.Scanner;

/*Exercice 3
Écrire une fonction permettant de calculer le factoriel d’un entier saisi au clavier.
Sachant que :
N ! = N * (N – 1) !
1! = 0! = 1
En mathématiques, la factorielle d'un entier naturel n est le produit des nombres entiers
 strictement positifs inférieurs ou égaux à n. Cette opération est notée avec un point 
 d'exclamation : n! ce qui se lit soit « factorielle de n », soit 
« factorielle n » soit « n factorielle »
*/

public class Factoriel {

	public static int fact(int n) {             // creation de fonction fact 
			if (n == 1 || n == 0)               
				return 1;
			return n * fact(n - 1);
		}
	 
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println(" Choississez un nombre pour obtenir son factoriel: ");
			int n = sc.nextInt();
			System.out.println("Le factoriel de " + n + " est :" + fact(n));
			sc.close();
		}
}


