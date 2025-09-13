public class UsoDeExcepciones {
    public static void main(String args[]) {
        try {
            lanzaExcepcion();
        } catch (Exception exception) {
            System.err.println("La excepción se manejo en main");
        }

        noLanzaException();
    }

    public static void lanzaExcepcion() throws Exception {
        try {
            System.out.println("Método lanzaExcepcion");
            throw new Exception();
        } catch (Exception exception) {
            System.err.println("La excepción se manejo en el método lanzaExcepcion");
            throw exception;
        } finally {
            System.err.println("Se ejecuto finally en lanzaExcepcion");
        }
    }

    public static void noLanzaException() {
        try {
            System.out.println("Método noLanzaExcepcion");
        } catch (Exception exception) {
            System.err.println(exception);
        } finally {
            System.err.println("Se ejecuto finally en noLanzaExcepcion");
        }
        System.out.println("Fin del método noLanzaException");
    }
}