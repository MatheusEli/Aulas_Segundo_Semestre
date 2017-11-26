
package stringbuilder_buffer_tokenizer;

import java.util.Scanner;





public class StringBuilder_Buffer_Tokenizer {

    
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Digite uma frase: ");
        String frase = entrada.nextLine();
        
        frase = frase.toLowerCase();
        
        int QtdVogal = 0, QtdCons = 0;
        
        char vogais[] = {'a','e','i','o','u'};
        int qtdvogal[] = new int[5];
        
        for (int i = 0; i < frase.length(); i++) {
            
        
        if (frase.charAt(i) == 'a'  ||     frase.charAt(i) == 'e'  ||      frase.charAt(i) == 'i'  ||      frase.charAt(i) == 'o'  ||      frase.charAt(i) == 'u') {
            
            for (int j = 0; j < vogais.length; j++) {
            
                if (frase.charAt(i) == vogais[j]) {
                
                qtdvogal[j] += 1;
            }
            }
            
            QtdVogal ++;
        }else{
        
            if (frase.charAt(i)  !=  ' '    &&   frase.charAt(i) != 'e'   &&   frase.charAt(i) != 'i'   &&   frase.charAt(i) != 'o'   &&   frase.charAt(i) != 'u'   &&   frase.charAt(i) != 'a') {
                
                QtdCons ++;
            }
        }
        
        }
        
        if (QtdVogal > QtdCons) {
            
            System.out.println("Há mais vogal que consoante!");
            
        }
        if (QtdCons > QtdVogal) {
            
            System.out.println("Há mais consoante que vogal!");
        }else{
        
            if (QtdCons == QtdVogal) {
                
                System.out.println("Há o mesmo número de vogais e consoantes!");
                
            }
        }
        
        for (int i = 0; i < vogais.length; i++) {
            
            System.out.println("Quantidade de vezes em que aparece "+vogais[i]+": "+qtdvogal[i]);
        }
        
        int maior = 0;
        int vogal=0;
        
        for (int i = 0; i < qtdvogal.length; i++) {
            
            if (qtdvogal[i] > maior) {
                
                maior = qtdvogal[i];
                vogal = i;
            }
        }
        
        System.out.println("Letra em que aparece mais vezes: "+vogais[vogal]);
        
    }
    
}
