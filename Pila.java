package Practica1_200715103;

public class Pila extends Lista{
    
    public Pila()
    {
    super("pila");
    }
    
    public Pila(String nombre)
    {
    super(nombre);
    }
    
    
    public synchronized void push(Object nombre)
    {
    insertarAlFrente(nombre);
    }
    
    public synchronized void push(Object nombre, Object ataque, Object defensa, Object tipoAtaque, Object fichasRequeridas)
    {
    insertarAlFrente(nombre, ataque, defensa, tipoAtaque, fichasRequeridas);
    }
    
    public synchronized Object pop() throws ExcepcionListaVacia
    {
    return eliminarDelFrente();
    }
    
    public synchronized void imprimirP()
    {
    imprimirPila();
    }
    
    
}
