package triangulo;
import java.util.Scanner;

public class PrincipalTrapezio {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Trapezio trap1 = new Trapezio();
		
		System.out.println("Digite a Base Maior: ");
		int B = input.nextInt();
		trap1.setBaseMaior(B);
		
		System.out.println("Digite a Base Menor: ");
		int b = input.nextInt();
		trap1.setBaseMenor(b);
		
		System.out.println("Digite a Altura: ");
		int altura = input.nextInt();
		trap1.setAltura(altura);
		
		trap1.calcularArea();
	}
}
