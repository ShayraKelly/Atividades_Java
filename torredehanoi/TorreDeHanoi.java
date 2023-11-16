/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.torredehanoi;

/**
 *
 * @author shayr
 */

public class TorreDeHanoi {

    public static void main(String[] args) {
        long numeroDeDiscos;
        numeroDeDiscos = 10;
        long totalMovimentos;
        totalMovimentos = torreDeHanoi((int) numeroDeDiscos, 'A', 'C', 'B');
        System.out.println("Número de discos: " + numeroDeDiscos);
        System.out.println("Total de movimentos: " + totalMovimentos + " movimentos");
    }

    public static long torreDeHanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            return 1;
        }
        long movimentosAux1 = torreDeHanoi(n - 1, origem, auxiliar, destino);
        int movimentosAtual = 1;
        long movimentosAux2 = torreDeHanoi(n - 1, auxiliar, destino, origem);
        return movimentosAux1 + movimentosAtual + movimentosAux2;
    }
}
