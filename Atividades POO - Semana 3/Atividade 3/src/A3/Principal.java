package A3;

public class Principal {

	public static void main(String[] args) {
		
		Fornecedor for1 = new Fornecedor("Luiz", "Rua", 3333, 1234.56, 1000.000);
		for1.imprimir();
		System.out.println("");
		Administrador adm1 = new Administrador("Lui", "Rua1", 3344, 1, 1200.00, 100.00, 150.00);
		adm1.imprimir();
		System.out.println("");
		Operario ope1 = new Operario("Lu", "Rua2", 5522, 2, 1800.00, 150.00, 10000.00, 1000.00); 
		ope1.imprimir();
		System.out.println("");
		Vendedor vend1 = new Vendedor("L", "Rua3", 5533, 3, 2800.00, 200.00, 20000.00, 2000.00);
		vend1.imprimir();
	}

}
