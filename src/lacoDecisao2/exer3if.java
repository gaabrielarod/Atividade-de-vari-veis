package lacoDecisao2;

import java.util.Scanner;

public class exer3if {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String nome;
		int idade;
		Boolean primeiraDoacao = true;
		
		System.out.println("\nDigite seu nome: ");
		nome = leia.next();
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		System.out.println("\nÉ a sua primeira doação de sangue? ");
		primeiraDoacao = leia.nextBoolean();
		
		if (primeiraDoacao == true && idade > 60 && idade <69) { 
			System.out.println("\nVocê não está apto para doar!");
		}
		else if (idade <18 || idade >69) {
			System.out.println("\nVocê não está apto para doar!");
		} else {
			System.out.println("\nVocê está apto para doar!");
		}
		leia.close();
	}
	
} 



