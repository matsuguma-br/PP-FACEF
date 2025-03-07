package Lista_1.src.exe_00;

import javax.swing.*;

public class Carro {
    // Variáveis
    public int ano;
    public float velocidade;
    public String marca, modelo;

    // Métodos construtores
    public Carro() {
        this.marca = "Vazia";
        this.modelo = "Vazio";
    }

    public Carro(int ano, float velocidade, String marca, String modelo) {
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos
    public void exibirDetalhes() {
        JOptionPane.showMessageDialog(null,
                "Marca: " + this.marca + "\n" +
                        "Modelo: " + this.modelo + "\n" +
                        "Ano: " + this.ano + "\n" +
                        "Velocidade: " + this.velocidade);
    }

    public void acelerar(float x) {
        this.velocidade += x;
    }

    public void frear(float x) {
        if (this.velocidade - x >= 0) {
            this.velocidade -= x;
        } else {
            System.out.println("Freagem não ocorreu");
        }
    }
}