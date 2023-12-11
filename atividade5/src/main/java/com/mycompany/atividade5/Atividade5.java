/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade5;

/**
 *
 * @author shayr
 */

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a expressão: ");
        String expressao = scanner.nextLine();

        if (verificarExpressao(expressao)) {
            System.out.println("A expressão está correta!");
        } else {
            System.out.println("A expressão está incorreta!");
        }
    }

    static boolean verificarExpressao(String expressao) {
        Pilha pilha = new Pilha();

        for (char caractere : expressao.toCharArray()) {
            if (caractere == '(' || caractere == '[' || caractere == '{') {
                pilha.empilhar(caractere);
            } else if (caractere == ')' || caractere == ']' || caractere == '}') {
                if (pilha.estaVazia() || !parametrosCorrespondentes(pilha.desempilhar(), caractere)) {
                    return false;
                }
            }
        }

        return pilha.estaVazia();
    }

    static boolean parametrosCorrespondentes(char abre, char fecha) {
        return (abre == '(' && fecha == ')') ||
               (abre == '[' && fecha == ']') ||
               (abre == '{' && fecha == '}');
    }
}
