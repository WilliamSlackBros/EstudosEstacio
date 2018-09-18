/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int x, y;
        float x, y;
        Scanner ler = new Scanner(System.in);
        String op;
        
       System.out.println("Digite op: ");
        op = ler.nextLine();
        System.out.println("Digite x: ");
        x = ler.nextFloat();
       // x = ler.nextInt();
        System.out.println("Digite y: ");
        y =  ler.nextFloat();
       // y = ler.nextInt();
        
        switch(op){
            case "+" :
                  System.out.println("Reultado : "+(x+y));
            break;
            case "-" :
                  System.out.println("Reultado : "+(x-y));
           break;
        }
        
       
//        String palavra ="+";
//        switch(palavra){
//            case "+": 
//                System.out.println(2+7);
//            break;
//            case "-":
//                System.out.println(2-7);
//            break;
//            default:
//                System.out.println("padrao");
//        }
    }

    

}
