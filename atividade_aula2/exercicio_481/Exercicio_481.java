/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_481;
import java.util.Scanner;

/**
 *
 * @author shayr
 */

public class Exercicio_481 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Digite um número maior ou igual a 0: ");
                int numeroDecimal = scanner.nextInt();
                
                if (numeroDecimal < 0) {
                    System.out.println("Número negativo! Digite dessa vez um número maior ou igual a 0");
                    continue;
                }
                
                System.out.print("Digite a base de conversão do número(2-10): ");
                int baseDestino = scanner.nextInt();
                
                if (baseDestino < 2 || baseDestino > 10) {
                    System.out.println("Base não aceita! Digite dessa vez uma base de conversão entre 2 e 10");
                    continue;
                }
                
                String resultado = converterBase(numeroDecimal, baseDestino);
                System.out.println("Número em decimal: " + numeroDecimal);
                System.out.println("Número na base " + baseDestino + ": " + resultado);
                
                break;
            }
        }
    }

    static String converterBase(int numeroDecimal, int baseDestino) {
        StringBuilder resultado = new StringBuilder();

        while (numeroDecimal > 0) {
            int resto = numeroDecimal % baseDestino;
            resultado.insert(0, resto);
            numeroDecimal /= baseDestino;
        }

        return resultado.toString();
    }
}