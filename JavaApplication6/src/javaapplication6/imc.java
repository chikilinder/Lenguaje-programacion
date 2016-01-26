/*
 * To change this license header, choose License Headers in Project Properties.
 * Reglas de encapsulamiento 
 * abrigar a los atributos 
*por cada atributo implementar un metodo geters 
*por cada atributo implementar un metodo setters
 */
package javaapplication6;
/*
 *
 * @author T-101
 */
public class imc {
    private float peso;
    private float altura;
    
    
    String calular(){
        float imc=peso/(altura*altura);
        
        return "Tu imc es :" + imc ; 
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
