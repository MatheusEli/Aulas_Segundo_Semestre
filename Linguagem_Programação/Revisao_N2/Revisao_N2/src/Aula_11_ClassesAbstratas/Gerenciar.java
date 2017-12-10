package Aula_11_ClassesAbstratas;

import java.util.ArrayList;

public class Gerenciar {
    
    private static ArrayList<FormaGeometrica>listaFormas = new ArrayList<>();

    public static ArrayList<FormaGeometrica> getListaFormas() {
        return listaFormas;
    }

    public static void setListaFormas(ArrayList<FormaGeometrica> listaFormas) {
        Gerenciar.listaFormas = listaFormas;
    }
    
    public static void adicionarForma(FormaGeometrica forma){
    
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
        
        double areaTotal = 0;
        
        for (FormaGeometrica formas : listaFormas) {
            areaTotal += formas.calcularArea();
        }
        
        return areaTotal;
    }
}
