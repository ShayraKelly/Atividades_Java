/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_495;
import java.util.Arrays;

/**
 *
 * @author shayr
 */
public class Exercicio_495 {
    public static void main(String[] args) {
        char[] vetor = {'d', 'b', 'a', 'c'};
        
        System.out.println("Vetor antes da ordenação:");
        imprimirVetor(vetor);
        
        ordenaVetorCaracteres(vetor);
        
        System.out.println("\nVetor após a ordenação:");
        imprimirVetor(vetor);
    }

    static void ordenaVetorCaracteres(char[] vetor) {
        Arrays.sort(vetor);
    }

    static void imprimirVetor(char[] vetor) {
        for (char elemento : vetor) {
            System.out.print(elemento + " ");
        }
    }
}
