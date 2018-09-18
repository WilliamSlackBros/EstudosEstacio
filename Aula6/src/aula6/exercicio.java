/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

/**
 *
 * @author Administrador
 */
public class exercicio {
    int valor =0;
    public static int divPar(int x,int y){
          int result = -1;
        if (y !=0) {
          result = x/y;
        }
        return  result ;
    }
//    public static void nadaRetorno(int x,int y){
//        int result = 0;
//        if (y !=0) {
//          result = x/y;
//        }
//        
//    }
    public static void imprimir(int imp,String texto){
        System.out.println(imp+" "+texto);
    }
    public static void main(String[] args){
      // int resposta = 0; 
    //resposta = divPar(10,0);
    //System.out.println(resposta);
    imprimir(divPar(10,5),"resultado");
        
    }
    
}
