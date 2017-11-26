

//Exercicio 1
public class Tokenizer {

    public static void main(String[] args) {
        
        StringBuilder str1 = new StringBuilder("ovo");
        StringBuilder str2 = new StringBuilder("soccer");
        
        boolean t = true;
        
        for (int i = 0, j = str1.length()-1; i < str1.length(); i++, j--) {
            
            if(str1.charAt(i) != str1.charAt(j)){
            
                t = false;
            }
        }
        System.out.println("Str1 é palindromo? : "+t);
           
        
        boolean f = true;
        
        for (int i = 0, j = str2.length()-1; i < str2.length(); i++, j--) {
            
            if(str2.charAt(i) != str2.charAt(j)){
            
                f = false;
            }
        }
        System.out.println("Str2 é palindromo? : "+f);
        System.out.println("Concatenando: "+str1.append(str2));
        System.out.println("Invertido str1: "+str1.reverse());
        System.out.println("Invertido str2: "+str2.reverse());
        System.out.println("Inserindo na str2: "+str2.insert(3,"teste"));
        
        
    }
    
}
