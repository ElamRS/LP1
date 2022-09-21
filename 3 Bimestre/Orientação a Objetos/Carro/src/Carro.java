
public class Carro {
	// Atributos
	private String marca;
	private String modelo;
	private Motor motor;
	
	// Método construtor sem argumentos
	public Carro() {
		this.marca = "";
		this.modelo = "";
		this.motor = new Motor();
	}
	
	// Método construtor com argumentos
	public Carro(String marca, String modelo, String combustivel, Integer potencia) {
		this.marca = marca;
		this.modelo = modelo;
		this.motor = new Motor(combustivel, potencia);
	}
	
	// Métodos Get / Set
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	public Motor getMotor() {
		return this.motor;
	}
	
	public void setMotor(String combustivel, Integer potencia) {
		this.motor.setCombustivel(combustivel);
		this.motor.setPotencia(potencia);
	}
}
