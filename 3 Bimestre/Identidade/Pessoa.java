import java.time.LocalDate;

public class Pessoa {
	// Atributos
	private String nome;
	private LocalDate datanascimento;
	private Identidade rg;
	
	// Construtor sem parâmetros
	public Pessoa() {
		this.nome = "";
		this.datanascimento = LocalDate.now();
		this.rg = new Identidade();
	}
	// Construtor com parâmetros
	public Pessoa(String nome, Integer year_nasc, Integer month_nasc, Integer day_nasc, String numero_rg, Integer year_emissao, Integer month_emissao, Integer day_emissao) {
		this.nome = nome;
		this.datanascimento = LocalDate.of(year_nasc, month_nasc, day_nasc);
		this.rg = new Identidade(numero_rg, year_emissao, month_emissao, day_emissao);
	}
	
	// Métodos GET/SET
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDatanascimento() {
		return this.datanascimento;
	}
	
	public void setDatanascimento(LocalDate datanascimento) {
		this.datanascimento = datanascimento;
	}
	
	public String getRG() {
		return this.rg.getNumero();
	}
	
	public void setRG(Identidade identidade) {
		this.rg = identidade;
	}
}
