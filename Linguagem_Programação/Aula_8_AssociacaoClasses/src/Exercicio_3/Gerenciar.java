package Exercicio_3;

import java.util.ArrayList;

public class Gerenciar {
    
    private static ArrayList<Item>listaItens = new ArrayList<>();

    public static ArrayList<Item> getListaItens() {
        return listaItens;
    }

    public static void setListaItens(ArrayList<Item> listaItens) {
        Gerenciar.listaItens = listaItens;
    }
    
    public static void adicionarItem(Item item){
    
        listaItens.add(item);
    }
    
    public static String listarItens(){
    
        String saida = "";
        
        for (Item itens : listaItens) {
            
            saida += listaItens.indexOf(itens)+"º - "+itens.toString()+"\n";
        }
        return saida;
    }
}
