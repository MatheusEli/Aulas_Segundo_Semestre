package Aula_8_AssociacaoDeClasses;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppPedido {

     public static void main(String[] args) {
        
        ArrayList<Pedido> pedidos = new ArrayList();
        
        int opcao;
        
        do {
            
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite"
                    + "\n\n1 - Cadastrar pedido"
                    + "\n2 - Listar pedidos"
                    + "\n3 - Calcular valor de um pedido"
                    + "\n4 - Calcular o total de todos os pedidos"
                    + "\n5 - Sair da aplicação\n"));
            
            switch(opcao) {
                
                case 1:
                    
                    Pedido p = new Pedido(
                            Integer.parseInt(JOptionPane.showInputDialog("Digite o código do pedido")),
                            JOptionPane.showInputDialog("Digite o nome do vendedor"));
                    
                    do {
                        Item i = new Item(
                            Integer.parseInt(JOptionPane.showInputDialog("Digite o código do item")),
                            Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade comprada")),
                            Double.parseDouble(JOptionPane.showInputDialog("Digite o preço unitário")));
                        
                        p.adicionarItem(i);
                        
                    } while (JOptionPane.showConfirmDialog(null, "Deseja inserir novo item?") == JOptionPane.YES_OPTION);
                    
                    pedidos.add(p);
                    
                    break;
                    
                case 2:
                    
                    JOptionPane.showMessageDialog(null, listarPedidos(pedidos));
                    break;
                    
                case 3:
                    
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do pedido: "));
                    Pedido buscado = buscarPedido(pedidos, codigo);
                    if(buscado != null) {
                        JOptionPane.showMessageDialog(null, "Valor do pedido " + codigo + ": R$ " + buscado.totalPedido());
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Pedido não encontrado");
                    }
                    break;
                    
                case 4:
                    
                    JOptionPane.showMessageDialog(null, "Valor total dos pedidos: R$ " + valorTotalPedidos(pedidos));
                    break;
                    
                case 5:
                    
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                    
                default:
                    
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                
            }
            
        } while (opcao != 5);
        
        
    }
    
    public static String listarPedidos(ArrayList<Pedido> pedidos) {
        
        StringBuilder saida = new StringBuilder();
                    
        for(Pedido p : pedidos) {
            saida.append(p);
            saida.append("\n\n");
        }
        
        return saida.toString();
        
    }
    
    public static Pedido buscarPedido(ArrayList<Pedido> pedidos, int numero) {
        
        for(Pedido p : pedidos) {
            if(p.getNumero() == numero) {
                return p;
            }
        }
        return null;
        
    }
    
    public static double valorTotalPedidos(ArrayList<Pedido> pedidos) {
        
        double total = 0;
        
        for(Pedido p : pedidos) {
            total += p.totalPedido();
        }
        
        return total;
        
    }
    
}