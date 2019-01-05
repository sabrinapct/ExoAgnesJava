package exoAgnesPart2_07;

import java.util.Scanner;

public class Valeurcarre {

	public static void main(String[] args) {
		int saisie; 
		int[][]t;
		System.out.print
		("combien de valeurs : ");
		Scanner sc = new Scanner (System.in);
		saisie = sc.nextInt();
		t = new int	[saisie][2];
		for(int i=0;i<saisie; i++){t[i][0]=2*i+1;t[i][1]=t[i][0]*t[i][0];}
		for(int i =0; i <saisie; i++)
		System.out.println(t[i][0]+" a pour carre "+t[i][1]);
		sc.close();
	}

}
