import java.util.Scanner;

public class PruebaEstudiante {
    public static void main(String[] args) {
       
        //// ARRAY CALOFOCACIONES//////////
       String[] calificaciones = { "A+", "A+", "A+", "A+", "A+"}; 

    ////// CREACION DEL OBJETO Scanner/////////
        Scanner scanner = new Scanner(System.in);
        //clase que lee datos       // traduce lo que quiere decir el usuario y lo 
                                    //traducea la compu 

//// CREACION DEL OBJETO ESTUDIANTE//////////
    Estudiante estudiante = new  Estudiante
       (
        "Hombre", "Javier", "Guerrero", 2428590, "12/02/2006", 
        "Ingenieria en Computacion", "Ingeniero", "2029"
        );
//// Objeto profesor 
    Empleado profesor = new Empleado(
        "Mujer", "Aline", "Betancourt", 130922, "12/02/2006", 
        "Diseño industrial", "Estudios avanzados", 2 , 350.0
        );
/// Objeto Director 
        Director director = new Director("Mujer", "Juan", "Guarnizo", 456,
        "15/11/1925", "Matematicas", "Doctorado",
         20, 350.5, "Director General", "01/09/2020"
         );

// ejemplo de polimorfismo 
Persona [] personas = new Persona[3]; // guardamos los objetos a heredar de las subclases en "personas"
        personas[0]= estudiante;
        personas[1]= profesor;
        personas[2]= director;
////Procesar la info con polimorfismo 
for (Persona persona : personas) {  // recorre el arreglo de arriba y pide los obejtos en comun de las clases 
    System.out.println(persona.toString());
    System.out.println("Edad: " + persona.obtenerEdad() + " años");
    System.out.println("Sueldo Semanal: $" + persona.sueldos());
    System.out.println("---------------------------------------------");
}
///////  MOSTRAR PROMEDIO/////////
double promedio = estudiante.calcularPromedio(calificaciones); // se usa el metodo calcularPromedio  e imprime el resultado 
   System.out.println("Promedio Final del estudiante: " + promedio);   

/////// CAMBIAR CARRERA DEL ESTUDIANTE/////////
System.out.print("¿Deseas cambiar la carrera del estudiante?: (si/no):"); // pregunta
String respuesta = scanner.nextLine().trim().toLowerCase();                                                           
// Variable respuesta, "scanner.nextLine()" lee la linea de texto, "trim" quita espacios de la respuesta del usuario, 
//"toLowerCase() convierte a minusculas. Esto es útil para que el programa no se confunda si el usuario escribe "SI", "Si", "sI", etc.
//// LOGICA DEL CAMBIO////
    if (respuesta.equals("si")) { 
        System.out.print("Ingresa la carrera a actualizar: ");
        String nuevaCarrera = scanner.nextLine();
        System.out.println("Carrera actualizada: " + nuevaCarrera);
        System.out.println("Fin del programa. :D");
    } else if (respuesta.equals("no")){
        System.out.println("Fin del programa. :D");
    } else {
        System.out.println("Opcion no valida. Fin del programa.");
    }

scanner.close();
}
}