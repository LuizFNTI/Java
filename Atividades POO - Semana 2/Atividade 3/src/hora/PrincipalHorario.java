package hora;
import java.util.Scanner;

public class PrincipalHorario {

	public static void main(String[] args) {
		int horaa; 
		int min; 
		int seg;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Defina a Hora: ");
		horaa = input.nextInt();
		
		System.out.println("Defina o Minuto: ");
		min = input.nextInt();
		
		System.out.println("Defina o Segundo: ");
		seg = input.nextInt();
		
		Horario h1 = new Horario(horaa, min, seg);
		
		int i;
		for(i = 1; i < 5000; i++) {
		h1.inclementarSegundo();
		h1.mostrtarHorario();
		}
	}
}
