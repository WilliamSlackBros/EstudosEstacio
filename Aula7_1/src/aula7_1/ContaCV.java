/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7_1;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class ContaCV {
    int  numero;
    String nome;
    double saldo;
    double limite;
    public  int opcao;
    double valor;
    public  boolean validacao;
    
    void setValores(){
      Scanner leia = new Scanner(System.in);
      this.valor = leia.nextDouble();
    }
    void setAcao(){
        Scanner leia = new Scanner(System.in);
        System.out.print("Opção: ");
      this.opcao = leia.nextInt();
        
        switch(this.opcao){
            case 1:
                System.out.print("Valor do Saque: ");
                setValores();
                if (validarQtdade(this.valor)) {
                    this.saca(this.valor);
                }else{
                    System.out.println("Valor Indisponivel");
                }
                
            break;
            case 2:
                System.out.print("Valor do Deposito: ");
                setValores();
                deposito(this.valor);
            break;
            case 3:
                System.out.println("Saldo de: ");
                getSaldo();
            break;
            case 4:
                System.out.println("Fui...");
                
            break;
            default:
                System.out.println("Nenhum valor das opções");
        }
    }

    void menu(){
        System.out.println("1-Saque");
        System.out.println("2-Deposito");
        System.out.println("3-Saldo");
        System.out.println("4-Sair");
    }
    void setAtributos(int numero, String nome, double saldo, double limite){
        this.nome=nome;
        this.numero=numero;
        this.limite=limite;
        this.saldo=saldo;
        
    }
    void getSaldo(){
        System.out.println("Saldo:");
        System.out.println("Titular: "+this.nome +" Saldo: "+this.saldo);
        
    }
    boolean validarQtdade(double quantidade){
        if (quantidade > this.saldo) {
            
            return validacao=false;
        }else{
            return validacao=true;
        }
        
    } 
    void saca(double quantidade){
        this.saldo -=  quantidade;
    }
    void deposito(double quantidade){
        this.saldo +=  quantidade;
    }
}
