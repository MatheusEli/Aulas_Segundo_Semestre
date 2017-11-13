package Execicios_Revisao;

import java.util.ArrayList;

public class GerenciarDisciplinas {
    
    private static ArrayList<Disciplina>listaDisciplinas = new ArrayList<>();

    public static ArrayList<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public static void setListaDisciplinas(ArrayList<Disciplina> listaDisciplinas) {
        GerenciarDisciplinas.listaDisciplinas = listaDisciplinas;
    }

    public static void adicionarDisciplina(Disciplina disciplina){
        
        listaDisciplinas.add(disciplina);
    }
    public static String listar(){
    
        String saida = "";
        
        for (Disciplina disciplinas : listaDisciplinas) {
            
            saida += disciplinas.imprimir()+"\n";
        }
        return saida;
    }
    
    public static String pesquisarDisciplinas(String disciplina){
    
        String saida = "";
        for (Disciplina disciplinas : listaDisciplinas) {
            
            if (disciplinas.getNome().equalsIgnoreCase(disciplina)) {
                
                saida += disciplinas.getProfessor().getNome();
            }
        }
        return saida;
    }
    
    public static String disciplinasProfessor(String professor){
    
           String saida = "";
           
           for (Disciplina disciplinas : listaDisciplinas) {
            
               if (disciplinas.getProfessor().getNome().equalsIgnoreCase(professor)) {
                   
                   saida += disciplinas.getNome()+"\n";
               }
        }
           return saida;
    }
    
    public static String buscarTitulacao(String titulacao){
    
        String saida = "";
        
        for (Disciplina disciplinas : listaDisciplinas) {
            
            if (disciplinas.getProfessor().getTitulacao().equalsIgnoreCase(titulacao)) {
                
                saida += disciplinas.getProfessor().getNome()+"\n";
            }
        }
        
        return saida;
    }
    
    
}
