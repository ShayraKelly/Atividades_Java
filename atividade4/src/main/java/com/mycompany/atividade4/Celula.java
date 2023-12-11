/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade4;

/**
 *
 * @author shayr
 */

public class Celula {
    Celula anterior;
    Celula proxima;
    Object n;

    Celula(Object num) {
        this.n = num;
    }

    Celula(Celula prox, Object num) {
        this.proxima = prox;
        this.anterior = null;
        this.n = num;
    }

    void setAnterior(Celula ant) {
        this.anterior = ant;
    }

    void setProxima(Celula prox) {
        this.proxima = prox;
    }

    Celula getAnterior() {
        return this.anterior;
    }

    Celula getProxima() {
        return this.proxima;
    }

    Object getNumero() {
        return this.n;
    }
}
