package FINAL;

public class Pagamento {
	protected TipoPagamento pagamento;
	protected double valor;
	
	public TipoPagamento getPagamento() {
		return pagamento;
	}
	public void setPagamento(TipoPagamento pagamento) {
		this.pagamento = pagamento;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
