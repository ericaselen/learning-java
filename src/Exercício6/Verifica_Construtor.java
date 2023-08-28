package Exercício6;

public class Verifica_Construtor {
    public static void main(String args []) {
		Hotel a = new Hotel ();
		
		Hotel b = new Hotel("Nova Cidade", 220.88);
		
		System.out.println("Nome do hotel: " + a.get_nome());
		System.out.println("Preço da diária R$: " + a.get_preco());
		
		System.out.println("Nome do hotel: " + b.get_nome());
		System.out.println("Preço da diária R$: " + b.get_preco());
		
	}
}
