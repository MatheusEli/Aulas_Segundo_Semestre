package Aula_8_AssociacaoDeClasses;

import java.util.ArrayList;

public class Gerenciador {
    
    private static ArrayList<Disciplina>listaDisciplinas = new ArrayList<>();

    public static ArrayList<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public static void setListaDisciplinas(ArrayList<Disciplina> listaDisciplinas) {
        Gerenciador.listaDisciplinas = listaDisciplinas;
    }
    
    public static void adicionarDisciplina(Disciplina disciplina){
        
        listaDisciplinas.add(disciplina);
    }
    
    public static String listarDisciplinas(){
    
        String saida = "";
        
        for (Disciplina disciplinas : listaDisciplinas) {
            
            saida += disciplinas.toString()+"\n";
        }
        
        return saida;
    }
    
    public static String buscarProfessor(String nomeDisciplina){
    
        String saida = "";
        
        for (Disciplina disciplinas : listaDisciplinas) {
            
            if (disciplinas.getNome().equalsIgnoreCase(nomeDisciplina)) {
                
                saida += disciplinas.getProfessor().getNome();
            }
        }
        
        return saida;
    }
    
    public static String buscarProfessorTitulacao(String titulacao){
    
        String saida = "";
        
        for (Disciplina disciplinas : listaDisciplinas) {
            
            if (disciplinas.getProfessor().getTitulação().equalsIgnoreCase(titulacao)) {
                
                saida += disciplinas.getProfessor().getNome()+", ";
            }
        }
        
        return saida;
    }
    
    public static String disciplinasProfessor(String nomeProfessor){
    
        String saida = "";
        
        for (Disciplina disciplinas : listaDisciplinas) {
            
            if (disciplinas.getProfessor().getNome().equalsIgnoreCase(nomeProfessor)) {
                
                saida += disciplinas.getNome()+"\n";
            }
        }
        return saida;
    }
}
