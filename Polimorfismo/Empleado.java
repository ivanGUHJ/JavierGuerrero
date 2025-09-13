import java.time.format.DateTimeFormatter;

import Pack_Etudiante.Persona;
public class Empleado extends Persona {

    private final double sueldoPorHorasPofesor = 350.0; 
    private int horasClaseSemanalmente;

/// construccion del  profesor /////
public Empleado(
    String sexo, String nombre, String apellido, int id, String FechaTexto, 
    String especializacion, String nivelAcademico, int horasClaseSemanalmente, 
    double sueldoPorHorasPofesor) {
    super(sexo, nombre, apellido, id, FechaTexto, especializacion, nivelAcademico);
    this.horasClaseSemanalmente=horasClaseSemanalmente;
}

//// SETTERS AND GETTERS //////////
public double getSueldoPorHorasPofesor() {
    return sueldoPorHorasPofesor;
}
public int getHorasClaseSemanalmente() {
    return horasClaseSemanalmente;
}
public void setHorasClaseSemanalmente(int horasClaseSemanalmente) {
    this.horasClaseSemanalmente = horasClaseSemanalmente;
}

////////// toString del profesor ////////////
@Override
public String toString() {
    return String.format(
        "%sEspecializacion Profesor@: %s%nNivel academico del Profesor@: %s%n",
        super.toString(),
        getEspecializacion(),
        getNivelAcademico()
    );
}
///// Sobreesripcion del metodo sueldo (para profes) 
@Override 
    public double sueldos() {
    return getHorasClaseSemanalmente() * getSueldoPorHorasPofesor();
    }
}