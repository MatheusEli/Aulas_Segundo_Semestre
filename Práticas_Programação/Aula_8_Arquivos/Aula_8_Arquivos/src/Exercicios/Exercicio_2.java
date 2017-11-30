package Exercicios;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio_2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
            
        BufferedReader br = new BufferedReader(new FileReader("Arquivo_Inteiros.txt"));
        
        String saida = "";
        
        int soma = 0;
        
        String line;
        
        while((line = br.readLine()) != null){
        
            saida += line + "\n";
        }
        
        String []tokens = saida.split("\n");
        
        for (int i = 0; i < tokens.length; i++) {
            
            int num = Integer.parseInt(tokens[i]);
            soma += num;
        }
        br.close();
        System.out.println("Soma dos números no arquivo: "+soma);
        
    }
    
}
