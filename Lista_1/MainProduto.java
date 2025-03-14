package Lista_1;

import Lista_1.src.exe_03.Produto;

public class MainProduto {
    public static void main(String[] args) {
        // Chama construtor sem parãmetro
        Produto obj1 = new Produto();

        // Chama construtor com parâmetro
        Produto obj2 = new Produto(123, 5, "Bola de basquete", 500);

        System.out.println(obj1.exibeDetalhes());
        System.out.println(obj2.exibeDetalhes());

        obj2.comprar(3);
        obj2.subir(50);
        obj2.vender(1);
        obj2.diminuir(560);

        System.out.println(obj2.exibeDetalhes());
    }
}
