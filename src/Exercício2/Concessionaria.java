package Exercício2;

import javax.swing.JOptionPane;
public class Concessionaria {
    public static void main (String args[]){

        Automovel e = new Automovel();

        String mr, md, pr, cr;
        double pc;

        mr = JOptionPane.showInputDialog("Digite a marca:");
        md = JOptionPane.showInputDialog("Digite o modelo:");
        cr = JOptionPane.showInputDialog("Digite a cor:");
        pr = JOptionPane.showInputDialog("Digite o preço:");

        pc = Double.parseDouble(pr);

        e.setMarca(mr);
        e.setModelo(md);
        e.setCor(cr);
        e.setPreco(pc); 

        System.out.println("Marca: " + e.getMarca());
        System.out.println("Modelo: " + e.getModelo());
        System.out.println("Cor: " + e.getCor());
        System.out.println("Preço: " + e.getPreco());
    }
    
}
