/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_493;

/**
 *
 * @author shayr
 */

public class Exercicio_493 {
    public static void main(String[] args) {
        int[] vetorCrescente = {1, 2, 3, 4, 5};
        int[] vetorDecrescente = {5, 4, 3, 2, 1};
        int[] vetorNaoOrdenado = {3, 1, 4, 2, 5};

        System.out.println(verificaOrdenacao(vetorCrescente)); // Saída: Crescente
        System.out.println(verificaOrdenacao(vetorDecrescente)); // Saída: Decrescente
        System.out.println(verificaOrdenacao(vetorNaoOrdenado)); // Saída: Não Ordenado
    }

    static String verificaOrdenacao(int[] vetor) {
        boolean crescente = true;
        boolean decrescente = true;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > vetor[i - 1]) {
                decrescente = false;
            } else if (vetor[i] < vetor[i - 1]) {
                crescente = false;
            }
        }

        if (crescente) {
            return "Crescente";
        } else if (decrescente) {
            return "Decrescente";
        } else {
            return "Não Ordenado";
        }
    }
}