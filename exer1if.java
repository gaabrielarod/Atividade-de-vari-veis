package lacoDecisao;

import java.util.Scanner;

public class exer1if {

	public static void main(String[] args) {

		float valor1, valor2, valor3, soma;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número A: ");
		valor1 = leia.nextFloat();
		System.out.println("Digite o número B: ");
		valor2 = leia.nextFloat();
		System.out.println("Digite o número C: ");
		valor3 = leia.nextFloat();

		soma = valor1 + valor2;

		if (soma > valor3) {
			System.out.println("A soma de A + B é maior que C");
		} else if (soma < valor3) {
			System.out.println("A soma de A + B é menor que C");
		} else if (soma == valor3) {
			System.out.println("A soma de A + B igual a C");
		}

	}

}
