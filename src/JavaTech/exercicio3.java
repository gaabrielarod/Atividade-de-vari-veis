package JavaTech;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto,adicionalNoturno,horasExtras,descontos,salarioLiquido;
		
		System.out.println("Digite o seu salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o seu adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite as horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite seu desconto: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto+adicionalNoturno+(horasExtras*5)-descontos;
		
		System.out.println("Seu salário líquido é: "+String.format("%.2f", salarioLiquido));
		
		leia.close();
		
		
		
		
		
		
	}

}
