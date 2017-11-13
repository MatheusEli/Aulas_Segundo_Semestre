package aula_10;
public class Media {
        
    private double valor1;
    private double valor2;

    public Media() {
    }

    public Media(double valor1, double valor2) {
        
        if (valor1 >= 0   &&    valor1 <= 10) 
            this.valor1 = valor1;
        
        
        if (valor2 >= 0   &&    valor2 <= 10) 
        this.valor2 = valor2;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        if (valor1 >= 0   &&    valor1 <= 10) 
            this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        if (valor2 >= 0   &&    valor2 <= 10) 
        this.valor2 = valor2;
    }
    public double calcularMedia(){
    
        double media = ((valor1+valor2)/2);
        return media;
    }
    public String imprimir(){
    
        return "Valor 1: "+valor1+" - Valor 2: "+valor2+"  - Média Aritmética: "+calcularMedia();
    }
}
