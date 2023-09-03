package Exercício7;

public class Automovel {
    
    private int ano;
    private String marca;
    private String modelo;
    private static String cor;
    private double preco;

    Automovel(){}

    Automovel (int ano, String marca, String modelo, double preco){
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    static {
        cor = "verde";
    }

    public void mostracarro() {
        System.out.println("\n" + "Carro marca:" + "\t" + marca + "\n" + "Modelo: \t" + modelo + "\n" + "Ano: \t" + ano + "\n" + "Cor: \t" + cor + "\n" + "Preço: \t" + preco);
    }
}
