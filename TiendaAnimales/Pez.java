package TiendaAnimales;
public class Pez extends Animal {
        private String tipoAgua; //atributo privado
    
        public Pez(String nombre, String raza, String color, String tipoAgua ){
            super(nombre, raza, color);// aqui busca los atributos de la super clase
        }
    
        public String getTipoAgua() {
            return tipoAgua;
        }
    
        public void setTipoAgua(String tipoAgua) {
            this.tipoAgua = tipoAgua;
        }
}
