
package Ejercicio_1y2;


public class RegistroLibreta {
//--atributos------------------------------------------------------------------    
    protected String nombre;
    protected String direccion;
    protected String tell;
    protected String email;
//--constructores--------------------------------------------------------------
    public RegistroLibreta(String nombre, String direccion, 
                           String tell, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tell = tell;
        this.email = email;
    }

    public RegistroLibreta(String nombre, String tell) {
        this.nombre = nombre;
        this.tell = tell;
    }
//--metodos--------------------------------------------------------------------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//------------------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTell() {
        return tell;
    }

    public String getEmail() {
        return email;
    }
    
    
}


