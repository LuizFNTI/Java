package A3;

public class Administrador extends Empregado {
	protected double ajudaDeCusto;
	
	public Administrador(String nome, String endereco, int telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudadeCusto() {
		return ajudaDeCusto;
	}
	public void setAjudadeCusto(double ajudadeCusto) {
		this.ajudaDeCusto = ajudadeCusto;
	}
	
	@Override
	double calcularSalario() {
		double salario;
		salario = (ajudaDeCusto + salarioBase - imposto);
		return salario;
	}
	void imprimir() {
		System.out.println("Nome Administrador: " + nome);
		System.out.println("Endereço Administrador: " + endereco);
		System.out.println("Telefone Administrador: " + telefone);
		System.out.println("Codigo Setor: " + codigoSetor);
		System.out.println("Salario Base: " + salarioBase);
		System.out.println("Imposto: " + imposto);
		System.out.println("Ajuda de Custo: " + ajudaDeCusto);
		System.out.println("Salário Calculado: " + calcularSalario());
	}
}
