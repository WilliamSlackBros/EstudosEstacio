/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8;

/**
 *
 * @author Administrador
 */
public class Aula8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
    }
    
}
