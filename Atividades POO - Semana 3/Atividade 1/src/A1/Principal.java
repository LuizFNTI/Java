package A1;

public class Principal {

	public static void main(String[] args) {
		Cilindro cil1 = new Cilindro(1, 2, 50, 80);
		
		System.out.println("O Valor de X: " + cil1.getX());
		System.out.println("O Valor de Y: " + cil1.getY());
		System.out.println("Raio: " + cil1.getRaio());
		System.out.println("Altura: " + cil1.getAltura());
		System.out.println("Área da Superficie do Cilindro: " + cil1.getArea());
		System.out.println("Volume do Cilindro: " + cil1.getVolume());
	}

}
