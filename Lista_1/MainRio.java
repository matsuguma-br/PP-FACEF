package Lista_1;

import Lista_1.src.exe_03.Produto;
import Lista_1.src.exe_04.Rio;

public class MainRio {
    public static void main(String[] args) {
        // Chama construtor sem parâmetro
        Rio obj1 = new Rio();
        // Chama construtor com parâmetro
        Rio obj2 = new Rio("Senna", 800, true);

        System.out.println(obj1.mostrar());
        System.out.println(obj2.mostrar());

        obj2.chover(150);
        obj2.ensolarar(30);
        obj2.limpar();

        System.out.println(obj2.mostrar());

        obj2.sujar();

        System.out.println(obj2.mostrar());
    }
}