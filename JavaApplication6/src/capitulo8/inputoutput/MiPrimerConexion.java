/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo8.inputoutput;

import java.net.*;
import java.io.*;
/**
 *
 * @author chikilinder
 */
public class MiPrimerConexion {
     public static void main(String[] args)  throws Exception {
         //Primero vamos a usar una clase : URL
         URL url=new URL ("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
                 HttpURLConnection con=(HttpURLConnection) url.openConnection();
                 InputStream input=con.getInputStream();
                 
                 InputStreamReader isr=new InputStreamReader (input);
                 BufferedReader reader=new BufferedReader(isr);
                 String lineaActual="No ha leido nada";
                 
                 boolean encontrado=false;
                 int miLinea=0;
                 while((lineaActual=reader.readLine())!=null){
                     //Vamos a despedasar la linea 
                     
                     int indice= lineaActual.indexOf(">");
                     int indice2= lineaActual.indexOf("</");
                     String tempActual=lineaActual.substring(indice+1,indice2);
                    
                  if(lineaActual.contains(etiqueta)){
                      
                      encontrado=true;
                      System.out.println("DatoEncontrado");
                  }
     }
     }
        
    }

