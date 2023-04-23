package Arrays;

import java.util.Scanner;

public class matriz4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float notas [][] = new float [10][4];
		float somanotaAluno = 0;
		int linha, coluna;
		float mediaAluno [] = new float [10];
		
		for (linha = 0; linha < notas.length; linha ++) {
			for (coluna = 0; coluna <4; coluna++) {
				System.out.printf("\nDigite sua nota:  ");
				notas[linha][coluna] = leia.nextFloat();
				somanotaAluno += notas[linha][coluna];				
			}
			
			mediaAluno[linha] = somanotaAluno / 4;
			somanotaAluno = 0;
			
			System.out.println("\nA média das notas é: "+mediaAluno[linha]);
			
			
		}
		 for (int i = 0; i < mediaAluno.length; i++) {
			 System.out.printf("\nVetor: %.1f", mediaAluno[1]);
		 }
	}

}
 