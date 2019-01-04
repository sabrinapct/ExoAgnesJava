package addition;
import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);// j'appel scanner pour demander a l'utilisateur
		System.out.println("Veuillez entrer un chiffre");// j'imprime ma premiere question 
		
		try {// condition pour la  verification des nombres 
			int numb1 = sc.nextInt();// declaration du premier chiffre utilisateur
			System.out.println("veuillez choisir un chiffre a additionner");// deuxieme question a l'utilisateur
			int numb2 = sc.nextInt();// declaration du second chiffre choisi par l'utilisateur
			int sum = numb1 + numb2;// declaration de sum avec quelle formule de calcul a appliquer
			System.out.println( " L addition de vos chiffres choisi est " + sum);
			}// j'imprime la phrase plus le sum 
		
		catch (Exception e) {// exception si un int n'est pas entré 
			System.err.println("Abruti j'ai dis un chiffre");// imprime cette phrase si l'erreur est détecté 
		}
		sc.close();
	}
}
	