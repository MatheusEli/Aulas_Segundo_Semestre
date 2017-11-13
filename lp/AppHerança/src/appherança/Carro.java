package appherança;
public class Carro extends Veiculo {

    private String tipoCambio;
    private boolean ligado = false;
    private boolean porta = false;

    public Carro(int ano, String modelo, String tipoCambio,String marca, String cor) {

        super(marca, modelo, cor, ano);
        this.tipoCambio = tipoCambio;

    }

    public Carro() {
      
    }

    public void ligar(boolean chave) {
        if (chave) {
           acelerar();
        } else {
            System.out.println("Coloque e gire a chave primeiro");
        }
    }

    public void abrirPorta() {
        if (!porta) {
            System.out.println("porta aberta");
        } else {
            System.out.println("porta já está aberta");
        }
    }

    public void fecharPorta() {
        if (porta) {
            System.out.println("porta fechada");
        } else {
            System.out.println("porta já está fechada");
        }

    }

    @Override 
    public void acelerar(){
    
        if (ligado) {
            
            System.out.println("Acelerar");
        }else{
        
            System.out.println("Vire a chave primeiro!");
        }
    }
    
    
    @Override
    public String toString() {
        return super.toString() + " " + tipoCambio;
    }

}
