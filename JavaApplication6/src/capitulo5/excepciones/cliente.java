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
public class cliente {
    
    private String email;
    private int edad;
    
    public cliente (String email, int edad) {
    
    this.email = email;
    this.edad = edad;
  }
    /**
    Este metodo nos regresara el email que ya previamente
    *se debio de haber proporcionado ´por el metodo correspondiente
            *@return rhe email 
                    */
 public String getEmail(){
     return email;
 } 
 
 /**
  * este metodo necesita que proporciones un String 
  * que va a ser el email que le vas asignar al cliente 
  * @param email aqui| debes de poner el Strin  correspondiente al email
  * */
  public void setEmail(String email){
      this.email= email;
  }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) throws ValorNoNegativoException {
        validarEdad validar=new validarEdad();
        validar.checarEdadNegativa(edad);
        
        this.edad = edad;
    }
  
}

