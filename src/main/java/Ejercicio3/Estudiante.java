
package Ejercicio3;

public class Estudiante {
// Atributos-------------------------------------------------------------------
    protected String nombre;
    protected String email;
    protected Integer edad;
    protected Integer tell;
    protected Integer cedula;
    
// Contructores----------------------------------------------------------------
    
    public Estudiante(String email, Integer cedula) {
        this.email = email;
        this.cedula = cedula;
    }
    
    public Estudiante(String nombre, Integer edad, Integer cedula) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
    }
    
    public Estudiante(String nombre, String email, Integer edad,
                      Integer tell, Integer cedula) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.tell = tell;
        this.cedula = cedula;
    }
// Metodos---------------------------------------------------------------------
        
    public void estudiar() {
        
    }
    
    public void comunicarse(Estudiante a) {
        
    }
    
  // Set-----------------------------------------------
    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }
  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setTell(Integer tell) {
        this.tell = tell;
    }

  // Get-----------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public Integer getEdad() {
        return edad;
    }

    public Integer getTell() {
        return tell;
    }

    public Integer getCedula() {
        return cedula;
    }
    
}
