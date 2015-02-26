package Practica1_200715103;

public class Cola extends Lista{
    
    public Cola()
    {
    super("cola");
    } 
    
    public Cola(String nombre)
    {
    super(nombre);
    }
    
    
    
    public synchronized void enqueue(Object nombre, Object ataque, Object defensa, Object tipoAtaque, Object fichasRequeridas)
    {
    insertarAlFinal(nombre, ataque, defensa, tipoAtaque, fichasRequeridas);
    }
    
    
    
    public synchronized void enqueue(Object objeto)
    {
    insertarAlFinal(objeto);
    }
    
    public synchronized Object dequeue()throws ExcepcionListaVacia
    {
    return eliminarDelFrente();
    }
    
    
    
    public synchronized boolean estaVaciaC()
    {
    return estaVacia();
    }
    
    
    public synchronized void imprimirC()
    {
    imprimirCola();
    }
}
