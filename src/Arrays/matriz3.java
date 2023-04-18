package Arrays;

import java.util.Scanner;

public class matriz3 {

	public static void main(String[] args) {

    Scanner leia = new Scanner(System.in);
		
		int numeros[][] = new int[3][3];
		int linha, coluna;
		int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;
		String valoresDiagonalPrincipal = " ",valoresDiagonalSecundaria = " ";
		
		
		for (linha = 0; linha < 3; linha ++) {
			for (coluna = 0; coluna < 3; coluna ++) {
				System.out.printf("\nDigite um número: " , linha, coluna);
				numeros[linha][coluna] = leia.nextInt();
				
				
				if  (linha == coluna) {
					somaDiagonalPrincipal += numeros[linha][coluna];
					valoresDiagonalPrincipal += numeros[linha][coluna]+" ";
				}
				
				if  (linha+coluna == 2) {
					somaDiagonalSecundaria += numeros[linha][coluna];
					valoresDiagonalSecundaria += numeros[linha][coluna]+" ";
				}
			}
		}
		
		
		System.out.println("\nOs elementos da diagonal principal são: \n"+valoresDiagonalPrincipal);
		
		System.out.println("\nOs elementos da diagonal secundária são: \n"+valoresDiagonalSecundaria);
		
		System.out.println("\nA somatória da diagonal principal é: "+somaDiagonalPrincipal);
		
		System.out.println("\nA somatório da diagonal secundária é: "+somaDiagonalSecundaria);

	}



	}

