
package Aula_8_AssociacaoDeClasses;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    
    private int numero;
    private String vendedor;
    private LocalDate data;
    private ArrayList<Item> itens = new ArrayList();

    public Pedido() {
        data = LocalDate.now();
    }
    
    public Pedido(int numero, String vendedor) {
        this.numero = numero;
        this.vendedor = vendedor;
        data = LocalDate.now();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
    
    public double totalPedido() {
        double total = 0;
        for (Item i : itens) {
            total += i.getPrecoUnitario()*i.getQuantidade();
        }
        return total;
    }
    
    public void adicionarItem(Item i) {
        itens.add(i);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido número: " + numero);
        sb.append("\nVendedor: " + vendedor);
        sb.append("\nData do pedido: " + data);
        sb.append("\nItens:");
        for(Item i : itens) {
            sb.append("\n\n" + i);
        }
        return sb.toString();
    }
    
    
    
}
