
public class Tempo {
	// Atributos da classe Tempo
	private Integer horas;
	private Integer minutos;
	private Integer segundos;
	
	// Método Construtor sem argumentos
	public Tempo() {
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
	}
	// Método Construtor com argumentos
	public Tempo(Integer hr, Integer min, Integer sec) {
		this.horas = hr;
		this.minutos = min;
		this.segundos = sec;
	}
	
	// A) Métodos Getters and Setters
	public Integer getHoras() {
		return this.horas;
	}
	
	public void setHoras(Integer hr) {
		this.horas = hr;
	}
	
	public Integer getMinutos() {
		return this.minutos;
	}
	
	public void setMinutos(Integer min) {
		this.minutos = min;
	}
	
	public Integer getSegundos() {
		return this.segundos;
	}
	
	public void setSegundos(Integer sec) {
		this.segundos = sec;
	}
	
	// B) Método para imprimir os atributos no formato hh:mm:ss
	public void formatar() {
		System.out.println(this.horas + ":" + this.minutos + ":" + this.segundos);
	}
	
	// C) Método horasemsegundos que não recebe argumentos e retorna a quantidade de horas em segundos se horas for maior que 0
	public Integer horasemsegundos(Integer hr) {
		if (hr>0) {
			return 0;
		} else {
			return hr*3600;
		}
	}
	// D) Método horasemsegundos que não recebe argumentos e retorna a quantidade de horas em segundos se horas for maior que 0
	public Integer minutosemsegundos(Integer min) {
		if (min>0) {
			return 0;
		} else {
			return min*60;
		}
	}
}
