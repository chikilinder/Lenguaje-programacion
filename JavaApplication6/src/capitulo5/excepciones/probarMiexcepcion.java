/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo5.excepciones;

/**
 *
 * @author T-101
 */
public class probarMiexcepcion {
    
    public static void main(String[] args) {
        try{
            
        
       cliente c=new cliente("chikilinder_34@hotmail.com",22);
        c.setEdad(-19);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            System.out.println("Este se ejecuta se lance o no la e");
        }
    }
  
    }
