package Lista_1;

import Lista_1.src.exe_00.Carro;

public class MainCarro {
    public static void main(String[] args) {
        // Criando objetos da classe Carro
        Carro obj1 = new Carro();
        obj1.ano = 2015;
        obj1.velocidade = 0.0f;
        obj1.marca = "Chevrolet";
        obj1.modelo = "Onix";

        obj1.exibirDetalhes();
        obj1.acelerar(60);
        obj1.frear(20);
        obj1.exibirDetalhes(); // Velocidade esperada: 40

        Carro obj2 = new Carro(2018, 30.0f, "Volks", "Gol");
        obj2.exibirDetalhes();
        obj2.acelerar(50);
        obj2.frear(100); // Deve exibir "Freagem não ocorreu"
        obj2.exibirDetalhes(); // Velocidade esperada: 80 (caso a freagem falhe)

        Carro obj3 = new Carro();
        obj3.exibirDetalhes();
    }
}