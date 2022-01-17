
public class Computador {
	String marca;
	String cor;
	String modelo;
	int numeroSerie;
	double preco;
	
	void imprimir() {
		System.out.println("Marca: "+ this.marca);
		System.out.println("Cor: "+ this.cor);
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Numero de Serie: "+ this.numeroSerie);
		System.out.println("Preço: "+ this.preco);
	}
	
	void calcularValor() {
		if(this.marca.equals("HP")) {
			this.preco += this.preco*30/100;
		}else if(this.marca.equals("IBM")) {
			this.preco += this.preco*50/100;
		}
	}
	
	int alterarValor(double valorr) {
		valorr = this.preco;
		if(valorr > 0) {
			return 1;
		}
			return 0;
	}
		
}
