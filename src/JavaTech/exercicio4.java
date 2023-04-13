package JavaTech;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valor1,valor2,valor3,valor4,diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor: ");
		valor1 = leia.nextFloat();
		System.out.println("Entre com o segundo valor: ");
		valor2 = leia.nextFloat();
		System.out.println("Entre com o terceiro valor: ");
		valor3 = leia.nextFloat();
		System.out.println("Entre com o quarto valor: ");
		valor4 = leia.nextFloat();
		
		diferenca = (valor1*valor2)-(valor3*valor4);
		System.out.printf("A diferença é: %2.2f",+diferenca);
		
		leia.close();
		
		
	}

}
