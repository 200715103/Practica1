package Practica1_200715103;

public class Lista {
    
    private NodoLista primerNodo;
    private NodoLista ultimoNodo;
    private String nombre;
    
    
    /*********************CONSTRUCTORES LISTA*********************/
    public Lista()
    {
    nombre= "Lista Jugadores";
    }
    
    public Lista (String nombreLista)
    {
    nombre= nombreLista;
    primerNodo=ultimoNodo=null;
    }
    
    
    
    
    /**********INSERTAR AL FRENTE ORIGINAL
     * @param nombreInsertar
     **********/
    public synchronized void insertarAlFrente(Object nombreInsertar)
    {
        if(estaVacia())
        {
        primerNodo = ultimoNodo = new NodoLista(nombreInsertar);
        }
        else
        {
        primerNodo = new NodoLista (nombreInsertar, primerNodo);
        }
    }
    
    
    
    
    /**********INSERTAR AL FRENTE LISTA JUGADOR PLANTA**********/
    public synchronized void insertarAlFrente(Object nombreInsertar, Object cantidadInsertar, Object fichasInsertar)
    {
        if(estaVacia())
        {
        primerNodo = ultimoNodo = new NodoLista(nombreInsertar, cantidadInsertar, fichasInsertar);
        }
        else
        {
        primerNodo = new NodoLista (nombreInsertar, cantidadInsertar, fichasInsertar, primerNodo);
        }
    }
    
   
    /**********INSERTAR AL FRENTE CATALOGO ZOMBIES**********/
    public synchronized void insertarAlFrente(Object nombreInsertar, Object ataquePlanta, Object defensaPlanta, Object cantidadFichas, Object tipoAtaque)
    {
        if(estaVacia())
        {
        primerNodo = ultimoNodo = new NodoLista(nombreInsertar, ataquePlanta, defensaPlanta, cantidadFichas, tipoAtaque );
        }
        else
        {
        primerNodo = new NodoLista (nombreInsertar, ataquePlanta, defensaPlanta, cantidadFichas, tipoAtaque, primerNodo);
        }
    }
    
    /**********INSERTAR AL FINAL ORIGINAL**********/
    public synchronized void insertarAlFinal(Object nombreInsertar)
    {
        if(estaVacia())
        {
        primerNodo = ultimoNodo = new NodoLista(nombreInsertar);
        }
        else
        {
        ultimoNodo.siguienteNodo = new NodoLista(nombreInsertar);
        ultimoNodo = ultimoNodo.siguienteNodo;
        //ultimoNodo = ultimoNodo.siguienteNodo = new NodoLista(elementoInsertar);
        } 
     }   
    
      /**********INSERTAR AL FINAL COLA PLANTAS**********/
    public synchronized void insertarAlFinal(Object nombreInsertar, Object ataquePlanta, Object defensaPlanta, Object tipoAtaque, Object cantidadFichas)
    {
        if(estaVacia())
        {
        primerNodo = ultimoNodo = new NodoLista(nombreInsertar, ataquePlanta, defensaPlanta, tipoAtaque, cantidadFichas);
        }
        else
        {
        ultimoNodo.siguienteNodo = new NodoLista(nombreInsertar, ataquePlanta, defensaPlanta, tipoAtaque, cantidadFichas);
        ultimoNodo = ultimoNodo.siguienteNodo;
        //ultimoNodo = ultimoNodo.siguienteNodo = new NodoLista(elementoInsertar);
        } 
     }   
    
     /**********INSERTAR AL FINAL**********/
    public synchronized void insertarAlFinal(Object nombreInsertar, Object cantidadInsertar, Object fichasInsertar)
    {
        if(estaVacia())
        {
        primerNodo = ultimoNodo = new NodoLista(nombreInsertar, cantidadInsertar, fichasInsertar);
        }
        else
        {
        ultimoNodo.siguienteNodo = new NodoLista(nombreInsertar, cantidadInsertar, fichasInsertar);
        ultimoNodo = ultimoNodo.siguienteNodo;
        //ultimoNodo = ultimoNodo.siguienteNodo = new NodoLista(elementoInsertar);
        } 
     }   
        
         /**********ELIMINAR PRIMER NODO LISTA**********/
    public synchronized Object eliminarDelFrente()throws ExcepcionListaVacia
    {
        if(estaVacia())
        {
            System.out.println(nombre+" esta vacia");
            throw new ExcepcionListaVacia(nombre);    
        }
        Object elementoEliminado = primerNodo.nombre;
        if(primerNodo == ultimoNodo)
        {
        primerNodo = ultimoNodo = null;
        }
        else
        {
        primerNodo = primerNodo.siguienteNodo;
        }
        return elementoEliminado;
    }
    
    
    public synchronized Object obtenerDatos(NodoLista nodo)
    {
    NodoLista actual = primerNodo;    
    Object objeto = null;
    
     while(actual!=null)
        {
        if (actual.datos == nodo.datos)
        {
        objeto = nodo.datos;
        }
        else
        {
        System.out.println("Dato no disponible");
        }
        actual=actual.siguienteNodo;
        }
    
    return objeto;
    }
    
        /**********ELIMINAR ULTIMO NODO LISTA**********/
    public synchronized Object eliminarDelFinal() throws ExcepcionListaVacia
    {
        if(estaVacia())
        {
        throw new ExcepcionListaVacia(nombre);
        }  
        
        Object elementoEliminado = ultimoNodo.datos;
        if(primerNodo == ultimoNodo)
        {
        primerNodo = ultimoNodo = null;
        }
        else
        {
        NodoLista actual = primerNodo;
        //iterar mientras nodo actual no sea ultimo nodo
        while(actual.siguienteNodo != ultimoNodo)
            actual = actual.siguienteNodo;
        ultimoNodo = actual;
        actual.siguienteNodo=null;
        }
        return elementoEliminado;
    }
    
    public synchronized boolean estaVacia()   
    {    
        
        Boolean aux=false;
        if (primerNodo!=null)
        {
        aux=false;    
        } 
        else 
        {
        aux=true;//devolver true si la lista esta vacia
        }
        return aux;
    }    
    
    public synchronized void imprimir()
    {
        if(estaVacia())
        {
        System.out.println(nombre+" vacia");
        }
        System.out.print(nombre+" es: ");
        NodoLista actual = primerNodo;
        while(actual!=null)
        {
        System.out.print(actual.obtenerObjeto().toString()+" "+actual.obtenerCantidad().toString()+" "+actual.fichas.toString()+" ");
        actual=actual.siguienteNodo;
        }
      
        System.out.println("\n");
        
    }
    
    
    public synchronized void imprimirCola()
    {
    if(estaVacia())
        {
        System.out.println(nombre+" vacia");
        }
        System.out.print(nombre+" es: ");
        NodoLista actual = primerNodo;
        while(actual!=null)
        {
        System.out.print(actual.nombre.toString()+" ");
        actual=actual.siguienteNodo;
        }
      
        System.out.println("\n");
    
    }
    
    public synchronized void imprimirPila()
    {
    if(estaVacia())
        {
        System.out.println(nombre+" vacia");
        }
        System.out.print(nombre+" es: ");
        NodoLista actual = primerNodo;
        while(actual!=null)
        {
        System.out.print(actual.nombre.toString()+" ");
        actual=actual.siguienteNodo;
        }
      
        System.out.println("\n");
    
    }
    
    
}
