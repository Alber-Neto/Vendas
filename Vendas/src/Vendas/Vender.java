package Vendas;

import java.util.ArrayList;

public class Vender {

	ArrayList<Integer> carrinho = new ArrayList<Integer>();

	public Vender(ArrayList<Integer> carrinho) {
		this.carrinho = carrinho;
	}

	public ArrayList<Integer> getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(ArrayList<Integer> carrinho) {
		this.carrinho = carrinho;
	}
	
	public void adicionar(int i) {
		carrinho.add(i);
	}

	public void remover (int i) {
		carrinho.remove(i);
	}
	
	public void vender () {
		for(int i = 0;i==carrinho.size() ;i++) {
			
		}
	}
	
	
}
