/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fean.poo2.locadora.view.cadastro.midia;

/**
 *
 * @author Filipe
 */
public enum Situacao {

    DISPONIVEL(0), LOCADO(1);

    private final int valor;

    private Situacao(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }
}
