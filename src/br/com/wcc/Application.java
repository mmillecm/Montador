package br.com.wcc.;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        
        System.out.print("Quantas Placas ? ");
        int tamanho=entrada.nextInt();
 
        for(int o=0; o<tamanho; o++){
            Montadors teste1 = new Montadors ();
            System.out.println("Placa"+(o+1));
        
            System.out.println(teste1.PlacaPronta());

        }

       



    }
}