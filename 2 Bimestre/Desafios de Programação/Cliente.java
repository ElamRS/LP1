package aula1Controles;

public class Cliente {
	private int num_account;
	private int saldo_ini;
	private int saldo_new;
	private int tot_itens;
	private int limite_credit;
	
	// Constructors
	public Cliente() {
		
	}
	public Cliente(int num_account, int saldo_ini, int tot_itens, int limite_credit) {
		this.num_account = num_account;
		this.saldo_ini = saldo_ini;
		this.tot_itens = tot_itens;
		this.limite_credit = limite_credit;
	}
	
	// métodos para calcular e exibir o novo saldo
	public int calc_saldo() {
		return this.saldo_new = (saldo_ini + tot_itens - limite_credit); 
	}
	public void exib_saldo() {
		System.out.printf("Novo saldo de R$%.2d %s", saldo_new, saldo_new<=limite_credit ? 
				"está dentro do limite de crédito." : "excede o limite de crédito.");
	}
	
	// Getters and Setters
	public int getNum_Account() {
		return this.num_account;
	}
	
	public int getSaldo_Ini() {
		return this.saldo_ini;
	}
	
	public void setSaldo_Ini(int saldo_ini) {
		this.saldo_ini = saldo_ini;
	}
	
	public int getSaldo_New() {
		return this.saldo_new;
	}
	
	public int getTot_Itens() {
		return this.tot_itens;
	}
	
	public void setTot_Itens(int tot_itens) {
		this.tot_itens = tot_itens;
	}
	
	public int getLimite_Credit() {
		return this.limite_credit;
	}
	
	public void setLimite_Credit(int limite_credit) {
		this.limite_credit = limite_credit;
	}
}
