package Calculador;
public class Triangulo extends Figura{
    private double base;
    private double altura;

public Triangulo(double base, double altura){
    this.altura = altura;
    this.base = base;
}
// Setters and Getters
public Triangulo(double lados ){
    super(lados);
}
public double getBase() {
    return base;
}
public void setBase(double base) {
    this.base = base;
}
public double getAltura() {
    return altura;
}
public void setAltura(double altura) {
    this.altura = altura;
}

// calculador de area:
@Override 
public double calcularArea(){
    return base*altura/2;
}
// Calculador de perimetro 
@Override
public double calcularPerimetro(){
    return lados*3;
}
@Override
public double calcularAreaTriangulo() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'calcularAreaTriangulo'");
}
}
