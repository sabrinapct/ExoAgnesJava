package exoAgnesPart2_08;

import java.util.Scanner;

public class Affichage {

	public static void main(String[] args) {

		int n,i,j;
		System.out.print("Donnez la valeur de n : ");
		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();
		for(i= 0; i< n;i++){
			for(j=0; j < n -i-1; j++) 
				System.out.print(" ");
			for(j = 0; j <= i *2; j++) 
				System.out.print("*");
			System.out.println();
			sc.close();
		}
	}
}


