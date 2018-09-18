/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Aula4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //leitor
        Scanner leitor = new Scanner(System.in);
        //variaveis do sistema
        int qtd_alunos;
        double nota=0;
        double rsp=0;
        double maior=0;
        double menor=0;
        double media =0;
        String mediaTurma = "";
        int a_por_a = 0;
        
        System.out.println("Quantos alunos? Por Favor faça menor que 5");
        qtd_alunos =  leitor.nextInt();
        System.out.println("Quais as notas dos alunos");
        while(a_por_a < qtd_alunos){
            System.out.println(a_por_a+1+"ª Nota ");
            rsp = leitor.nextDouble();
            if (rsp > maior) {
                maior = rsp;
            }else
            if(menor < rsp ){
                menor = rsp;
            }
            nota += rsp;
            a_por_a++;
        }
        
        media = nota/qtd_alunos;
        
        if (media >= 6) {
            mediaTurma ="Média da turma foi 'Positiva' de: "+media;
        }else{
             mediaTurma = "Média da turma foi 'Negativa' de: "+media;
        }
        
        System.out.println("Número de Alunos: "+qtd_alunos);
        System.out.println(mediaTurma);
        System.out.println("Maior nota dos alnos: "+maior);
        System.out.println("Menor nota dos alnos: "+menor);
    }
    
    
    
}
