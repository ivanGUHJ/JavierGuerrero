package TiendaAnimales;
public class Perro extends Animal {
        private double peso;
        private String ladrido;
        // Constructor con 3 parámetros
        public Perro(String nombre, String raza, String color, double peso, String ladrido ) {
            super(nombre, raza, color);// aqui busca los atributos de la super clase
            this.peso=peso;
            this.ladrido=ladrido;
        }
        public void ladrar() {
            System.out.println(ladrido);
        }
    // Getters
        public double getPeso() { 
            return peso; }
        public String getLadrido() {
            return ladrido; }
    //Setters
        public void setPeso(double peso) {
            this.peso = peso;
        }
        public void setLadrido(String ladrido) {
            this.ladrido = ladrido;
        }
    }