package lacoDecisao;

import java.util.Scanner;

public class exer2if {
	
	public static void main(String[]args) {
		
		Scanner leia = new Scanner (System.in);
		
		int valor1;
		
		System.out.println("Digite um número: ");
		valor1 = leia.nextInt();
		
		
		if (valor1>=0 && valor1 % 2 == 0) {
			System.out.println(valor1+" é positivo e par ");
		}
		else if (valor1<0 && valor1 % 2 == 0) {
			System.out.println(valor1+" é negativo e par ");
		} 
		else if (valor1>=0 && valor1 % 2 == 1) {
			System.out.println(valor1+" é positivo e impar ");
		}
		else {
			System.out.println(valor1+" é negativo e impar ");
		}
	}
	

}
