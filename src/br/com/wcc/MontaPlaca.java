package br.com.wcc.;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MontaPlaca {
    
   public List <String> Placa(){
       
    Componentes componente1 = new Componentes();
    List<String> placa = new ArrayList<String>();

      Random aleatorio = new Random();
      int tamanho=aleatorio.nextInt(50);
      tamanho+=1;
      for(int i=0; i<tamanho;i++){
         
         placa.add(componente1.Caixa().get(aleatorio.nextInt(4)));

      }




    


       return placa;
  }

}