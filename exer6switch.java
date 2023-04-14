package lacoDecisao;

import java.util.Scanner;

public class exer6switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		String nome;
		int codigo;
		float salario;
		double salarioNovo, reajusteSalario;
		
		System.out.println("Segue a tabela com o código para cada cargo:");
		System.out.println("1 - Gerente");
		System.out.println("2 - Vendedor");
		System.out.println("3 - Supervisor");
		System.out.println("4 - Motorista");
		System.out.println("5 - Estoquista");
		System.out.println("6 - Técnico de TI");
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite o código respectivo ao seu cargo: ");
		codigo = leia.nextInt();
		
		System.out.println("Digite o seu salário: ");
		salario = leia.nextFloat();
		
		switch(codigo) {
		case 1:
			reajusteSalario = 0.10;
			salarioNovo = salario + (salario * reajusteSalario ) ;
			System.out.println(nome+" seu cargo é Gerente e o reajuste do seu salário ficou: "+salarioNovo);
			break;
		case 2:
			reajusteSalario = 0.07;
			salarioNovo = salario + (salario * reajusteSalario ) ;
			System.out.println(nome+" seu cargo é Vendedor e o reajuste do seu salário ficou: "+salarioNovo);
			break;
		case 3:
			reajusteSalario = 0.09;
			salarioNovo = salario + (salario * reajusteSalario ) ;
			System.out.println(nome+" seu cargo é Supervisor e o reajuste do seu salário ficou: "+salarioNovo);
			break;
		case 4:
			reajusteSalario = 0.06;
			salarioNovo = salario + (salario * reajusteSalario ) ;
			System.out.println(nome+" seu cargo é Motorista e o reajuste do seu salário ficou: "+salarioNovo);
			break;
		case 5:
			reajusteSalario = 0.05;
			salarioNovo = salario + (salario * reajusteSalario ) ;
			System.out.println(nome+" seu cargo é Estoquista e o reajuste do seu salário ficou: "+salarioNovo);
			break;
		case 6:
			reajusteSalario = 0.08;
			salarioNovo = salario + (salario * reajusteSalario ) ;
			System.out.println(nome+" seu cargo é Técnico de TI e o reajuste do seu salário ficou: "+salarioNovo);
			break;
			
			default:
				System.out.println("Erro");
			
		}
		
	}

}
