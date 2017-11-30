package Exercicios;

import java.util.ArrayList;

public class Gerenciador {
    
    private static ArrayList<Pessoa>listaPessoas = new ArrayList<>();

    public static ArrayList<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public static void setListaPessoas(ArrayList<Pessoa> listaPessoas) {
        Gerenciador.listaPessoas = listaPessoas;
    }
    
    public static void adicionarPessoa(Pessoa pessoa){
    
        listaPessoas.add(pessoa);
    }
    
    public static String listaPessoas(){
    
        String saida = "";
        
        for (Pessoa pessoa : listaPessoas) {
            
            saida += pessoa.toString()+"\n";
        }
        
        return saida;
    }
}
