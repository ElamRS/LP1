
public class Mobile {
	// Atributos
	private String modelo;
	private String marca;
	private CartaoSIM cartao; // atributo do tipo CartaoSIM
	
	// Construtor sem parâmetros
	public Mobile() {
		this.modelo = "";
		this.marca = "";
		this.cartao = new CartaoSIM(); // Instanciação do objeto cartao
	}
	
	// Construtor com parâmetros
	public Mobile(String modelo, String marca, String operadora, String tamanho, Integer numero) {
		this.modelo = modelo;
		this.marca = marca;
		this.cartao.setOperadora(operadora);
		this.cartao.setTamanho(tamanho);
		this.cartao.setNumero(numero);
	}
	
	// Métodos GET/SET
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public CartaoSIM getCartao() {
		return this.cartao;
	}
	
	public void setCartao(CartaoSIM cartao) {
		this.cartao = cartao;
	}
}
