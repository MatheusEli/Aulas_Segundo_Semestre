/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulastring;

import java.util.Scanner;

public class AulaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1 = "matheus";
        boolean t = true;
        
        for (int i = 0, j = str1.length()-1; i < str1.length(); i++, j--) {
            
            if(str1.charAt(i) != str1.charAt(j)){
            
                t = false;
            }
        }
        System.out.println(t);
        
        
    }
    
}
