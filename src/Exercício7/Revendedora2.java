package Exercício7;

public class Revendedora2 {
    public static void main (String args[]){

        Automovel_II C = new Automovel_II(2000, "Ford", 5000.00);

        C.mostracarro();

        C = null;
        System.gc();
        C.mostracarro();
    }
}
