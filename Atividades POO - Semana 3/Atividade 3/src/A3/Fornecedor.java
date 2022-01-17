package A3;

public class Fornecedor extends Pessoa {
	protected double valorSaldo;
	protected double valorDivida;
	
	public Fornecedor(String nome, String endereco, int telefone, double valorSaldo, double valorDivida) {
		super(nome, endereco, telefone);
		this.valorSaldo = valorSaldo;
		this.valorDivida = valorDivida;
	}

	public double getValorSaldo() {
		return valorSaldo;
	}
	public void setValorSaldo(double valorSaldo) {
		this.valorSaldo = valorSaldo;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	double obterSaldo() {
		double diferenca;
		diferenca = (this.valorSaldo - this.valorDivida);
		return diferenca;
	}
	void imprimir() {
		System.out.println("Nome Fornecedor: " + nome);
		System.out.println("Endereço Fornecedor: " + endereco);
		System.out.println("Telefone Fornecedor: " + telefone);
		System.out.println("Saldo Fornecedor: " + valorSaldo);
		System.out.println("Divida Fornecedor: " + valorDivida);
		System.out.println("Saldo Calculado Fornecedor: " + obterSaldo());
	}

}
