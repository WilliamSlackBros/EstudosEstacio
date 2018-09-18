/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7_1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Aula7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        
        
        
//        // TODO code application logic here
//        Conta c1 = new  Conta();
//        c1.limite = 10000;
//        c1.nome = "Fran";
//        c1.numero = 15451;
//        c1.saldo = 1000000;
//        
//        //depositar
//        System.out.println("Saldo Antigo:");
//        System.out.println("Titular: "+c1.nome +" Saldo: "+c1.saldo);
//        c1.deposito(2000);
//        System.out.println("Novo Saldo:");
//        System.out.println("Titular: "+c1.nome +" Saldo: "+c1.saldo);
//        
//        
//        ///sacar
//        System.out.println("Saldo Antigo:");
//        System.out.println("Titular: "+c1.nome +" Saldo: "+c1.saldo);
//        c1.saca(20);
//        System.out.println("Novo Saldo:");
//        System.out.println("Titular: "+c1.nome +" Saldo: "+c1.saldo);


        ContaCV c1 = new ContaCV();
        
        c1.setAtributos(15974663, "José Maria",50000, 250000);
        c1.getSaldo();


        do {
        System.out.println("Gostaria de: ");
        c1.menu();
        System.out.println("Qual opção: ");
        c1.setAcao();
        } while(c1.opcao != 4);
        System.out.println("Saiu de sua conta...");
         
//c1.menu();
        //c1.setAcao();           
        
//        String acao = "";
//        do {
//            System.out.println("blx");
//        } while (acao != "n");
        
    }
    
}
