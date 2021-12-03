import java.io.*;
import java.util.Scanner;

public class Pessoa{ 
    private String nome;
    private int altura; 
    private int idade; 
    private int anodenasci;
    
     

    public String getNome() {
        return nome;
    }
        public int getAltura() {
        return altura;
    }

    public int getanodenasci() {
        return anodenasci;
    }

    public void setNome(String N) {
        this.nome = N;
    }

    public void setanodenasci(int A) {
        this.anodenasci = A;
    }

    public void setAltura(int H) {
        this.altura = H;
    }

    public void Idade(){
        int i = this.anodenasci;
        this.idade = 2021-i;
    }

    public void ListarDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Altura: " + this.altura + " cm");
    }


    public static void main(String args[]) throws IOException {
        Pessoa obj = new Pessoa();

        Scanner ler = new Scanner(System.in);
        String endereco = ler.nextLine();
        BufferedReader leitura = new BufferedReader(new FileReader(endereco));

        obj.nome = leitura.readLine();
        String N = leitura.readLine();
        obj.anodenasci = Integer.parseInt(n);
        String K = leitura.readLine();
        obj.altura = Integer.parseInt(K);

        obj.Idade(); 
        obj.ListarDados(); 
        
        leitura.close();
        ler.close();
    }
}