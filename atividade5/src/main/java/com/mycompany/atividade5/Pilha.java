/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade5;

/**
 *
 * @author shayr
 */

class Pilha {
    private Celula topo;

    void empilhar(char elemento) {
        Celula novaCelula = new Celula(elemento);
        novaCelula.setProxima(topo);
        topo = novaCelula;
    }

    char desempilhar() {
        if (estaVazia()) {
            throw new IllegalStateException("A pilha está vazia.");
        }

        char elemento = topo.getElemento();
        topo = topo.getProxima();
        return elemento;
    }

    boolean estaVazia() {
        return topo == null;
    }
}
