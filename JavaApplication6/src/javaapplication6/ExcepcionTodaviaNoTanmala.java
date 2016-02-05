/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author chikilinder
 */
public class ExcepcionTodaviaNoTanmala {
    public static void main(String[] args){
        
      //aqui se sabe que valor va a tener 
        int x[]={ 1,34,6,8};
        float []y=new float [4];
        float z;
        // todos los arreglos son tratados por el compilador  como objetos
        
        
        A objeto=new A();
        System.out.println(objeto.m);
      System.out.println(y[2]);
      //System.out.println(z);
      for(int i=0; i<x.length;i++){
          
          System.out.println(x[i]);
      }
        
        //los inicializamos
      for(int w:x){
          System.out.println(w);
      }
        
    }
    
}

class A{
    float m;
    
}