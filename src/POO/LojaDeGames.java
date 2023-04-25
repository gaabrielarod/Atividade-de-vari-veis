package POO;

import java.text.NumberFormat;

public class LojaDeGames {
	
	private String nomeJogo;
	private double valorJogo;
	private String categoriaJogo;
	private String classificacaoIndicativa;
	private int quantJogo;
	
	public LojaDeGames(String nomeJogo, double valorJogo, String categoriaJogo, String classificacaoIndicativa,
			int quantJogo) {
		super();
		this.nomeJogo = nomeJogo;
		this.valorJogo = valorJogo;
		this.categoriaJogo = categoriaJogo;
		this.classificacaoIndicativa = classificacaoIndicativa;
		this.quantJogo = quantJogo;
		
	}

	public LojaDeGames(String nomeJogo, double valorJogo, String categoriaJogo) {
		super();
		this.nomeJogo = nomeJogo;
		this.valorJogo = valorJogo;
		this.categoriaJogo = categoriaJogo;
		
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public double getValorJogo() {
		return valorJogo;
	}

	public void setValorJogo(double valorJogo) {
		this.valorJogo = valorJogo;
	}

	public String getCategoriaJogo() {
		return categoriaJogo;
	}

	public void setCategoriaJogo(String categoriaJogo) {
		this.categoriaJogo = categoriaJogo;
	}

	public String getClassificacaoIndicativa() {
		return classificacaoIndicativa;
	}

	public void setClassificacaoIndicativa(String classificacaoIndicativa) {
		this.classificacaoIndicativa = classificacaoIndicativa;
	}

	public int getQuantJogo() {
		return quantJogo;
	}

	public void setQuantJogo(int quantJogo) {
		this.quantJogo = quantJogo;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valorJogo);
		return formatoMoeda;
	}
	
	public void Imprimir() {
		System.out.println("\n\t LOJA DE GAMES ");
		System.out.println("\nJogo disponível: "+nomeJogo);
		System.out.println("\nValor do jogo: "+this.formatarMoeda());
		System.out.println("\nCategoria: "+categoriaJogo);
		
		
	}
	
	
	

}
