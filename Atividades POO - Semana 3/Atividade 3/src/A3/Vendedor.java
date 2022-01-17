package A3;

public class Vendedor extends Empregado {
	protected double valorVenda;
	protected double comissao;
	
	public Vendedor(String nome, String endereco, int telefone, int codigoSetor, double salarioBase, double imposto, double valorVenda, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorVenda = valorVenda;
		this.comissao = comissao;
	}

	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	@Override
	double calcularSalario() {
		double salario;
		salario = (comissao + salarioBase - imposto);
		return salario;
	}
	void imprimir() {
		System.out.println("Nome Administrador: " + nome);
		System.out.println("Endereço Administrador: " + endereco);
		System.out.println("Telefone Administrador: " + telefone);
		System.out.println("Codigo Setor: " + codigoSetor);
		System.out.println("Salario Base: " + salarioBase);
		System.out.println("Imposto: " + imposto);
		System.out.println("Valor de Produção: " + valorVenda);
		System.out.println("Comissao: " + comissao);
		System.out.println("Salário Calculado: " + calcularSalario());
	}
}
