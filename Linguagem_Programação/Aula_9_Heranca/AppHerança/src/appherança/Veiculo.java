package appherança;
public abstract class Veiculo {

    protected String marca;
    private String modelo;
    private String cor;
    private int ano;
    private boolean ligado = false;

    public Veiculo(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public Veiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public abstract void acelerar();

    public void ligar() {
        if (!ligado) {
            ligado = true;
            ligarMotor();
            System.out.println("ligado");
        } else {
            ligado = false;
        }

    }

    private void ligarMotor() {

    }

    public void frear() {
        System.out.println("frear");
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " " + cor + " " + ano;
    }

}
