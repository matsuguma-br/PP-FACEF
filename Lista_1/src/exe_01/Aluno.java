package Lista_1.src.exe_01;

public class Aluno {
    // Variáveis
    public int nroAluno, idade;
    public String nome;
    public float p1, p2;

    // Construtor padrão
    public Aluno() {
        this.nome = "Sem nome";
    }

    // Construtor com parâmetros
    public Aluno(int nroAluno, String nome, int idade, float p1, float p2) {
        this.nroAluno = nroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    // Calcula a nota final
    public float notaFinal() {
        return (this.p1 + this.p2) / 2;
    }

    // Verifica se o aluno passou
    public String passou() {
        return (this.notaFinal() >= 6) ? "Passou" : "Não Passou";
    }

    // Exibe os dados do aluno
    public void dadosAluno() {
        System.out.println("Nome: " + this.nome +
                " | Nro. Aluno: " + this.nroAluno +
                " | Idade: " + this.idade +
                " | Situação: " + this.passou());
    }
}