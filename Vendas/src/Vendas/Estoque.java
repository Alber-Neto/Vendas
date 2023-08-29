package Vendas;

import java.util.ArrayList;

public class Estoque {
	ArrayList<Produtos> Estoque = new ArrayList<Produtos>();

	public Estoque(ArrayList<Produtos> estoque) {
		Estoque = estoque;
	}
	
	public void adicionar(Produtos produto) {
		Estoque.add(produto);
	}

	public void remover (int i) {
		Estoque.remove(i);
	}
	
	public ArrayList<Produtos> getEstoque() {
		return Estoque;
	}

	public void setEstoque(ArrayList<Produtos> estoque) {
		Estoque = estoque;
	}
}
