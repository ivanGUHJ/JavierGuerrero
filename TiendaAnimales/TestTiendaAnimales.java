package TiendaAnimales;
public class TestTiendaAnimales {
public static void main(String[] args) {
        Perro perro = new Perro("Luna", "Coli", "Gris", 5.56, "guau - guau");
        Pez pez = new Pez("Nemo", "Pez Payaso", "Naranja, negro y blanco", "Templada");
    
        System.out.println("\n");
        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Raza: " + perro.getRaza());
        System.out.println("Color: " + perro.getColor());
        System.out.println("Peso: " + perro.getPeso() + " kg");
        System.out.println("Ladrido: " + perro.getLadrido());
        
        System.out.println("\n");
        System.out.println("Nombre: " + pez.getNombre());
        System.out.println("Raza: " + pez.getRaza());
        System.out.println("Color: " + pez.getColor());
        System.out.println("Tipo de agua: " + pez.getTipoAgua());
    }
    }
