package Exercício9;

public class Conceito_Herança {
    
    public static void main(String args[]){

        Classe_Filha_2 a = new Classe_Filha_2();

        a.set_atributo_1("Valor do atributo 1");
        a.set_atributo_2("Valor do atributo 2");
        System.out.println(a.get_atributo_1());
        System.out.println(a.get_atributo_2());
    }
}
