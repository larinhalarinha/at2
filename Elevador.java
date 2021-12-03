public class Elevador{
    int andarat, andat, capacidade, np;

    public void comeco(int c, int t) {
        this.andarat = 0;
        this.np = 0;
        this.andat = t;
        this.capacidade = c;
    }

    public void enche() {
        if (np < capacidade) {
            np = np + 1;
        } else {
            System.out.println("o elevador está cheio!");
        }
    }

    public void esvazia() {
        if (np > 0) {
            np = np - 1;
        } else {
            System.out.println("o elevador está vazio :)");
        }
    }

    public void cima() {
        if (andarat < andarat) {
            andarat = andarat + 1;
        } else {
            System.out.println("Chegamos ao topo!");
        }
    }

    public void baixo() {
        if (andarat > 0) {
            andarat = andarat - 1;
        } else {
            System.out.println(" terreo");
        }
    }

    public int getAt() {
        return andarat;
    }

    public int getTot() {
        return andat;
    }

    public int getPres() {
        return np;
    }

    public int getCapa() {
        return capacidade;
    }

    public void setCapa(int a) {
        this.capacidade = a;
    }

    public void setTot(int a) {
        this.andat = a;
    }

    public void setPres(int a) {
        this.np = a;
    }

    public void setAt(int a) {
        this.andarat = a;
    }

}