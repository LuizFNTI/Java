package FINAL;

public class Boleto implements TipoPagamento {

	public int getDiasFaturamento() {
		return 3;
	}

	public double getPorcentagemFinanceira() {
		return 0.05;
	}
	public String formaEscolhida() {
		return "Boleto";
	}
}
