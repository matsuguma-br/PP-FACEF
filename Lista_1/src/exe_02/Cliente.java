package Lista_1.src.exe_02;

public class Cliente {
    // Variáveis
    public int nroAgencia, nroConta; // Tipo primitivo
    public String nome; // Tipo de classe
    public float saldo; // Tipo primitivo

    // Construtor sem parâmetros
    public Cliente() {
        this.nome = "Sem nome";
    }

    // Construtor com parâmetros
    public Cliente(int nroAgencia, int nroConta, String nome, float saldo) {
        this.nroAgencia = nroAgencia;
        this.nroConta = nroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    // Realizar depósito
    public void depositar(float x) {
        this.saldo += x;
        System.out.println("Depósito realizado: " + x);
    }

    // Exibir detalhes do cliente
    public void exibirDetalhes() {
        System.out.println("Nro. Conta: " + this.nroConta +
                " | Nome: " + this.nome +
                " | Saldo: " + this.saldo);
    }

    // Realizar saque
    public void sacar(float x) {
        if (this.saldo >= x) {
            this.saldo -= x;
            System.out.println("Saque realizado: " + x);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}