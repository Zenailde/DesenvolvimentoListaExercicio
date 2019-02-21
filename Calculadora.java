package com.catolica;

public class Calculadora {

    public static void main(String[] args) {
        String arg1 = args[0];
        String arg2 = args[1];

        Integer number1 = Integer.valueOf(arg1);
        Integer number2 = Integer.valueOf(arg2);

        Integer soma = number1 + number2;
        Integer produto = number1 * number2;
        Integer diferenca = number1 - number2;
        Double divisao = (double) number1 / (double) number2;

        if(number1 > number2){
            System.out.println("Maior " + number1);
        }else
            System.out.println("Maior " + number2);

        System.out.println("Soma:"+soma);
        System.out.println("Produto:" + produto);
        System.out.println("Diferenca: " + diferenca);
        System.out.println("Divisao: " + divisao);



    }
}
