/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilder_buffer_tokenizer;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Matheus
 */
public class StringBuilder_Buffer_Tokenizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        
        String artigo[] = {"o", "um", "algum", "qualquer", "nenhum"};
        String substantivo[] = {"garoto", "casa", "cachorro", "cidade", "carro"};
        String verbo[] = {"dirigiu", "saltou", "correu", "caminhou", "pulou"};
        String preposicao[] = {"para", "de", "sobre", "sob", "em"};
        
        
        
        for (int i = 0; i < 20; i++) {
            
            
            String frase = artigo[random.nextInt(5)] +" " +substantivo[random.nextInt(5)] +" "+verbo[random.nextInt(5)]+" "+preposicao[random.nextInt(5)]+" "+artigo[random.nextInt(5)] +" " +substantivo[random.nextInt(5)]+".";
            System.out.println(frase);
            
            
            frase = " ";
        }
        
        
        
        
        
        
    }
    
}
