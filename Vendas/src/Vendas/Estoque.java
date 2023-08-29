package Vendas;

import java.util.ArrayList;

public class Estoque {
	ArrayList<Produtos> estoque = new ArrayList<Produtos>();

	public Estoque(ArrayList<Produtos> estoque) {
		this.estoque = estoque;
	}
	
	public void adicionar(Produtos produto) {
		estoque.add(produto);
	}

	public void remover (int i) {
		estoque.remove(i);
	}
	
	

	public ArrayList<Produtos> getEstoque() {
		return estoque;
	}

	public String getEstoque_nome(int i) {
		return estoque.get(i).getNome();
		}
		
	
	
	public void setEstoque(ArrayList<Produtos> estoque) {
		this.estoque = estoque;
	}
}
