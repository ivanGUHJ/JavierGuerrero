class PruebaFinally {
    static void metodo1() {
        try {
            System.out.println("en el metodo1");
            throw new RuntimeException("metodo1");
        } finally {
            System.out.println("finally del metodo1");
        }
    }

    static void metodo2() {
        try {
            System.out.println("en el metodo2");
            return;
        } finally {
            System.out.println("finally del metodo2");
        }
    }

    static void metodo3() {
        try {
            System.out.println("en el metodo3");
        } finally {
            System.out.println("finally del metodo3");
        }
    }

    public static void main(String args[]) {
        try {
            metodo1();
        } catch (Exception e) {
            System.out.println("Excepcion capturada");
        }
        metodo2();
        metodo3();
    }
}