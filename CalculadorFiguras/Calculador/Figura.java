package Calculador;
public abstract class Figura {
protected double lados; 

public Figura() {
   
}

public abstract double calcularArea();
public abstract double calcularPerimetro();
public abstract double calcularAreaTriangulo();
    public Figura( double lados) {
        this.lados=lados;
    }
    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }
    }
