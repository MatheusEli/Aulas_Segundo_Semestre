
package aula_8_lp;

import java.util.ArrayList;

public class Gerenciar {
    
    private static ArrayList<Disciplina>listaDisciplinas = new ArrayList<>();

    static ArrayList<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    static void setListaDisciplinas(ArrayList<Disciplina> listaDisciplinas) {
        Gerenciar.listaDisciplinas = listaDisciplinas;
    }
    
    static void adicionarDisciplina(Disciplina disciplina){
    
        listaDisciplinas.add(disciplina);
    } 
    
    static String pesquisarDisciplina(String disciplina){
    
        String saida = "";
        
        for (Disciplina disciplinas : listaDisciplinas) {
            
            if (disciplina.equalsIgnoreCase(disciplinas.getNome())) {
                
                saida += disciplinas.getProfessor().getNome()+"\n";
            }
        }
        return saida;
    }
    
    static String pesquisarTitulacao(String titulacao){
    
        String saida = "";
        
        for (Disciplina disciplinas:listaDisciplinas) {
            
            if (disciplinas.getProfessor().getTitulacao().equalsIgnoreCase(titulacao)) {
                
                saida += disciplinas.getProfessor().getNome()+"\n";
            }
        }
        return saida;
    }
    
    static String pesquisarProfessor(String professor){
    
        String saida = "";
        
        for (Disciplina disciplinas:listaDisciplinas) {
            
            if (disciplinas.getProfessor().getNome().equalsIgnoreCase(professor)) {
                
                saida += disciplinas.getNome()+"\n";
            }
        }
        return saida;
    }
}
