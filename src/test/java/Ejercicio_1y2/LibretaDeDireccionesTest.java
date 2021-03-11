
package Ejercicio_1y2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LibretaDeDireccionesTest {
    
    public LibretaDeDireccionesTest() {
    }

    @Test
    public void probandoTodo() {
        
        var libreta = new LibretaDeDirecciones();
        
        libreta.añadirEntrada("simon", "Mz 30 Cs 3 Pinares", 
                              "3234567891", "simon@gmail.com");
        
        libreta.añadirEntrada("samuel", "Mz 2 Cs 6 Molinos", 
                              "321456981", "samuel@gmail.com");
        
        libreta.verEntradas();
        
        libreta.borrarEntrada("samuel");
        
        libreta.actualizacionDeUnaEntrada("simon", "Mz 20 Cs 6 Girasol", 
                                          "3234567897", "simon@gmail.com");
        libreta.verEntradas();
    }
    
}
