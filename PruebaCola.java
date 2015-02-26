/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practica1_200715103;


/**
 *
 * @author julio
 */
public class PruebaCola {
    
    public static void main (String args[])
    {
    Cola cola = new Cola();
    
    Boolean bool = Boolean.TRUE;
    Character caracter = new Character('#');
    Integer entero = new Integer(12345);
    String cadena = "hola";
    
    cola.enqueue(entero);
    cola.imprimirC();
    cola.enqueue(bool);
    cola.imprimirC();
    cola.enqueue(cadena);
    cola.imprimirC();
    cola.enqueue(caracter);
    cola.imprimirC();
    
    try{
            Object objetoEliminado = null;
            while(true)
            {
            objetoEliminado = cola.dequeue();
            System.out.println(objetoEliminado.toString() + " sacado");
            cola.imprimirC();
            }
        }
        
        catch(ExcepcionListaVacia excepcionListaVacia)
        {
        
        }
    
    }
    
}
