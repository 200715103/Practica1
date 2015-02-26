package Practica1_200715103;



public class PruebaLista {
    
    public static void main(String args[])
    {
        
        Lista listaPrueba = new Lista();
        
        
        String nombre = "julio";
        int cantidad = 200;
        int fichas = 27;
        
        String nombre2 = "ernesto";
        int cantidad2 = 500;
        int fichas2 = 38;
        
        //Objetos a guardar en la lista como prueba
        Boolean bool = Boolean.TRUE;
        Character caracter = new Character('$');
        Integer entero = new Integer (34567);
        String cadena = "hola";
        Integer entero1 = 4;
        Integer entero2 = 5;
        Integer entero3 = 6;
        Integer entero4 = 8;
        Integer entero5 = 9;
                
        
        
        listaPrueba.insertarAlFinal(nombre, cantidad, fichas);
        listaPrueba.imprimir();
        listaPrueba.insertarAlFinal(nombre2, cantidad2, fichas2);
        listaPrueba.imprimir();
        
        
//                 lista.insertarAlFrente(entero2);
//                 lista.imprimir();
//                 lista.insertarAlFrente(entero1);
//                 lista.imprimir();
//                 lista.insertarAlFinal(entero4);
//                 lista.imprimir();
//                 lista.insertarAlFinal(entero5);
//                 lista.imprimir();
//                 lista.insertarAlMedio(entero3);
//                 lista.imprimir();
          
//        lista.insertarAlFrente(bool);
//        lista.imprimir();
//        lista.insertarAlFrente(caracter);
//        lista.imprimir();
//        lista.insertarAlFinal(entero);
//        lista.imprimir();
//        lista.insertarAlFinal(cadena);
//        lista.imprimir();
        
//        try
//        {
//        Object objetoEliminado = lista.eliminarDelFrente();
//        System.out.println(objetoEliminado.toString()+ " eliminado");
//        lista.imprimir();
//        
//        Object objetoEliminado2 = lista.eliminarDelFrente();
//        System.out.println(objetoEliminado2.toString()+ " eliminado");
//        lista.imprimir();
//        
//        Object objetoEliminado3 = lista.eliminarDelFinal();
//        System.out.println(objetoEliminado3.toString()+ " eliminado");
//        lista.imprimir();
//        
//        Object objetoEliminado4 = lista.eliminarDelFinal();
//        System.out.println(objetoEliminado4.toString()+ " eliminado");
//        lista.imprimir();
//        }
//        catch(ExcepcionListaVacia excepListVac)
//                {
//                
//                }
                
        
    }
}
