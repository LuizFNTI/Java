package hora;

public class Horario {
	private int hora;
	private int minuto;
	private int segundo;
	
	public Horario(int hora, int minuto, int segundo) {
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo); 
	}
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		if(hora >= 00 && hora <= 23) {
		this.hora = hora;
		}else {
			hora = 1;
			System.out.println("Hora Invalida");
		}
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		if(minuto >= 00 && minuto <= 59) {
		this.minuto = minuto;
		}else {
			minuto = 1;
			System.out.println("Minuto Invalida");
		}
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		if(segundo >= 00 && minuto <= 59) {
		this.segundo = segundo;
		}else {
			segundo = 1;
			System.out.println("Segundo Invalida");
		}
	}

	@Override
	public String toString() {
		return hora + ":" + minuto + ":" + segundo;
	}
	void mostrtarHorario() {
		System.out.println("Hora Definida: " + toString());
	}
	
	void inclementarSegundo() {
		segundo++;
		if(segundo > 59) {
			segundo = 00;
			minuto++;
		}
		else if(minuto > 59) {
			minuto = 00;
			hora++;		
		}
		else if(hora > 23) {
			hora = 00;
		}
	}
}
