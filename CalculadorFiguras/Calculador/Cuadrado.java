package Calculador;
public class Cuadrado extends Figura {
    public Cuadrado(double lados){
        super(lados);
    }    
// calculador de area:
    @Override
    public double calcularArea() {
        return lados * lados;

    }
    // Calculador de perimetro 
    @Override
    public double calcularPerimetro() {
        return lados * 4;
    }
    @Override
    public double calcularAreaTriangulo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularAreaTriangulo'");
    }
}

