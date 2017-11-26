package Execicios_Revisao;

import java.util.ArrayList;

public class Gerenciar {
    
    private static ArrayList<Animal>listaAnimais = new ArrayList<>();

    public static ArrayList<Animal> getListaAnimais() {
        return listaAnimais;
    }

    public static void setListaAnimais(ArrayList<Animal> listaAnimais) {
        Gerenciar.listaAnimais = listaAnimais;
    }
    
    public static void adicionarAnimal(Animal animal){
    
        listaAnimais.add(animal);
    }
    public static String listarAnimais(){
    
        String saida = "";
        
        for (Animal animais:listaAnimais) {
            
            saida += animais.imprimir()+"\n";
        }
        
        return saida;
    }
    
    public static String pesquisarRaca(String raca){
    
        String saida = "";
        
        for (Animal animais : listaAnimais) {
            
            if (animais.getRaca().equalsIgnoreCase(raca)) {
                
                saida += animais.getProprietario().getNome()+"\n";
            }
        }
        
        return saida;
    } 
}
