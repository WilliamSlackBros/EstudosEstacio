/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author Administrador
 */
public class Aula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double nota = 6;
        double freq = 90;
        String resp = (nota >= 6 && freq >= 75)? "Aparovado":"Reprovado" ;
        System.out.println(resp);
        /*
        if (nota >= 6 && freq >= 75) {
            System.out.println("APROVADO");
        }else{
            System.out.println("Reprovado");
        }
*/
    }
    
}
