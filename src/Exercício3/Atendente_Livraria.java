package Exercício3;

    import javax.swing.JOptionPane;
    public class Atendente_Livraria {
	
	public static void main(String args[]) {
		
		Livraria cultura = new Livraria();
		
		String a, b, c, d, e, i, j;
		int f, g, k;
		double h;
		
		JOptionPane.showMessageDialog(null, "Categoria: digite 1 para Romance \n 2 para Espírita \n 3 para Informática");
		a = JOptionPane.showInputDialog(null, "Código");
		b = JOptionPane.showInputDialog(null, "Editora");
		c = JOptionPane.showInputDialog(null, "Autor");
		d = JOptionPane.showInputDialog(null, "Livro");
		e = JOptionPane.showInputDialog(null, "Quantidade");
		i = JOptionPane.showInputDialog(null, "Preço");
		j = JOptionPane.showInputDialog(null, "Número de Páginas");
		
		f = Integer.parseInt(a);
		g = Integer.parseInt(e);
		h = Double.parseDouble(i);
		k = Integer.parseInt(j);
		
		cultura.editora = b;
		cultura.autor = c;
		cultura.livro = d;
		cultura.quantidade = g;
		cultura.preco = h;
		cultura.paginas = k;
		
		cultura.Informa_Livros(f);
	}

}
