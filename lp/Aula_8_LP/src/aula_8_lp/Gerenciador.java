
package aula_8_lp;

import java.util.ArrayList;

public class Gerenciador {
    
    private static ArrayList<Animal>listaAnimais = new ArrayList<>();

    public static ArrayList<Animal> getListaAnimais() {
        return listaAnimais;
    }

    public static void setListaAnimais(ArrayList<Animal> listaAnimais) {
        Gerenciador.listaAnimais = listaAnimais;
    }

    public static void adicionarAnimais(Animal animal){
    
        listaAnimais.add(animal);
    }
    
    public static String listarAnimais(){
    
        String saida = "";
        
        for (Animal animais:listaAnimais) {
            
            saida += animais.toString()+"\n";
        }
        
        return saida;
    }
    
    public static String pesquisar(String raca){
    
        String saida = "";
        
        for (Animal animais:listaAnimais) {
            
            if (animais.getRaça().equalsIgnoreCase(raca)) {
                
                saida += animais.getProprietario().getNome()+"\n";
            }
        }
        
        return saida;
    }
}
