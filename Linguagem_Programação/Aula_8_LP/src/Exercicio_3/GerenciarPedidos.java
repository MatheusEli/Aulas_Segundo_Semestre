package Exercicio_3;

import java.util.ArrayList;

public class GerenciarPedidos {
    
    private static ArrayList<Pedido>listaPedidos = new ArrayList<>();

    public static ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public static void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        GerenciarPedidos.listaPedidos = listaPedidos;
    }
    
    static void adicionarPedido(Pedido pedido){
    
        listaPedidos.add(pedido);
    }
    
    static String listarPedidos(){
        
        String saida = "";
        
        for (Pedido pedidos : listaPedidos) {
            
            saida += pedidos.toString()+"\n";
        }
        return saida;
    }
    
    public static int totalPedidos(){
    
    
        return listaPedidos.size();
    }
}
