
public class Motor {
	// Atributos
	private String combustivel;
	private Integer potencia;
	
	// Método construtor sem argumentos
	public Motor() {
		this.combustivel = "";
		this.potencia = 0;
	}
	// Método construtor com argumentos
	public Motor(String combustivel, Integer potencia) {
		this.combustivel = combustivel;
		this.potencia = potencia;
	}
	
	// Métodos Get / Set
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public Integer getPotencia() {
		return potencia;
	}
	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}
}
