package Practica1_200715103;

public class PruebaPila {
    public static void main(String args[]){
    Pila pila = new Pila();
    
        Boolean bool = Boolean.TRUE;
        Character caracter = new Character('$');
        Integer entero = new Integer (34567);
        String cadena = "hola";
        
        pila.push(bool);
        pila.imprimir();
        pila.push(caracter);
        pila.imprimir();
        pila.push(entero);
        pila.imprimir();
        pila.push(cadena);
        pila.imprimir();
        
        
        try{
            Object objetoEliminado = null;
            while(true)
            {
            objetoEliminado = pila.pop();
            System.out.println(objetoEliminado.toString() + " sacado");
            pila.imprimir();
            }
        }
        
        catch(ExcepcionListaVacia excepcionListaVacia)
        {
        
        }
        
        
}      

}
       