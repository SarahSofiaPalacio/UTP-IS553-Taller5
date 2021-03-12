
package Ejercicio5;


public class Factura extends Precio{
// Atributos-------------------------------------------------------------------    
    protected String emisor;
    protected String cliente;
  
 // Metodos--------------------------------------------------------------------- 
  
    public void imprimirFactura(String emisor, String cliente, Double precio) {
        
        System.out.println(emisor+" Cobra un total de "
                           +precio+" al cliente: "+cliente);
    } 
}
