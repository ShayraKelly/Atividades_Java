/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_494;

/**
 *
 * @author shayr
 */

public class Exercicio_494 {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 1, 5, 6};
        
        System.out.println("Vetor antes da ordenação:");
        imprimirVetor(vetor);
        
        bubbleSort(vetor);
        
        System.out.println("\nVetor após a ordenação:");
        imprimirVetor(vetor);
    }

    static void troca(int[] vetor, int indice1, int indice2) {
        int temp = vetor[indice1];
        vetor[indice1] = vetor[indice2];
        vetor[indice2] = temp;
    }

    static void bubbleSort(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    troca(vetor, j, j + 1);
                }
            }
        }
    }

    static void imprimirVetor(int[] vetor) {
        for (int elemento : vetor) {
            System.out.print(elemento + " ");
        }
    }
}
