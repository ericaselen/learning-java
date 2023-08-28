package Exercício6;

public class Hotel {

	//atributos
	private String nome;
	private double preco;
	
	//método construtor recebe o nome da classe
	
	Hotel(){
		System.out.println("O método construtor inicializa os atributos com valor default");
	}
	
	Hotel(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	public String get_nome(){
		return nome;
	}
	
	public double get_preco(){
		return preco;
	}
	
}
