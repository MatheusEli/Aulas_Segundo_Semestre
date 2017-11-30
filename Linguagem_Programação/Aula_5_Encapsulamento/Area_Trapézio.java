
package revisão_lp;

public class Trapezio {
 
    private int BaseMaior;
    private int BaseMenor;
    private double Altura;

    public Trapezio(int BaseMaior, int BaseMenor, double Altura) {
        this.BaseMaior = BaseMaior;
        this.BaseMenor = BaseMenor;
        this.Altura = Altura;
    }

    public Trapezio() {
    }
    
    public int getBaseMaior() {
        return BaseMaior;
    }

    public void setBaseMaior(int BaseMaior) {
        this.BaseMaior = BaseMaior;
    }

    public int getBaseMenor() {
        return BaseMenor;
    }

    public void setBaseMenor(int BaseMenor) {
        this.BaseMenor = BaseMenor;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
    public String calcularArea(){
    
        double area = (((BaseMaior + BaseMenor)*Altura)/2);
        
        return "Área do Trapézio: "+area;
    }
}










package revisão_lp;

import java.util.Scanner;

public class Revisão_LP {

    
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor da base maior do trapezio: ");
        int BaseMaior = entrada.nextInt();
        
        System.out.println("Digite o valor da base menor do trapezio: ");
        int BaseMenor = entrada.nextInt();
        
        System.out.println("Digite a altura do trapezio: ");
        double altura = entrada.nextDouble();
        
        
        Trapezio t = new Trapezio(BaseMaior,BaseMenor,altura);
        
        System.out.println(t.calcularArea());
    }
}
