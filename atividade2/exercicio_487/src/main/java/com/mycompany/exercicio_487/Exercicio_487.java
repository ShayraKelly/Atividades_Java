/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_487;

/**
 *
 * @author shayr
 */
public class Exercicio_487 {
    public static void main(String[] args) {
        int tamanho = 5;
        int[] vetor = {1, 2, 3, 4, 5};

        inverte(vetor, tamanho);

        // Imprimir o vetor após a inversão
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    static void inverte(int[] vetor, int tamanho) {
        // Verifica se o vetor é válido
        if (vetor == null || vetor.length != tamanho) {
            throw new IllegalArgumentException("Vetor inválido ou tamanho incorreto.");
        }

        // Cria um vetor temporário para armazenar a inversão
        int[] vetorInvertido = new int[tamanho];

        // Inverte o vetor
        for (int i = 0; i < tamanho; i++) {
            vetorInvertido[i] = vetor[tamanho - i - 1];
        }

        // Copia os valores de volta para o vetor original
        System.arraycopy(vetorInvertido, 0, vetor, 0, tamanho);
    }
}
