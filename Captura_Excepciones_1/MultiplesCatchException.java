class MultiplesCatchException {
    public static void main(String args[]) {
        int a;
        int b[];
        int c = args.length;
        try {
            a = 10 / c;
            System.out.println("Valor de a = " + a);
            b = new int[5];
            for (int i = 0; i < a; i++) {
                b[i] = i;
                System.out.print("\t" + i);
            }
        } catch (ArithmeticException e) {
            System.out.println("Primera excepción. División por cero:: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Segunda excepción. Indice fuera de límites => " + e);
        } catch (Exception e) {
            System.out.println("Excepción GENERICA... " + e);
        }
    }
}