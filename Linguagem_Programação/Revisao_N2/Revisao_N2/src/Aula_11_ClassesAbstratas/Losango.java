package Aula_11_ClassesAbstratas;

public class Losango extends FormaGeometrica{
    
    private double diagonalmaior;
    private double diagonalmenor;

    public Losango() {
        super();
    }
    
    public Losango(double diagonalmaior, double diagonalmenor, String nome) {
        super(nome);
        this.diagonalmaior = diagonalmaior;
        this.diagonalmenor = diagonalmenor;
    }

    public double getDiagonalmaior() {
        return diagonalmaior;
    }

    public void setDiagonalmaior(double diagonalmaior) {
        this.diagonalmaior = diagonalmaior;
    }

    public double getDiagonalmenor() {
        return diagonalmenor;
    }

    public void setDiagonalmenor(double diagonalmenor) {
        this.diagonalmenor = diagonalmenor;
    }
    
    
    @Override
    public double calcularArea(){
    
        double area;
        
        area = ((diagonalmaior*diagonalmenor)/2);
        
        return area;
    }
    
    @Override
    public String imprimir(){
    
        return "Forma: "+super.getNome()+" - Area: "+calcularArea();
    }
}
