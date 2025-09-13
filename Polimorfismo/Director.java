import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Director extends Empleado {

//// Atributos propios de Director/////
private String nivelJerarquico;
 private LocalDate añosGestion;
/// constructor del Director 

    public Director(String sexo, String nombre, String apellido, int id, String FechaTexto, String especializacion,
            String nivelAcademico, int horasClaseSemanalmente, double sueldoPorHorasPofesor, String nivelJerarquico, String fechaGestionTexto) {
        super(sexo, nombre, apellido, id, FechaTexto, especializacion, nivelAcademico, horasClaseSemanalmente,
                sueldoPorHorasPofesor);
          this.nivelJerarquico=nivelJerarquico;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("es,ES")); /////dandole formato a la fecha a emplear 
        this.añosGestion = LocalDate.parse(fechaGestionTexto, formatter); // asignando tiempo de gestion con formato al atributo años.Gestion 
}

//Metodo funcional para calcular tiempo de gestion
public int obtenerTiempoGestion(){
    return Period.between(añosGestion, LocalDate.now()).getYears();
}
////// Setters and Getters 
    public String getNivelJerarquico() {
        return nivelJerarquico;
    }
    public void setNivelJerarquico(String nivelJerarquico) {
        this.nivelJerarquico = nivelJerarquico;
    }
    public LocalDate getAñosGestion() {
        return añosGestion;
    }
    public void setAñosGestion(LocalDate añosGestion) {
        this.añosGestion = añosGestion;
    }

@Override
public String toString() {
    DateTimeFormatter formatoAñoGestion = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return String.format(
        "%sNivel jerarquico del Director: %s%nAños de Gestion en el pueso: %s%n",
        super.toString(),
        getNivelJerarquico(),
        obtenerTiempoGestion());
}
///// Sobreesripcion del metodo sueldo (para director)
@Override 
    public double sueldos() {
    return getHorasClaseSemanalmente() * getSueldoPorHorasPofesor();
    }
}