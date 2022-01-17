package FINAL;

public class Compra {
	protected Pedido ped;
	protected double valorTotal;
	protected Pagamento pag;
	protected int quantItens;
	protected int idCompra;

	public Pedido getPed() {
		return ped;
	}
	public void setPed(Pedido ped) {
		this.ped = ped;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Pagamento getPag() {
		return pag;
	}
	public void setPag(Pagamento pag) {
		this.pag = pag;
	}
	public int getQuantItens() {
		return quantItens;
	}
	public void setQuantItens(int quantItens) {
		this.quantItens = quantItens;
	}
	public int getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	
}
