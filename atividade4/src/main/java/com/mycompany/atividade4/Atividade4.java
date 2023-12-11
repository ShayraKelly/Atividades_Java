/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade4;

import java.util.Arrays;

/**
 *
 * @author shayr
 */

public class Atividade4 {
    public static void main(String[] args) {
        Lista fl = new Lista();
        int numeros[] = new int[1000];
        int x, min = -9999, max = 9999;
        int maior = -9999, menor = 9999;

        for (x = 0; x < 1000; x++) {
            numeros[x] = (int) (Math.random() * (max - min + 1) + min);
        }
        
        System.out.println("Números: " + Arrays.toString(numeros) + "\n");

        for (x = 0; x < 1000; x++) {
            if (maior <= numeros[x]) {
                fl.addFinal(numeros[x]);
                maior = numeros[x];
            } else if (menor >= numeros[x]) {
                fl.addInicio(numeros[x]);
                menor = numeros[x];
            } else {
                fl.addMeio(fl.buscaPosicao(numeros[x]), numeros[x]);
            }
        }

        fl.imprimirLista();
    }
}
