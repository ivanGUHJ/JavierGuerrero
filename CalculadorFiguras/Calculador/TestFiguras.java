package Calculador;

public class TestFiguras {
    public static void main(String[] args) {
        
        Cuadrado miCuadrado = new Cuadrado(5);

        Circulo miCirculo = new Circulo(3.1416, 0.5);
        
        Triangulo miTriangulo = new Triangulo(5); 
        Triangulo calcularAreaTriangulo= new Triangulo(4.0,4.0);

        
      
        Figura[] figuras = {miCuadrado, miCirculo, miTriangulo};

        System.out.println("--- Calculadora de Figuras ---");
        for (Figura figura : figuras) {
            System.out.println("\nCalculando para una figura...");
            System.out.println("Area: " + figura.calcularArea());
            System.out.println("Perimetro: " + figura.calcularPerimetro());
    }
   System.out.println("El área del triángulo es: " + calcularAreaTriangulo.calcularArea()); 
}
}

