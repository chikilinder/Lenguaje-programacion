/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.Collection;
import java.util.*;
/**
 *
 * @author inter
 */
public class GeneradorPreguntas {
    
    public static ArrayList<Pregunta>obtenerTodasLasPreguntas(){
        
        Opcion o1=new Opcion("Moscu",true);
        Opcion o2=new Opcion("Florencia",false);
        Opcion o3=new Opcion("Paris",false);
        Opcion o4=new Opcion("Londres",false);
        
        Opcion a1=new Opcion("Tokio",false);
        Opcion a2=new Opcion("Beijing",true);
        Opcion a3=new Opcion("seul",false);
        Opcion a4=new Opcion("Pyonjaing",false);
        
        ArrayList<Opcion> opciones=new ArrayList<Opcion>();
        
        opciones.add(o1);
        opciones.add(o2);
        opciones.add(o3);
        opciones.add(o4);
         ArrayList<Opcion> opcionesp2=new ArrayList<Opcion>();
        opcionesp2.add(a1);
        opcionesp2.add(a2);
        opcionesp2.add(a3);
        opcionesp2.add(a4);
        
        Pregunta p1=new Pregunta("Capital de Rusia",opciones);
        Pregunta p2=new Pregunta("Capital de china",opciones);
        
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
        preguntas.add(p1);
        preguntas.add(p2);
        
        return preguntas;
        
        
        
        
        
    }
    
}
