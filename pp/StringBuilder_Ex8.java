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
        Scanner entrada = new Scanner(System.in);
        
        int QtdVogal = 0, QtdCons = 0;
        
        System.out.println("Digite uma frase: ");
        String s = entrada.nextLine();
        
        int []vogais = new int[5];
        
        char[]vogaisc = {'a','e','i','o','u'}; 
        
        s  = s.toLowerCase();
        
        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == 'a'){ 
               vogais[0] += 1; 
               QtdVogal ++;
            }
            
            if (s.charAt(i) == 'e'){ 
               vogais[1] += 1; 
               QtdVogal ++;
            }
            if (s.charAt(i) == 'i'){ 
               vogais[2] += 1; 
               QtdVogal ++;
            }
            if (s.charAt(i) == 'o'){ 
               vogais[3] += 1; 
               QtdVogal ++;
            }
            if (s.charAt(i) == 'u'){ 
               vogais[4] += 1; 
               QtdVogal++;
            }
            
            if (s.charAt(i) != 'a'  &&   s.charAt(i) != 'e'  &&    s.charAt(i) != 'i'  &&     s.charAt(i) != 'o'  &&     s.charAt(i) != 'u') {
                
                QtdCons ++;
            }
        }
        
        for (int i = 0; i < vogais.length; i++) {
         
            System.out.println("Quantidade de vezes em que "+vogaisc[i]+" aparece: "+vogais[i]);
        }
        
        if (QtdVogal>QtdCons) {
            
            System.out.println("Há mais vogal que consoante.");
        }
        if (QtdCons>QtdVogal) {
            
            System.out.println("Há mais consoante que vogal.");
        }else{
        
            if (QtdCons == QtdVogal) {
                
                System.out.println("Há o mesmo número de vogais e consoantes");
            }
        }
    
        
        
     }
    
}
