package Exercicio_1;

import java.util.ArrayList;


public class GerenciarAlunos {
    
    private static ArrayList<Aluno>listaAlunos = new ArrayList<>();

    public static ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public static void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        GerenciarAlunos.listaAlunos = listaAlunos;
    }
    
    public static void adicionarAlunos(Aluno aluno){
    
        listaAlunos.add(aluno);
    }
    
    public static String listar(){
    
        String saida = "";
        for(Aluno alunos:listaAlunos){
        
            saida += alunos.imprimir()+"\r\n";
        }
        
        return saida;
    }
}
