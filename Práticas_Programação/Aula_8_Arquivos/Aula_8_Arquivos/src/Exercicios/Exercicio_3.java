package Exercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio_3 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        BufferedReader bf = new BufferedReader(new FileReader("Fonte.txt"));
        
        FileWriter fw = new FileWriter("destino.txt");
        
        String line;
        
        while((line = bf.readLine()) != null){
        
            fw.write(line+"\r\n");
        }
        
        bf.close();
        fw.close();
    }
    
}
