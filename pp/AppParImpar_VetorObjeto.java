
package appparimpar;
import java.util.Scanner;

public class AppParImpar {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        ParImpar listaNum[] = new ParImpar[10];
        ParImpar num;
        int n, Qtdpar = 0, Qtdimpar = 0, Qtdtotal = 0;
        
        for (int i = 0; i < listaNum.length; i++) {
            
            System.out.println("Digite o número:");
            n = entrada.nextInt();
            
            
            num = new ParImpar(n);
            listaNum[i] = num;
        }
        
        for (int i = 0; i < listaNum.length; i++) {
            
            if (listaNum[i].imprimirParImpar() == true) {
                
                Qtdpar ++;
            }
            
            if (listaNum[i].imprimirParImpar() == false) {
                
                Qtdimpar ++;
            }
            
            Qtdtotal ++;
        }
        
        System.out.println("Quantidade de numeros pares no vetor: "+Qtdpar);
        System.out.println("Porcentagem de numeros ímpares no vetor: "+(Qtdimpar*100)/Qtdtotal+"%");
    }
    
}








package appparimpar;
public class ParImpar {
    
    private int num;

    public ParImpar(int num) {
        
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    
    public boolean imprimirParImpar(){
    
        boolean resp = false;
        
        if (num%2 == 0) {
            
            resp = true;
            
        }
        return resp;
        
    }
    
    
}
