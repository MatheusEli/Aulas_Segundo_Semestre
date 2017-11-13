package Exercicio_3;
public class Item {
    
    private String codigo;
    private int quantidade;
    private double precounitario;
    private Pedido pedido;

    public Item() {
        this.pedido = new Pedido();
    }

    public Item(String codigo, int quantidade, double precounitario) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.precounitario = precounitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecounitario() {
        return precounitario;
    }

    public void setPrecounitario(double precounitario) {
        this.precounitario = precounitario;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Item{" + "codigo=" + codigo + ", quantidade=" + quantidade + ", precounitario=" + precounitario + "\n Pedido=" + pedido.toString() + '}';
    }
 }
