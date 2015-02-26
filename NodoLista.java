package Practica1_200715103;
//clase para representar un nodo de una lista de jugadores sean plantas o zombies
public class NodoLista {
    //miembros de acceso del paquete; Lista puede utilizarlos directamente.
    Object datos;
    Object cantidad;
    Object fichas;
    Object campos;
    //Plantas-Zombies Atributos
    Object nombre;
    Object ataque;
    Object defensa;
    Object tipoAtaque;
    Object fichasRequeridas;
    //Referencia a NodoLista
    NodoLista siguienteNodo;
    
    
    /***********************CONSTRUCTORES DE NODO***********************/
     NodoLista (Object objeto)
    {
    datos=objeto;
    siguienteNodo=null;
    }
    
     NodoLista (Object objeto, NodoLista nodo)
    {
    datos = objeto;
    siguienteNodo = nodo;
    }
    
     NodoLista (Object objeto, Object cant, Object fich)
    {
    datos=objeto;
    cantidad = cant;
    fichas = fich;
    siguienteNodo=null;
    }
    
    //crear objeto NodoLista que haga referencia al objeto Lista Jugadores 
    NodoLista (Object objeto, Object cant, Object fich, NodoLista nodo)
    {
    datos=objeto;
    cantidad = cant;
    fichas = fich;
    siguienteNodo=nodo;
    }
    
   
    NodoLista (Object objeto, Object cant, Object fich, Object cam)
    {
    datos=objeto;
    cantidad = cant;
    fichas = fich;
    campos = cam;
    siguienteNodo=null;
    }
    
    //crear objeto NodoLista que haga referencia al objeto 
    NodoLista (Object objeto, Object cant, Object fich, Object cam, NodoLista nodo)
    {
    datos=objeto;
    cantidad = cant;
    fichas = fich;
    campos = cam;
    siguienteNodo=nodo;
    }
     //Nodo para crear cola o pila
     NodoLista (Object nombreP, Object ataqueP, Object defensaP, Object tipoAtaqueP, Object fichasP)
    {
    nombre=nombreP;
    ataque = ataqueP;
    defensa = defensaP;
    tipoAtaque = tipoAtaqueP;
    fichas = fichasP;
    siguienteNodo=null;
    }
    
     //Nodo para crear cola o pila
     NodoLista (Object nombreP, Object ataqueP, Object defensaP, Object tipoAtaqueP, Object fichasP, NodoLista nodo)
    {
    nombre=nombreP;
    ataque = ataqueP;
    defensa = defensaP;
    tipoAtaque = tipoAtaqueP;
    fichas = fichasP;
    siguienteNodo=nodo;
    }
    
    
    /******************************METODOS DE RETORNO**********************************************/
    Object obtenerObjeto()
    {
    return datos;
    }
    
    public  Object obtenerCantidad()
    {
    return cantidad;
    }
    
    Object obtenerFichas()
    {
    return fichas;
    }
    
    Object obtenerCampos()
    {
    return campos;
    }
    
    Object obtenerNombre()
    {
    return nombre;
    }
    
    Object obtenerAtaque()
    {
    return ataque;
    }
    
    Object obtenerDefensa()
    {
    return defensa;    
    }
    
    Object obtenerTipoAtaque()
    {
    return tipoAtaque;
    }
    
    Object obtenerFichasRequeridas()
    {
    return fichasRequeridas;
    }
    
    NodoLista obtenerSiguiente()
    {
    return siguienteNodo;
    }
    
}
