import java.time.format.DateTimeFormatter;

public class Estudiante extends Persona {
    private String carrera;
    private String titulo;
    private String añoGraduacion;

//CONTRUCTOR DE ESTUDIANTE 
    public Estudiante(String sexo, String nombre, String apellido, int id , String FechaTexto, String carrera, String titulo, String añoGradaucion){
        super(sexo, nombre, apellido, id, FechaTexto);

        this.titulo=titulo;
        this.carrera=carrera;
        this.añoGraduacion= añoGradaucion;
    }

// CONSTRUCTOR DE CAMBIAR CARRERA 
    public void cambiarCarrera( String carreraNueva ){
        this.carrera=carreraNueva;
        }

//////////// ARREGLO ARRAY CALIFICACIONES /////////// (transforma letras en num.)
        public double calcularPromedio(String[] calificaciones){ 
            double suma = 0.0; /// inicia un variable suma, iniciando dese 0
            for (int i =0; i < calificaciones.length; i++){ // recorre el arreglo con for 
                String calif=calificaciones[i]; /// en cada conteo se toma una calificacion como texto (calif)
                switch (calif) { /// transforma de texto a int
                    case "A+": suma+= 4.0; break;
                    case "A-": suma+= 3.67; break;
                    case "B+": suma += 3.33; break;
                    case "B": suma += 3.0; break;
                    case "B-": suma += 2.67; break;
                    case "C+": suma += 2.33; break;
                    case "C": suma += 2.0; break;
                    case "D": suma += 1.0; break;
                    case "F": suma += 0.0; break;

                    default: System.out.println( "Calificacion inexistente:" + calif);
                }

///////// INTENTO DE CONTRUCTOR PARA EL PROMEDIO ////////
            }
            return suma/ calificaciones.length; /// se obtien la suma de calificacione y divide entre el num. de calificaiones 
        }

//// SETTERS AND GETTERS /////////

    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAñoGraduacion() {
        return añoGraduacion;
    }
    public void setAñoGraduacion(String añoGraduacion) {
        this.añoGraduacion = añoGraduacion;
    }
    // SOBREESCRIPCION DEL METODO toString (Formato de imprecion)/////////
  @Override
  public String toString(){
    return String.format(
        super.toString() +
        "Carrera del estudiante: " + getCarrera() +
        "%nTitulo: " + getTitulo() +  
        "%nAño de graduacion: " + getAñoGraduacion()
        );
    }
@Override                   /// el alumno no tiene sueldo entonces dejor que retorne 0.0 
public double sueldos(){    ///////por defecto a la hora de pegar el sueldo
    return 0.0;
}
}