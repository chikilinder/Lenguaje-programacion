/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.Collection;

/**
 *
 * @author inter
 */

import java.io.*;
import java.util.ArrayList;

public class PersistenciaUsuarios {
    ArrayList<Usuario> usuarios;

    public PersistenciaUsuarios() {
        usuarios=new ArrayList<>();
    }
    
 //Primero ponemos el metodo de buscar todos
    
  ArrayList<Usuario>  buscarTodos()throws Exception{
        //Pasa numero1
        //Leemo el archivo donde esta guardado el arraylist
        File f=new File("archivado.raton");
        //Leemos el  contenido
        FileInputStream fis=new FileInputStream(f);
        //Descomprimimos el conteido
        ObjectInputStream ois=new ObjectInputStream(fis);
        //leemos
         usuarios=(ArrayList<Usuario>) ois.readObject();
        
        
        
        return usuarios;        
    } 
    public void guardar(Usuario u)throws Exception{
        File f=new File("archivaldo.raton");
        if(f.exists())usuarios=buscarTodos();
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        usuarios.add(u);
        oos.writeObject(usuarios);
    }
    
    
   
    
    
    
    
 
}
