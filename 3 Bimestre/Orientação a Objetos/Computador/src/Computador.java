
public class Computador {
	// Atributos
	private String marca;
	private MemoriaRAM MemoriaRam;
	private Processador processador;
	
	// Construtor sem argumentos
	public Computador() {
		this.marca = "";
		this.MemoriaRam = new MemoriaRAM();
		this.processador = new Processador();
	}
	
	// Construtor com argumentos
	public Computador(String marca, String MemoriaRAM, String marca_processador, Integer velocidade, String marca_memoriaRam, Integer tamanho) {
		this.marca = marca;
		this.MemoriaRam = new MemoriaRAM(marca_memoriaRam, tamanho);
		this.processador = new Processador(marca_processador, velocidade);
	}
	
	// Métodos Get / Set
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public MemoriaRAM getMemoriaRAM() {
		return this.MemoriaRam;
	}
	
	public void setMemoriaRAM(String marca_memoriaRam, Integer tamanho) {
		this.MemoriaRam.setMarca(marca_memoriaRam);
	}
	
	public Processador getProcessador() {
		return this.processador;
	}
	
	public void setProcessador(String marca_processador, Integer velocidade) {
		this.processador.setMarca(marca_processador);
		this.processador.setVelocidade(velocidade);
	}
}
