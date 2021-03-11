
package Ejercicio3;


public class EstudianteInformatica extends Estudiante{
// Atributos-------------------------------------------------------------------
    protected Integer semestre;
    protected String carrera;
    
// Contructores----------------------------------------------------------------

    public EstudianteInformatica(Integer semestre, String carrera) {
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public EstudianteInformatica(Integer semestre, String carrera, 
                                 String email, Integer cedula) {
        super(email, cedula);
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public EstudianteInformatica(Integer semestre, String carrera,
                                String nombre, Integer edad, Integer cedula) {
        super(nombre, edad, cedula);
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public EstudianteInformatica(Integer semestre, String carrera, 
                                String nombre, String email, Integer edad, 
                                Integer tell, Integer cedula) {
        super(nombre, email, edad, tell, cedula);
        this.semestre = semestre;
        this.carrera = carrera;
    }

// Metodos---------------------------------------------------------------------
    public void programar(Estudiante a) {
        
    }
  // Set-----------------------------------------------
    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

  // Get-----------------------------------------------
    public Integer getSemestre() {
        return semestre;
    }

    public String getCarrera() {
        return carrera;
    }
    
}
