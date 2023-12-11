/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade4;

/**
 *
 * @author shayr
 */

public class Lista {
    Celula primeira_cel;
    Celula ultima_cel;
    int elementos = 0;

    void addInicio(Object num) {
        if (this.elementos == 0) {
            Celula nova = new Celula(num);
            this.primeira_cel = nova;
            this.ultima_cel = nova;
            this.elementos++;
        } else {
            Celula nova = new Celula(this.primeira_cel, num);
            this.primeira_cel.setAnterior(nova);
            this.primeira_cel = nova;
            this.elementos++;
        }
    }

    void addFinal(Object num) {
        if (this.elementos == 0) {
            addInicio(num);
        } else {
            Celula nova = new Celula(num);

            this.ultima_cel.setProxima(nova);
            nova.setAnterior(this.ultima_cel);
            this.ultima_cel = nova;
            this.elementos++;
        }
    }

    void addMeio(Celula pos, Object num) {
        Celula ant = pos;
        Celula prox = pos.getProxima();

        Celula nova = new Celula(ant.getProxima(), num);
        nova.setAnterior(ant);
        ant.setProxima(nova);
        prox.setAnterior(nova);
        this.elementos++;
    }

    void removePrimosInicio(Celula pos) {
        this.primeira_cel.anterior = null;
        this.primeira_cel = this.primeira_cel.getProxima();

        this.elementos--;
    }

    void removePrimosFinal(Celula pos) {
        Celula penultima = this.ultima_cel.getAnterior();
        penultima.setProxima(null);
        this.ultima_cel = penultima;

        this.elementos--;
    }

    void removePrimosMeio(Celula pos) {
        Celula ant = pos.getAnterior();
        Celula prox = pos.getProxima();

        ant.setProxima(prox);
        prox.setAnterior(ant);

        this.elementos--;
    }

    Celula buscaPosicao(Object num) {
        Celula atual = this.primeira_cel;
        Celula prox = atual.getProxima();
        Celula posicao = null;

        while (posicao == null) {
            Object validaAtual = atual.n;
            Object validaProx = prox.n;
            if (validaAtual instanceof Number && num instanceof Number && validaProx instanceof Number) {
                Number numAtual = (Number) validaAtual;
                Number numVal = (Number) num;
                Number numProx = (Number) validaProx;

                if (numAtual.doubleValue() <= numVal.doubleValue() && numProx.doubleValue() >= numVal.doubleValue()) {
                    posicao = atual;
                } else {
                    atual = prox;
                    prox = prox.getProxima();
                }
            }
        }
        return posicao;
    }

    int buscarValor(Celula pos) {
        Celula atual = pos;
        int valor = 0;
        Object validar = atual.n;
        if (validar instanceof Integer) {
            valor = (int) validar;
        }
        return valor;
    }

    boolean validarPrimos(int valor) {
        for (int x = 2; x < valor; x++) {
            if (valor % x == 0) {
                return false;
            }
        }
        return true;
    }

    void excluirPrimos() {
        Celula atual = this.primeira_cel;
        for (int x = 0; x < this.elementos; x++) {
            int valor = buscarValor(atual);
            atual = atual.getProxima();
        }
    }

    void imprimirLista() {
        System.out.print("Números: ");
        Celula atual = this.primeira_cel;
        for (int x = 0; x < this.elementos; x++) {
            if (x == 0) {
                System.out.print(atual.getNumero());
            } else {
                System.out.print(", " + atual.getNumero());
            }
            atual = atual.getProxima();
        }
    }
}