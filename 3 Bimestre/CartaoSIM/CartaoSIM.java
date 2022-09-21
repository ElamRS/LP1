
public class CartaoSIM {
	// Atributos
	private String operadora;
	private String tamanho;
	private Integer numero;
	
	// Construtor sem parâmetros
	public CartaoSIM() {
		this.operadora = "";
		this.tamanho = "";
		this.numero = 0;
	}
	
	// Construtor com parâmetros
	public CartaoSIM(String operadora, String tamanho, Integer numero) {
		this.operadora = operadora;
		this.tamanho = tamanho;
		this.numero = numero;
	}
	
	// Métodos GET/SET
	public String getOperadora() {
		return this.operadora;
	}
	
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	public String getTamanho() {
		return this.tamanho;
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public Integer getNumero() {
		return this.numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
}
