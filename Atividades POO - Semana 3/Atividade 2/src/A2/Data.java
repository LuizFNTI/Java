package A2;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int d, int m, int a) {
		this.setDia(d);
		this.setMes(m);
		this.setAno(a);
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int d) {
		if(d >= 1 && d <= 31)
			dia = d;
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
