import java.util.Scanner;

public class PrincipalComputador {

	public static void main(String[] args) {
		
		Computador comp1 = new Computador();
		Computador comp2 = new Computador();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dugite a Marca: ");
		comp1.marca = input.nextLine();
		
		System.out.println("Dugite a Cor: ");
		comp1.cor = input.nextLine();
		
		System.out.println("Dugite o Modelo: ");
		comp1.modelo = input.nextLine();
		
		System.out.println("Dugite o Numero de Série: ");
		comp1.numeroSerie = input.nextInt();
		
		System.out.println("Dugite o Preço: ");
		comp1.preco = input.nextDouble();
		
		comp1.calcularValor();
		comp1.imprimir();
		
		System.out.println("Dugite o novo Preço: ");
		double novoValor = comp1.preco;
		comp1.preco = input.nextDouble();
		comp1.alterarValor(novoValor);
		comp1.calcularValor();
		comp1.imprimir();
	}
}
