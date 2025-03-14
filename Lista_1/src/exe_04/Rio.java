package Lista_1.src.exe_04;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio() {
        this.nome = "SEM NOME";
    }

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover(float x) {
        this.nivel += x;
    }

    public void ensolarar(float x) {
        if(this.nivel >= x) {
            this.nivel -= x;
        }
        else {
            System.out.println("NÍVEL NEGATIVO");
        }
    }

    public void limpar() {
        if(this.poluido) {
            this.poluido = false;
        }
    }

    public void sujar() {
        if(!this.poluido) {
            this.poluido =  true;
        }
    }

    public String mostrar() {
        return "Rio{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", poluido=" + poluido +
                '}';
    }
}
