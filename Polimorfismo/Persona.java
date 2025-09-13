//// Importaciones de clases funcionales para caslcular y dar formato a intervalos de tiempo
import java.time.LocalDate;/// guarda fechas 
import java.time.Period;/// calculador de fechas 
import java.time.format.DateTimeFormatter; // daz un fromat especifico
import java.util.Locale; // hace que el formato se adapte al idioma 

public abstract class Persona {
    private String sexo;
    private String nombre;
    private String apellido;
    private int id;
    private LocalDate fechaNacimiento; //tipo de dato como int, solo que esta es para fechas
    private String especializacion;
    private String nivelAcademico;

//CONSTRUCTOR DE PERSONA/ Estudainte
    public Persona(String sexo, String nombre, String apellido, int id, String FechaTexto){
    this.sexo=sexo;
    this.nombre=nombre;
    this.apellido=apellido;
    this.id=id;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("es", "ES"));// crea un formato e indica el idioma a usar
    this.fechaNacimiento= LocalDate.parse(FechaTexto, formatter); // le asignas una fecha al atributo fechanacimiento 
}                  //Convierte un texto como "01/09/2025" en un objeto LocalDate//
/// constructor de empleado
    public Persona(String sexo, String nombre, String apellido, int id, String FechaTexto, String especializacion, String nivelAcademico){
        this.sexo=sexo;
        this.nombre=nombre;
        this.apellido=apellido;
        this.id=id;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("es", "ES"));
        this.fechaNacimiento= LocalDate.parse(FechaTexto, formatter);
        this.especializacion = especializacion;
        this.nivelAcademico = nivelAcademico;
    }

////// METODO FUNCIONAL PARA OBTENER LA EDAD EXACTE DE UNA PERSONA /////////
public int obtenerEdad(){
    return Period.between(fechaNacimiento, LocalDate.now()).getYears();
}         // obtiene una fecha comparando la acutal        //toma año

//// SETTERS AND GETTERS    

     public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
     }

     public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    @Override
    public String toString(){
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy"); /// da formato al formato fecha 
        return String.format( 
        "----------- INFORMACION ----------- %n" +
        "Sexo: %s%n" +
        "Nombre: %s"+ " " +" %s%n" +
        "ID: %d%n" +
        "Fecha de nacimiento: %s%n", 
        getSexo(),
        getNombre(), getApellido(),
        getId(),
        getFechaNacimiento().format(formatoFecha)
        );
    }
    // Metodo a sobreescribir para otras clases 
    public abstract double sueldos();
    }