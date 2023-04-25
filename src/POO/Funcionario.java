package POO;

import java.text.NumberFormat;

public class Funcionario {
	
	private String nome;
	private int idade;
	private String cargo;
	private String telefone;
	private double salario;
	
	public Funcionario(String nome, int idade, String cargo, String telefone, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.telefone = telefone;
		this.salario = salario;
	}
	
	public Funcionario(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public void imprimir () {
		System.out.println("\n\t INFORMAÇÕES FUNCIONÁRIO:");
		System.out.println("\nNome: "+nome);
		System.out.println("\nIdade: "+idade);
		System.out.println("\nCargo: "+cargo);
		System.out.println("\nTelefone: "+telefone);
		System.out.println("\nSalário: "+this.formatarMoeda());
	}
	
	
	

}
