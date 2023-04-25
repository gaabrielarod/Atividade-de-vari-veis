package POO;

import java.text.NumberFormat;

public class Ingresso {

	private String showIngresso;
	private int quantIngresso;
	private double valorUnitarioIngresso;
	private String tipoIngresso;
	private int codigoIngresso;
	
	
	public Ingresso(String showIngresso, int quantIngresso, double valorUnitarioIngresso, String tipoIngresso,
			int codigoIngresso) {
		super();
		this.showIngresso = showIngresso;
		this.quantIngresso = quantIngresso;
		this.valorUnitarioIngresso = valorUnitarioIngresso;
		this.tipoIngresso = tipoIngresso;
		this.codigoIngresso = codigoIngresso;
	}


	public String getShowIngresso() {
		return showIngresso;
	}


	public void setShowIngresso(String showIngresso) {
		this.showIngresso = showIngresso;
	}


	public int getQuantIngresso() {
		return quantIngresso;
	}


	public void setQuantIngresso(int quantIngresso) {
		this.quantIngresso = quantIngresso;
	}


	public double getValorUnitarioIngresso() {
		return valorUnitarioIngresso;
	}


	public void setValorUnitarioIngresso(double valorUnitarioIngresso) {
		this.valorUnitarioIngresso = valorUnitarioIngresso;
	}


	public String getTipoIngresso() {
		return tipoIngresso;
	}


	public void setTipoIngresso(String tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}


	public int getCodigoIngresso() {
		return codigoIngresso;
	}


	public void setCodigoIngresso(int codigoIngresso) {
		this.codigoIngresso = codigoIngresso;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valorUnitarioIngresso);
		return formatoMoeda;
	}
	
	public void Imprimir() {
		
		System.out.println("\nEvento: "+showIngresso);
		System.out.println("\nValor unitário: "+this.formatarMoeda());
		System.out.println("\nQuantidade de ingressos: "+quantIngresso);
		System.out.println("\nTipo de ingresso: "+tipoIngresso);
		System.out.println("\nCódigo do ingresso: "+codigoIngresso);
	}
	
	
	
	
}
