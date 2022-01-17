package FINAL;

public class CartaoDeCredito implements TipoPagamento {
	public int getDiasFaturamento() {
		return 1;
	}
	
	public double getPorcentagemFinanceira() {
		return 0.1;
	}
	public String formaEscolhida() {
		return "Cartão de Crédito";
	}
}
