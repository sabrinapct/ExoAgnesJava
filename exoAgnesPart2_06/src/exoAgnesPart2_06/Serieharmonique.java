package exoAgnesPart2_06;

import java.util.Scanner;

/*Question 1 :
Écrire un programme JAVA calculant la somme des n premiers termes de la "série
harmonique", c’est-à-dire la somme :
1 + 1/2 + 1/3 + 1/4 + ..... + 1/n
La valeur de n sera lue en donnée.*/


public class Serieharmonique {

	public static void main(String[] args) {
		int n, i = 1;
		float s = 0;
		System.out.println("Donner la valeur de n : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while (i<=n) {
			s += (float)1/i;
			i++;
		}
		System.out.println("La somme est : " + s);
		sc.close();
	}
}
