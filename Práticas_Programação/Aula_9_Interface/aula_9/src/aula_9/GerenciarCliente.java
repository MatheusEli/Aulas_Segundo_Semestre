package aula_9;
import java.util.ArrayList;

public class GerenciarCliente {
    
    private static ArrayList<Cliente>listaClientes = new ArrayList<>();

    public static ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public static void setListaClientes(ArrayList<Cliente> listaClientes) {
        GerenciarCliente.listaClientes = listaClientes;
    }

    public static void adicionarCliente(Cliente cliente){
    
        listaClientes.add(cliente);
    }
    public static String listarClientes(){
    
        String saida = "";
        
        for (Cliente clientes:listaClientes) {
            
            saida += clientes.toString()+"\n";
        }
        
        return saida;
    } 
}