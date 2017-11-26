package appherança;

import java.util.ArrayList;

public class AppHerança {

    public static void main(String[] args) {
       
      Carro carro = new Carro(2017, "Onix", "manual", "chevrolet", "preto");
      Veiculo veiculo = new Carro();
    
      
      ArrayList <Carro> carros = new ArrayList();
      carros.add(carro);
     
      Carro[] cars= (Carro[])carros.toArray(new Carro[carros.size()]);
       System.out.println(cars[0]);
      
      
        if (carro instanceof Veiculo) {
            System.out.println("Sim");
        }else{System.out.println("nao");}
        
        /*//Carro carro = new Carro(); 
       carro.acelerar();
        //carro.ligar(false);
        carro.ligar();
        carro.acelerar();
        carro.frear();
        carro.abrirPorta();
        carro.getMarca();
       System.out.println(carro.toString());*/
    }

}
