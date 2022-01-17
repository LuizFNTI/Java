package A3;

public class Operario extends Empregado {
	protected double valorProducao;
	protected double comissao;
	
	public Operario(String nome, String endereco, int telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
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
		System.out.println("Valor de Produção: " + valorProducao);
		System.out.println("Comissao: " + comissao);
		System.out.println("Salário Calculado: " + calcularSalario());
	}
}
