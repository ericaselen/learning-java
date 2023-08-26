package Exercício5;

import javax.swing.JOptionPane;
public class Informa_dados {
    public static void main (String [] args) {

        Dados_Contribuinte a = new Dados_Contribuinte();

        String nm, cpf, cnpj, ct;

        nm = JOptionPane.showInputDialog(null, "Insira o nome: ");
        cpf = JOptionPane.showInputDialog(null, "Insira o CPF: ");
        cnpj = JOptionPane.showInputDialog(null, "Insira o CNPJ: ");
        ct = JOptionPane.showInputDialog(null, "Insira o RG: ");

        a.setNome(nm);
        a.setCPF(cpf);
        a.setCNPJ(cnpj);
        a.setCartao(ct);

        System.out.println("Nome do contribuinte: " + a.getNome());
        System.out.println("CPF do contribuinte: " + a.getCPF());
        System.out.println("CNPJ do contribuinte: " + a.getCNPJ());
        System.out.println("Cartão do contribuinte: " + a.getCartao());
    }
}
