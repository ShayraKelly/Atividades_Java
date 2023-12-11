/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade5;

/**
 *
 * @author shayr
 */

class Celula {
    private char elemento;
    private Celula proxima;

    Celula(char elemento) {
        this.elemento = elemento;
    }

    char getElemento() {
        return elemento;
    }

    Celula getProxima() {
        return proxima;
    }

    void setProxima(Celula proxima) {
        this.proxima = proxima;
    }
}