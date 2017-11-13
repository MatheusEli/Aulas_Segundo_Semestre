package Exercicio_3;

import java.time.LocalDate;

public class Pedido {
    
    private String vendedor;
    private String numero;
    private double totalpedido;
    private LocalDate data;
    private String listadeItens;

    public Pedido(String vendedor, String numero, double totalpedido, LocalDate data, String listadeItens) {
        this.vendedor = vendedor;
        this.numero = numero;
        this.totalpedido = totalpedido;
        this.data = LocalDate.now();
        this.listadeItens = Gerenciar.listarItens();
    }

    public Pedido() {
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getTotalpedido() {
        return totalpedido;
    }

    public void setTotalpedido(double totalpedido) {
        this.totalpedido = totalpedido;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "vendedor=" + vendedor + ", numero=" + numero + ", totalpedido=" + totalpedido + ", data=" + data + '}';
    }
    
    
    
    
}
