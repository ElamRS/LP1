import java.time.LocalDate;

public class Identidade {
	// Atributos
	private String numero;
	private LocalDate dataemissao;
	
	// Construtor sem parâmetros
	public Identidade() {
		this.numero = "";
		this.dataemissao = LocalDate.now();
	}
	// Construtor com parâmetros
	public Identidade(String numero, Integer year, Integer month, Integer day) {
		this.numero = numero;
		this.dataemissao = LocalDate.of(year, month, day);
	}
	
	// Métodos GET/SET.of(year, month, day)
	public String getNumero() {
		return this.numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public LocalDate getDataemissao() {
		return this.dataemissao;
	}
	
	public void setDataemissao(LocalDate datanascimento) {
		this.dataemissao = datanascimento;
	}
	
}
