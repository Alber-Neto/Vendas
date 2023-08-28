package Vendas;

public class Produtos {
	String nome;
	int id,categoria_id;
	float valor;
	double quantidade;
	public Produtos(String nome, int id, int categoria_id, float valor, double quantidade) {
		this.nome = nome;
		this.id = id;
		this.categoria_id = categoria_id;
		this.valor = valor;
		this.quantidade = quantidade;
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
	public int getCategoria_id() {
		return categoria_id;
	}
	public void setCategoria_id(int categoria_id) {
		this.categoria_id = categoria_id;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	

}
