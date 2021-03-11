
package Ejercicio_1y2;
import java.util.*;


public class LibretaDeDirecciones {

//--atributos------------------------------------------------------------------    
    protected Map<String, RegistroLibreta> libreta = new HashMap<>();
    
//--constructor----------------------------------------------------------------    
    public LibretaDeDirecciones() {
    }

//--metodos--------------------------------------------------------------------    

    public void añadirEntrada(String nombre, String direccion,
                                    String tell, String email ){
        
        var anadir = new RegistroLibreta(nombre, direccion, tell, email);
        
        libreta.put(nombre,anadir);
    }
    
    public void borrarEntrada(String nombre) {
        
        libreta.remove(nombre);
    }
    
    public  void verEntradas() {
        var entradas = libreta.keySet();
        
        for (String entradakey : entradas) {
            RegistroLibreta libretActual = libreta.get(entradakey);
            System.out.println(libretActual.getNombre()+"\n"
                               +libretActual.getDireccion()+"\n"
                               +libretActual.getTell()+"\n"
                               +libretActual.getEmail()+"\n");
        }
    }
    
    public void actualizacionDeUnaEntrada(String nombre, String direccion,
                                          String tell, String email) {
        
        RegistroLibreta actualizarEntrar = libreta.get(nombre);
        
        actualizarEntrar.setNombre(nombre);
        actualizarEntrar.setDireccion(direccion);
        actualizarEntrar.setTell(tell);
        actualizarEntrar.setEmail(email);
        
    }
     
    
}
