package aula_10;
public class MediaPonderada extends Media{
    
    private double peso1;
    private double peso2;

    public MediaPonderada() {
    
        super();
    }
    public MediaPonderada(double peso1, double peso2, double valor1, double valor2) {
        super(valor1, valor2);
        
        if (peso1 + peso2 >0   &&    peso1 + peso2 <= 10) {
            
            this.peso1 = peso1;
            this.peso2 = peso2;
        }
    }

    public double getPeso1() {
        return peso1;
    }

    public void setPeso1(double peso1) {
        if (peso1 + peso2 >0   &&    peso1 + peso2 <= 10) 
            this.peso1 = peso1;
        
    }

    public double getPeso2() {
        return peso2;
    }

    public void setPeso2(double peso2) {
        if (peso1 + peso2 >0   &&    peso1 + peso2 <= 10) 
            this.peso2 = peso2;
        
    }
    @Override
    public double calcularMedia(){
    
        double media =  (((super.getValor1() * peso1) + (super.getValor2()*peso2)) / (peso1+peso2));
        return media;
    }
}

