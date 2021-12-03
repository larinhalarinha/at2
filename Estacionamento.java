import java.io.*;
import java.util.Scanner;

public class Estacionamento{ 
    private String placa;
    private String modelo;
    private int entrada; 
    private int saida; 
    private double val;

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String P) {
        this.placa = P;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String M) {
        this.modelo = M;
    }

    public int getEntrada() {
        return entrada;
    }
    public void setEntrada(int E) {
        this.entrada = E;
    }

    public int getSaida() {
        return saida;
    }
    public void setSaida(int S) {
        this.saida = S;
    }

    public void Inicializa(){
        this.placa = "";
        this.modelo = "";
        this.entrada = 0;
        this.saida = 0;
    }

    public void Pagamento(){
        int ent = this.entrada;
        int ext = this.saida; 
        this.valor = (saida - entrada)*1.5;
    }

    public void ListarDados(){
        System.out.println("Placa: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Entrada: " + this.entrada + " horas");
        System.out.println("Saida: " + this.saida + " horas");
        System.out.println("Valor do estacionamento: " + this.valor + " reais");
    }


    public static void main(String args[]) throws IOException {
        Estacionamento obj = new Estacionamento();

        Scanner ler = new Scanner(System.in);
        String endereco = ler.nextLine();
        BufferedReader leitura = new BufferedReader(new FileReader(endereco));

        obj.Inicializa();

        obj.placa = leitura.readLine(); 
        obj.modelo = leitura.readLine(); 

        String a = leitura.readLine();
        obj.entrada = Integer.parseInt(a);
        String b = leitura.readLine();
        obj.saida = Integer.parseInt(b);

        obj.Pagamento();
        obj.ListarDados();

        leitura.close();
        ler.close();
    }
}