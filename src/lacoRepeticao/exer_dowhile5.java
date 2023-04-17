package lacoRepeticao;

import java.util.Scanner;

public class exer_dowhile5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero, somapos=0, x=0;
		
		do {
			
			System.out.println("Entre com um número:");
			numero = leia.nextInt();
			
			
			if (numero > 0) {
				somapos = somapos + numero;
			}
			
			
		} while (numero != 0);
		
		System.out.println("A soma dos números positivos é: "+somapos);
		}
	}


