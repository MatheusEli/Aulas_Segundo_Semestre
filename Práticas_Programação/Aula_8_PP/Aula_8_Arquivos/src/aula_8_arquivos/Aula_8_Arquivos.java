
package aula_8_arquivos;
import java.io.*;
public class Aula_8_Arquivos {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String entrada = "12345678";
        
        FileOutputStream is = new FileOutputStream("arquivo.txt");
        
        for (int i = 0; i < entrada.length(); i++) {
            
            is.write(entrada.charAt(i));
        }
        
        System.out.println("Dados gravados: "+entrada);
        is.close();
    }
    
}
