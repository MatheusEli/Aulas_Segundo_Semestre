package Exercicio_3;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        
        Item item1 = new Item("001234",12,39.90);
        Item item2 = new Item("001235",30,79.90);
        Item item3 = new Item("001236",67,19.90);
        Item item4 = new Item("001234",120,149.90);
        
        Pedido p;
        
        Gerenciar.adicionarItem(item1);
        Gerenciar.adicionarItem(item2);
        Gerenciar.adicionarItem(item3);
        Gerenciar.adicionarItem(item4);
        
        boolean controle = false;
        do{
        
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"*OPÇÕES*\n1 - Cadastrar Pedido\n2 - Listar Pedidos\n3 - Calcular valor dos"
                    + "Pedidos\n4 - Total geral dos Pedidos\n5 - Sair"));
            
            switch(opcao){
            
                case 1:
                    p = new Pedido();
                    
                    int opcao1 = Integer.parseInt(JOptionPane.showInputDialog(null,"*CADASTRO\nEscolha os itens a comprar: "
                            + "\n"+Gerenciar.listarItens()));
                    break;
                    
                    
            }
        }while(controle == false);
    }
    
}
