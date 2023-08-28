package Vendas;

public class Fornecedor {
	String nome;
	int id;
	String telefone;
	String data;
	public Fornecedor(String nome, int id, String telefone, String data) {
		super();
		this.nome = nome;
		this.id = id;
		this.telefone = telefone;
		this.data = data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
}
