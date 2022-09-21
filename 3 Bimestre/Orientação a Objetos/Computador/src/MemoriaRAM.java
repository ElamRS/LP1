
public class MemoriaRAM {
	// Atributos
	private String marca;
	private Integer tamanho;
	
	// Construtor sem argumentos
	public MemoriaRAM() {
		
	}
	// Construtor com argumentos
	public MemoriaRAM(String marca, Integer tamanho) {
		this.marca = marca;
		this.tamanho = tamanho;
	}
	
	// Métodos Get / Set
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getTamanho() {
		return this.tamanho;
	}
	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}
}
