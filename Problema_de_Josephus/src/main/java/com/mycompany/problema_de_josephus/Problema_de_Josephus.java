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
import java.util.Scanner;

public class Problema_de_Josephus {

    public static Pessoa encontrarSobrevivente(List<Pessoa> pessoas, int m) {
        int indice = 0;
        while (pessoas.size() > 1) {
            indice = (indice + m - 1) % pessoas.size();
            pessoas.remove(indice);
        }
        return pessoas.get(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas na roda? ");
        int numeroPessoas = scanner.nextInt();

        List<Pessoa> listaPessoas = new ArrayList<>();
        for (int i = 1; i <= numeroPessoas; i++) {
            System.out.println("Informações da Pessoa " + i + ":");
            System.out.print("Nome: ");
            String nome = scanner.next();

            System.out.print("Telefone: ");
            String telefone = scanner.next();

            System.out.print("Endereço: ");
            String endereco = scanner.next();

            System.out.print("CPF: ");
            String cpf = scanner.next();

            listaPessoas.add(new Pessoa(i, nome, telefone, endereco, cpf));
        }

        System.out.print("\nEscolha o valor de m: ");
        int m = scanner.nextInt();

        Pessoa sobrevivente = encontrarSobrevivente(listaPessoas, m);

        System.out.println("\nA pessoa sobrevivente é: " + sobrevivente);
    }
}