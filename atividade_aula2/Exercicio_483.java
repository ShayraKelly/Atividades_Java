/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_483;
import java.util.Scanner;

/**
 *
 * @author shayr
 */

public class Exercicio_483 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[4];
        int[] vetorB = new int[4];

        for (int x = 0; x < 4; x++) {
            System.out.print("Digite o " + (x + 1) + "º número para o vetor A: ");
            vetorA[x] = scanner.nextInt();
        }

        for (int x = 0; x < 4; x++) {
            System.out.print("Digite o " + (x + 1) + "º número para o vetor B: ");
            vetorB[x] = scanner.nextInt();
        }

        int resultado = calcularProdutoInterno(vetorA, vetorB);

        System.out.println("\nVETOR A     VETOR B");
        for (int x = 0; x < 4; x++) {
            System.out.println("   " + vetorA[x] + "           " + vetorB[x]);
        }

        System.out.println("\nProduto interno: " + resultado);
        scanner.close();
    }

    static int calcularProdutoInterno(int[] vetorA, int[] vetorB) {
        if (vetorA.length != vetorB.length) {
            throw new IllegalArgumentException("Os vetores devem ter o mesmo tamanho.");
        }

        int produtoInterno = 0;

        for (int x = 0; x < vetorA.length; x++) {
            produtoInterno += vetorA[x] * vetorB[x];
        }

        return produtoInterno;
    }
}
