/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

/**
 *
 * @author Administrador
 */
public class Aula7 {

    /**
     * @param args the command line arguments
     */
    
//    public static double divideDoisValores(double dividendo, double divisor){
//        return dividendo/divisor;
//    }
//    public static void main(String[] args) {
//        double x = 10;
//        double y = 5;
//        if (y==0) {
//            System.out.println("proibido dividir  por zero");
//        }else{
//            double resultado = divideDoisValores(x, y);
//            System.out.println("O resultado é :"+resultado);
//        }
//    }
    
    //outra funcao
    
     public static void divideDoisValores(double dividendo, double divisor){
       if (divisor != 0) {
            
              System.out.println("O resultado é: "+dividendo/divisor);
        }else{
          System.out.println("proibido dividir  por zero");
        }
         
    }
    public static void main(String[] args) {
        double x = 10;
        double y = 0;

       divideDoisValores(x, y);
    }
    
}
