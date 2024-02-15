package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        String moeda1 ="0";
        String moeda2 = "0";

        System.out.println("-----------------------------------------");
        System.out.println("---Apenas centavos separados por ponto---");
        System.out.println("-----------------------------------------");

        try{
        System.out.print("Digite o primeiro valor: ");
        moeda1 = le.next();
        }catch (Exception ex){
            System.err.println("Erro na entrada de dados " + ex.getMessage());
        }

        try {
            System.out.print("Digite o segundo  valor: ");
            moeda2 = le.next();
        }catch (Exception ex){
            System.err.println("Erro na entrada de dados " + ex.getMessage());
        }

        BigDecimal coin1 = new BigDecimal(moeda1).setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal coin2 = new BigDecimal(moeda2).setScale(2, RoundingMode.HALF_EVEN);

        System.out.printf("Valor 1 : %15s\nValor 2 : %15s",nf.format(coin1),nf.format(coin2));
        System.out.printf("\n\u001B[31mValor total: \u001B[m%13s\n",nf.format(coin1.add(coin2)));
        System.out.println("-----------------------------------------");
    }
}
