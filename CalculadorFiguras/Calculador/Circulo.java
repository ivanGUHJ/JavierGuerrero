package Calculador;
public class Circulo extends Figura{
    private double pi = 3.1416;
        private double radio;
        
public Circulo(double pi, double radio){
    this.pi=pi; 
    this.radio= radio;
}

// Setters and Getters
    public double getPi() {
        return pi;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    // calculador de area:
    @Override
    public double calcularArea(){
        return pi*radio*radio;
    }
    // Calculador de perimetro 
    @Override
    public double calcularPerimetro(){
        return 2*pi*radio;
    }

    @Override
    public double calcularAreaTriangulo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularAreaTriangulo'");
    }
}