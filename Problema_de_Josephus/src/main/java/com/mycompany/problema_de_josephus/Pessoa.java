/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema_de_josephus;


/**
 *
 * @author shayr
 */

class Pessoa {
    private final int numero;
    private final String nome;
    private final String telefone;
    private final String endereco;
    private final String cpf;

    public Pessoa(int numero, String nome, String telefone, String endereco, String cpf) {
        this.numero = numero;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return  "\nnome: " + nome + "\n" +
                "numero: " + numero + "\n" +
                "telefone:" + telefone + "\n" +
                "endereco: " + endereco + "\n" +
                "cpf: " + cpf;
    }
}