/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problema_de_josephus;

/**
 *
 * @author shayr
 */

 import java.util.ArrayList;
import java.util.List;

public class Problema_de_Josephus {

    public static int encontrarSobrevivente(int n, int m) {
        List<Integer> pessoas = new ArrayList<>();
        for (int x = 1; x <= n; x++) {
            pessoas.add(x);
        }

        int indice = 0;
        while (pessoas.size() > 1) {
            indice = (indice + m - 1) % pessoas.size();
            pessoas.remove(indice);
        }

        return pessoas.get(0);
    }

    public static void main(String[] args) {
        int resultado = encontrarSobrevivente(20, 3);
        System.out.println("A pessoa sobrevivente é a de número " + resultado + ".");
    }
}