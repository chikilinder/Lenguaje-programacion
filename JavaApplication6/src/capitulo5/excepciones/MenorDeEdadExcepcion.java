/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo5.excepciones;

/**
 *
 * @author chikilinder
 */
public class MenorDeEdadExcepcion extends Exception{
    public MenorDeEdadExcepcion(){
        super("No puedo dar de alta a un menor de 18 años");
    }
    
}
