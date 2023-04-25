package POO;

import java.text.NumberFormat;

public class Farmacia {
	
	private String nomeRemedio;
	private double valorRemedio;
	private int quantRemedio;
	private String classificacao;
	private String tipo;
	public Farmacia(String remedio, double valor, int quantRemedio, String classificacao, String tipo) {
		super();
		this.nomeRemedio = remedio;
		this.valorRemedio = valor;
		this.quantRemedio = quantRemedio;
		this.classificacao = classificacao;
		this.tipo = tipo;
	}
	public Farmacia(String remedio, double valor, String classificacao, String tipo) {
		super();
		this.nomeRemedio = remedio;
		this.valorRemedio = valor;
		this.classificacao = classificacao;
		this.tipo = tipo;
	}
	public String getRemedio() {
		return nomeRemedio;
	}
	public void setRemedio(String remedio) {
		this.nomeRemedio = remedio;
	}
	public double getValor() {
		return valorRemedio;
	}
	public void setValor(double valor) {
		this.valorRemedio = valor;
	}
	public int getQuantRemedio() {
		return quantRemedio;
	}
	public void setQuantRemedio(int quantRemedio) {
		this.quantRemedio = quantRemedio;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valorRemedio);
		return formatoMoeda;
	}
	
	public void Imprimir() {
		System.out.println("\n\t FARMÁCIA ");
		System.out.println("Remédio: "+nomeRemedio);
		System.out.println("Valor: "+this.formatarMoeda());
		System.out.println("Classificação: "+classificacao);
		System.out.println("Tipo: "+tipo);
	}

}
