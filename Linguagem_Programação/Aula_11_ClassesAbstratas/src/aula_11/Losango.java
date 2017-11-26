package aula_11;
public class Losango extends FormaGeometrica{
    
    private int diagonalmenor;
    private int diagonalmaior;

    public Losango() {
        super();
    }
    
    public Losango(int diagonalmenor, int diagonalmaior, String nome) {
        super(nome);
        this.diagonalmenor = diagonalmenor;
        this.diagonalmaior = diagonalmaior;
    }

    public int getDiagonalmenor() {
        return diagonalmenor;
    }

    public void setDiagonalmenor(int diagonalmenor) {
        this.diagonalmenor = diagonalmenor;
    }

    public int getDiagonalmaior() {
        return diagonalmaior;
    }

    public void setDiagonalmaior(int diagonalmaior) {
        this.diagonalmaior = diagonalmaior;
    }

    
    @Override
    public float calcularArea(){
    
        float area = ((diagonalmaior * diagonalmenor)/2);
        return area;
    }
    
    @Override
    public String imprimir() {
    
        return super.imprimir() + "\nDiagonal Maior: "+diagonalmaior+" - Diagonal menor: "+diagonalmenor;

    }
}
