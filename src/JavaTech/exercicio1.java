package JavaTech;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main (String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva seu salário: ");
		float salario = leia.nextFloat();
		
		System.out.println("Escreva seu abono: ");
		float abono = leia.nextFloat();
		
		float novoSalario = salario+abono;
		
		System.out.printf("\nO novo salário é: %.2f%n",novoSalario);
		
		leia.close();
	}

	
	
	
	
	}

