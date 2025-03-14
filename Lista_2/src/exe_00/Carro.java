package Lista_2.src.exe_00;

public class Carro {
    // Private - Encapsulamento de variáveis
    private String marca, modelo;
    private int ano;
    private float velocidade;
    public Carro() {
        this.marca = "SEM MARCA";
        this.modelo = "SEM MODELO";
    }

    public Carro(String marca, String modelo, int ano, float velocidade) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setVelocidade(velocidade);
    }

    /*
        Setters - sempre void
        Getters - sempre return
     */

    // Criando setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        if(ano >= 0) {
            this.ano = ano;
        }
        else {
            System.out.println("ANO INVÁLIDO");
        }
    }
    public void setVelocidade(float velocidade) {
        if(velocidade >= 0) {
            this.velocidade = velocidade;
        }
        else {
            System.out.println("VELOCIDADE INVÁLIDA");
        }
    }

    // Criando getters
    public String getMarca() {
        return this.marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public int getAno() {
        return this.ano;
    }
    public float getVelocidade() {
        return this.velocidade;
    }

    @Override
    public String exibirDetalhes() {
        return "Carro{" +
                "marca='" + this.marca + '\'' +
                ", modelo='" + this.modelo + '\'' +
                ", ano=" + this.ano +
                ", velocidade=" + this.velocidade +
                '}';
    }

    public void acelerar(float x) {
        this.velocidade += x;
        this.verificarVelocidadeMaxima();
    }

    private void verificarVelocidadeMaxima() {
        if(this.velocidade > 200) {
            this.velocidade = 200;
        }
    }
}
