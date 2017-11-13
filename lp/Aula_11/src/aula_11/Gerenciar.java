package aula_11;

import java.util.ArrayList;

public class Gerenciar {
    
    private static ArrayList<FormaGeometrica>listaFormas = new ArrayList<>();

    public static ArrayList<FormaGeometrica> getListaFormas() {
        return listaFormas;
    }

    public static void setListaFormas(ArrayList<FormaGeometrica> listaFormas) {
        Gerenciar.listaFormas = listaFormas;
    }
    
    public static void add(FormaGeometrica forma){
    
        listaFormas.add(forma);
    }
    
    public static String listar(){
    
        String saida = "";
        for (FormaGeometrica formas : listaFormas) {
            
            saida += formas.imprimir()+"\n";
        }
        
        return saida;
    }
    
    public static double calcularAreaTotal(){
    
        double somatorio = 0.00;
        
        for (FormaGeometrica formas : listaFormas) {
            
            somatorio += formas.calcularArea();
        }
        
        return somatorio;
    }
}
