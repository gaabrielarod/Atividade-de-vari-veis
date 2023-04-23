package lacoDecisao2;

import java.util.Scanner;

public class exer7switch {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float numero1, numero2, resultado;
		int operacao;
		
		System.out.println("\nOperações: ");
		System.out.println("\n1 = soma");
		System.out.println("\n2 = subtração");
		System.out.println("\n3 = multiplicação");
		System.out.println("\n4 = divisão");
		
		System.out.println("\nEntre com o primeiro número: ");
		numero1 = leia.nextFloat();
		System.out.println("\nEntre com o segundo número: ");
		numero2 = leia.nextFloat();
		System.out.println("\nDigite a operação: ");
		operacao = leia.nextInt();
		
		switch (operacao) {
		case 1:
			resultado = numero1 + numero2;
			System.out.println(numero1+ " + " +numero2+ " = " +resultado);
			break;
		case 2:
			resultado = numero1 - numero2;
			System.out.println(numero1+ " - " +numero2+ " = " +resultado);
			break;
		case 3:
			resultado = numero1 * numero2;
			System.out.println(numero1+ " X " +numero2+ " = " +resultado);
			break;
		case 4:
			resultado = numero1 / numero2;
			System.out.println(numero1+ " / " +numero2+ " = " +resultado);
			break;
			
		default:
			System.out.println("Opção inválida");
		
		
		} leia.close();
		
		
		

	}


}