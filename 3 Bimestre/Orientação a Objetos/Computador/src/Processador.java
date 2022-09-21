
public class Processador {
	// Atributos
	private String marca;
	private Integer velocidade;
	
	// Construtor sem argumentos
	public Processador() {
		this.marca = "";
		this.velocidade = 0;
	}
	// Construtor com argumentos
	public Processador(String marca, Integer velocidade) {
		this.marca = marca;
		this.velocidade = velocidade;
	}
	
	// Métodos Get / Set
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Integer getVelocidade() {
		return this.velocidade;
	}
	
	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}
}
