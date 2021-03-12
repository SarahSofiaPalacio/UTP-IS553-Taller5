
package Ejercicio5;


public class Factura extends Precio{
// Atributos-------------------------------------------------------------------    
    protected String emisor;
    protected String cliente;
    
// Contructores----------------------------------------------------------------
    public Factura(String emisor, String cliente, Double pesos) {
        this.emisor = emisor;
        this.cliente = cliente;
        this.pesos = pesos;
    }
  
// Metodos--------------------------------------------------------------------- 
    
    public String imprimirFactura() {
        
        System.out.println("Persona en la caja: "+emisor
                            +"\nCobra un total de "+pesos
                            +"\nAl cliente: "+cliente);
        
        return "Persona en la caja: "+emisor
               +"\nCobra un total de "+pesos
               +"\nAl cliente: "+cliente;
    } 
}
