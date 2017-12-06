package Exercicio_2;

public class ContaEnergia {
    
    private String numeroConta;
    private String nomeCliente;
    private String enderecoCliente;
    private double valorKW = 1.50;
    private int qtdKW;
    

    public ContaEnergia(String numeroConta, String nomeCliente, String enderecoCliente, int qtdKW) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.enderecoCliente = enderecoCliente;
        this.qtdKW = qtdKW;
    }

    public ContaEnergia() {
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public double getValorKW() {
        return valorKW;
    }

    public void setValorKW(double valorKW) {
        this.valorKW = valorKW;
    }

    public int getQtdKW() {
        return qtdKW;
    }

    public void setQtdKW(int qtdKW) {
        this.qtdKW = qtdKW;
    }
    
    public double calcularTotalConta(){
    
        double totalconta;
        totalconta = (qtdKW*valorKW);
        
        return totalconta;
    }
    
    public String imprimir(){
    
        return "Cliente: "+nomeCliente+" - Endereço: "+enderecoCliente+" - TOTAL A PAGAR: "+calcularTotalConta();
    }
}
