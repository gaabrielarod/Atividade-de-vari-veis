package lacoDecisao;

import java.util.Scanner;

public class exer5switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		float valorTotal;
		int quantidade,codigo;
		
		System.out.println("Nosso cardápio");
		System.out.println("1 - Cachorro quente R$ 10,00");
		System.out.println("2 - X-salada R$15,00");
		System.out.println("3 - X-bacon R$18,00");
		System.out.println("4 - Bauru R$12,00");
		System.out.println("5 - Refrigerante R$8,00");
		System.out.println("6 - Suco de laranja R$13,00");
		
		System.out.println("Digite o número correspondente ao produto que você quer: ");
		codigo = ler.nextInt();
		
		System.out.println("Digite a quantidade do produto: ");
		quantidade = ler.nextInt();
		
		switch(codigo) {
		case 1:
			valorTotal = quantidade * 10;
			System.out.println("O valor total deu "+valorTotal);
			System.out.println("Qual será a forma de pagamento?");
			break;
		case 2:
			valorTotal = quantidade * 15;
			System.out.println("O valor total deu "+valorTotal);
			System.out.println("Qual será a forma de pagamento?");
			break;
		case 3:
			valorTotal = quantidade * 18;
			System.out.println("O valor total deu "+valorTotal);
			System.out.println("Qual será a forma de pagamento?");
			break;
		case 4:
			valorTotal = quantidade * 12;
			System.out.println("O valor total deu "+valorTotal);
			System.out.println("Qual será a forma de pagamento?");
			break;
		case 5:
			valorTotal = quantidade * 8;
			System.out.println("O valor total deu "+valorTotal);
			System.out.println("Qual será a forma de pagamento?");
			break;
		case 6:
			valorTotal = quantidade * 13;
			System.out.println("O valor total deu "+valorTotal);
			System.out.println("Qual será a forma de pagamento?");
			break;
			
		default:
				System.out.println("Opção inválida");
		}
	}

}
