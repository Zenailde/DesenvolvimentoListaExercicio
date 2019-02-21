package com.catolica;

public class PopulacaoMundial{


    public  static void main(String[] args){

        Integer anos = Integer.valueOf(args[0]);

        Long populacao = 70000000L;
        double taxa = 0.012;
        System.out.println(populacao + " de pessoas");

        double total = populacao.doubleValue();
        for(int i=0; i<anos; i++){

            System.out.println(total);

            total = total + (total*taxa);
        }

        System.out.println();
        System.out.println(total);



    }

}
