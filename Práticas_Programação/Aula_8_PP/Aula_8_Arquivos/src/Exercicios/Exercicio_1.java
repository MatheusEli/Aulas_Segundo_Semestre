package Exercicios;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Exercicio_1 {
    public static void main(String[] args) {
        
        
        Pessoa p;
        Scanner entrada = new Scanner(System.in);        
        String nome,endereco,rg;
        
        for (int i = 0; i < 4; i++) {
            
            System.out.println("Digite seu nome: ");
            nome = entrada.nextLine();
            
            System.out.println("Digite o endereço: ");
            endereco = entrada.nextLine();
            
            System.out.println("Digite o RG:");
            rg = entrada.nextLine();
            
            p = new Pessoa(nome,endereco,rg);
            Gerenciador.adicionarPessoa(p);
        }
        
        System.out.println("Pessoas Cadastradas: \n"+Gerenciador.listaPessoas());
        
        
        
        File arquivo = new File("Exercicio1");
        
        try(FileWriter fw = new FileWriter(arquivo)){
        
            fw.write(Gerenciador.listaPessoas());
            fw.flush();
            
        }catch(IOException ex){
        
            System.out.println("Erro: "+ex);
        }
    }
    
}
