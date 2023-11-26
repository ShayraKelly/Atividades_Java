/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_calculadora;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author shayr
 */

public class Atividade_calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a expressão em notação pós-fixa:");
        String expressaoPosfixa = scanner.nextLine();

        try {
            double resultado = calcularPosfixa(expressaoPosfixa);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro ao calcular a expressão: " + e.getMessage());
        }
        
        // Aqui você pode adicionar lógica para converter para outras notações, se necessário.
    }

    private static double calcularPosfixa(String expressao) {
        Stack<Double> pilha = new Stack<>();
        String[] tokens = expressao.split(" ");

        for (String token : tokens) {
            if (isNumero(token)) {
                pilha.push(Double.valueOf(token));
            } else {
                double operando2 = pilha.pop();
                double operando1 = pilha.pop();
                double resultado = realizarOperacao(operando1, operando2, token);
                pilha.push(resultado);
            }
        }

        if (pilha.size() != 1) {
            throw new ArithmeticException("Expressão inválida");
        }

        return pilha.pop();
    }

    private static double realizarOperacao(double operando1, double operando2, String operador) {
        switch (operador) {
            case "+" -> {
                return operando1 + operando2;
            }
            case "-" -> {
                return operando1 - operando2;
            }
            case "*" -> {
                return operando1 * operando2;
            }
            case "/" -> {
                if (operando2 != 0) {
                    return operando1 / operando2;
                } else {
                    throw new ArithmeticException("Divisão por zero");
                }
            }
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }

    private static boolean isNumero(String token) {
        try {
            Double.valueOf(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}