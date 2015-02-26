/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practica1_200715103;

import EDDLista.*;

/**
 *
 * @author julio
 */
public class ExcepcionListaVacia extends RuntimeException {
    public ExcepcionListaVacia(){System.out.println("Lista");}
    
    public ExcepcionListaVacia(String nombre)
    {
    System.out.println(nombre+" esta vacia, excepcion activada");
    }
}
