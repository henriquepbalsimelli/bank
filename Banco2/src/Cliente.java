
public class Cliente {
	String nome;
	String cpf;
	Double saldo;
	
	public Cliente(String nome, String cpf, Double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	public void depositar(Float valor) {
		this.saldo += valor;
	}
	
	public void sacar(Float valor) {
		if(saldo > valor) {
			this.saldo -= valor;
		}
	}
	

}
