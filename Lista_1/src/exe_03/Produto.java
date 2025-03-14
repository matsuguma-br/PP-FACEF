package Lista_1.src.exe_03;

public class Produto {
    public int id, qnt;
    public String descricao;
    public float preco;

    // Criando objeto "produto" sem valores
    public Produto() {
        this.descricao = "SEM DESCRIÇÃO";
    }

    // Criando objeto "produto" com valores
    public Produto(int id, int qnt, String descricao, float preco) {
        this.id = id;
        this.qnt = qnt;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Comprar x unidades
    public void comprar(int x) {
        this.qnt += x;
    }

    // Subir preço em x unidades
    public void subir(float x) {
        this.preco += x;
    }

    // Vender x unidades
    public void vender(int x) {
        if(this.qnt > x) {
            this.qnt -= x;
        }
    }

    // Diminuir preco
    public void diminuir(float x) {
        if(this.preco >= x) {
            this.preco -= x;
        }
        else {
            System.out.println("PREÇO NEGATIVO");
        }
    }

    public String exibeDetalhes() {
        return "Produto{" +
                "id=" + id +
                ", qnt=" + qnt +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}