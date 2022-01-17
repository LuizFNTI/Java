package FINAL;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		if(dia >= 1 && dia <= 31)
			this.dia = dia;
		else {
			dia = 1;
			System.err.println("Dia invalido. Dia 1 Definido");
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if(mes >= 1 && mes <= 12) {
			this.mes = mes;	
		}
		else {
			this.mes = 1;
			System.err.println("Mês inválido. Mês 1 definido.");
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
}
