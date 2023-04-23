package Arrays;

import java.util.Scanner;

public class vetor2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
	
		int [] vetor = new int [10];
		int x, impar = 0, par = 0, soma=0;
		float  media;
		
		for (x = 0; x<vetor.length; x++) {
			System.out.println("Digite um número: ");
			vetor[x] = leia.nextInt();
			soma += vetor[x];
		}
		
		System.out.println("\nOs elementos nos índices impares são: ");
		
		for (x = 0; x < vetor.length; x++) {
			if (x % 2 == 1) {
				impar = vetor[x];
				System.out.println(impar + " ");
			}
		}
		
		System.out.println("\nOs elementos nos índices pares são: ");
		
		for (x = 0; x < vetor.length; x++) {
			if (vetor[x] % 2 == 1) {
				par = vetor[x];
				System.out.println(par + " ");
			}
		}
		
		System.out.println("\nA soma é de: " + soma);
		
		media = soma / vetor.length;
		
		System.out.printf("A média dos elementos é de: %.2f" ,media);
	} 
}
