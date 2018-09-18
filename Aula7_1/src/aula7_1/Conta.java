/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7_1;

/**
 *
 * @author Administrador
 */
public class Conta {
    
    int  numero;
    String nome;
    double saldo;
    double limite;
    
    
    void saca(double quantidade){
        this.saldo = this.saldo - quantidade;
    }
    void deposito(double quantidade){
        this.saldo +=  quantidade;
    }
    
}
