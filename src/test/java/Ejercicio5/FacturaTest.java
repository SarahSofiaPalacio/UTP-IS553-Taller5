
package Ejercicio5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FacturaTest {
    
    public FacturaTest() {
    }

    @Test
    public void salidaFactura() {
        Factura facturaEntrada = new Factura("Carlos Cifuentes",
                                             "Javier Antonio",192456.0);
        
        var mensaje = "Persona en la caja: Carlos Cifuentes"
                      +"\nCobra un total de 192456.0"
                      +"\nAl cliente: Javier Antonio";
        
        var mensajeEntrado = facturaEntrada.imprimirFactura();
        
        assertEquals(mensaje, mensajeEntrado);
    }  
    @Test
    public void salidaFactura2() {
        Factura facturaEntrada = new Factura("Andres Moreno",
                                             "Sofia Perez",12446.0);
        
        var mensaje = "Persona en la caja: Andres Moreno"
                      +"\nCobra un total de 12446.0"
                      +"\nAl cliente: Sofia Perez";
        
        var mensajeEntrado = facturaEntrada.imprimirFactura();
        
        assertEquals(mensaje, mensajeEntrado);
    } 
    @Test
    public void salidaFactura3() {
        Factura facturaEntrada = new Factura("Tatiana Velazque",
                                             "Rodrigo Bosco",2456.0);
        
        var mensaje = "Persona en la caja: Tatiana Velazque"
                      +"\nCobra un total de 2456.0"
                      +"\nAl cliente: Rodrigo Bosco";
        
        var mensajeEntrado = facturaEntrada.imprimirFactura();
        
        assertEquals(mensaje, mensajeEntrado);
    } 
}
