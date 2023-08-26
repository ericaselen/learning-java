package Exercício5;

public class Informa_dados {
    public static void main (String [] args) {
        Dados_Contribuinte a = new Dados_Contribuinte();
        a.setNome("Érica Marcondes");
        a.setCPF("000.000.000-01");
        a.setCNPJ("000.000.00/0001");
        a.setCartao("00.000.000-X");
        System.out.println("Nome do contribuinte: " + a.getNome());
        System.out.println("CPF do contribuinte: " + a.getCPF());
        System.out.println("CNPJ do contribuinte: " + a.getCNPJ());
        System.out.println("Cartão do contribuinte: " + a.getCartao());
    }
}
