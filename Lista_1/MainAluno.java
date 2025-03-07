package Lista_1;

import Lista_1.src.exe_01.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        // Instancia a classe Aluno -> objeto
        Aluno obj1 = new Aluno(); // Chama construtor padrão
        System.out.println("Nome: " + obj1.nome + " | Média: " + obj1.notaFinal());
        obj1.dadosAluno();

        // Criando um aluno com dados
        Aluno obj2 = new Aluno(123, "Tiago", 19, 5.4f, 8.9f);
        System.out.println("Nome: " + obj2.nome + " | Média: " + obj2.notaFinal());
        obj2.dadosAluno();
    }
}