package Vendas;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		ArrayList<Produtos> estoque = new ArrayList<Produtos>();
		Estoque estoque1=new Estoque(estoque);
		while(true){
			int opcao;Scanner input = new Scanner(System.in);
			System.out.println("Escolha uma opção");
			System.out.println("1 - adicionar produto");
			System.out.println("2 - remover produto");
			System.out.println("3 - ver produtos");
			System.out.println("0 - sair");
			opcao=input.nextInt();
			
			if(opcao==0) {
				System.exit(0);
			}
			
			if(opcao==1) {
				String nome;
				int id,categoria_id;
				float valor;
				double quantidade;
				System.out.println("digite o nome do produto");
				nome=input.next();
				System.out.println("digite o id do produto");
				id=input.nextInt();
				System.out.println("digite o id da categoria");
				categoria_id=input.nextInt();
				System.out.println("digite o valor do produto");
				valor=input.nextFloat();
				System.out.println("digite a quantidade");
				quantidade=input.nextDouble();
				Produtos produto = new Produtos(nome, id, categoria_id, valor, quantidade);
				estoque1.adicionar(produto);
			}
			
			if(opcao==2) {
				int aux;
				System.out.println("digite o indice a ser removido");
				aux=input.nextInt();
				estoque1.remover(aux);
			}
			
			if(opcao==3) {
				estoque1.getEstoque();
			}
		}
	}
	}


