/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class Aula2Scaner {
    public static void main(String[] arg){
        double nota;
        double freq;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a nota");
        nota = leitor.nextDouble();
        System.out.println("Digite sua frequência");
        freq = leitor.nextDouble();
        
        String resultado = (nota >=6 && freq >= 75)? "Aprovado":"Reprovado";
        System.out.println(resultado);
    }
    
}
