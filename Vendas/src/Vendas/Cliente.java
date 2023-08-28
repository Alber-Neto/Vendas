package Vendas;

public class Cliente {

	String nome;
	int id_documento;
	int numero_documento;
	String data_de_nascimento ;
	public Cliente(String nome, int id_documento, int numero_documento, String data_de_nascimento) {
		super();
		this.nome = nome;
		this.id_documento = id_documento;
		this.numero_documento = numero_documento;
		this.data_de_nascimento = data_de_nascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId_documento() {
		return id_documento;
	}
	public void setId_documento(int id_documento) {
		this.id_documento = id_documento;
	}
	public int getNumero_documento() {
		return numero_documento;
	}
	public void setNumero_documento(int numero_documento) {
		this.numero_documento = numero_documento;
	}
	public String getData_de_nascimento() {
		return data_de_nascimento;
	}
	public void setData_de_nascimento(String data_de_nascimento) {
		this.data_de_nascimento = data_de_nascimento;
	}
	
	
	
}
