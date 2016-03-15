/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaExamen;

/**
 *
 * @author inter
 */
public class GenerarCliente {
  public static  Cliente[] obtenerclientes(){
        Cliente clientes[] =new Cliente[3];
        clientes[0] =new Cliente();
        clientes[1] =new Cliente();
        clientes[3] =new Cliente();
        
        //clientes[0].setnombre("ana");
        //clientes[1].setnombre("pedro");
        //clientes[2].setnombre("laura");
        clientes [0] =new Cliente ("ana","lopez",20,20000 new Direccion("sur 11",20,"Ecatepunk"));
        return clientes;
        
        
    }
}
