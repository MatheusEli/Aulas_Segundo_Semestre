package Exercicios_GUI;

import java.util.ArrayList;

public class GerenciarPessoas {
    
    private static ArrayList<Pessoa>listaPessoas = new ArrayList<>();

    public static ArrayList<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public static void setListaPessoas(ArrayList<Pessoa> listaPessoas) {
        GerenciarPessoas.listaPessoas = listaPessoas;
    }
    
    
    public static void adicionarPessoas(Pessoa pessoa){
        
        listaPessoas.add(pessoa);
    }
    
    public static String listarPessoas(){
    
        String saida = "";
        
        if (listaPessoas.isEmpty()) {
            
            saida = "Nenhuma pessoa cadastrada";
        }
        for (Pessoa pessoas : listaPessoas) {
            
            saida += pessoas.toString()+"\r\n";
        }
        return saida;
    }
    
    public static String buscarNome(String nome){
        
        for (Pessoa pessoas : listaPessoas) {
            
            if (pessoas.getNome().equalsIgnoreCase(nome)) {
                
                return pessoas.retornarNome();
            }
        }
        
        return null;
    }
}
