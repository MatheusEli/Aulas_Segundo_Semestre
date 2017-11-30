
package aula_8_arquivos;
import java.io.*;
public class Aula_8_Arquivos {

    public static void main(String[] args) throws IOException { 
        
        File arquivo = new File("teste.bin");
        
        try( OutputStream os = new FileOutputStream(arquivo) ){ 
            
            byte[] b = {50,51,52,53};
            String string = "Anhembi Morumbi";
            os.write(53);
            os.write(b);
            os.write( string.getBytes() );
            os.flush();
    
        }catch(IOException ex){
        
            ex.printStackTrace(); }
        
        try( InputStream is = new FileInputStream(arquivo) ){ 
            int content;
            
            while ( (content = is.read() ) != -1) {
                System.out.println( content +" - "+ ( (char) content) );
            
            }}catch(IOException ex){
                ex.printStackTrace();
            }
        
        
        
        
            File arquivo1 = new File("teste.txt"); 
        
            try( FileWriter fw = new FileWriter(arquivo1) ){ 
            
                fw.write('2'); 
            
                fw.write("25"); 
        
                fw.flush();// força a gravação do buffer no arquivo 
            }catch(IOException ex){ 
                
                ex.printStackTrace(); 
            }
            
            
            
            File arquivo3 = new File("teste.txt");
            
            try(FileReader fr = new FileReader(arquivo3)){
            
            int c = fr.read();
            
            while(c != -1){
            
                System.out.print((char)c);
                c = fr.read();
            }}catch(IOException ex){
            
                ex.printStackTrace();
            }

    }
}

