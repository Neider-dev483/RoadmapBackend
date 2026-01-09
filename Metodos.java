public class Metodos {

    public static void main(String[] args) {
        int resultadoSuma = Sumar(2, 3);
        Imprimir(resultadoSuma);
        resultadoSuma = Sumar(1, 4, 7);
        Imprimir(resultadoSuma);
    }

    public static void Imprimir(Object param) {
        System.out.println(param);
    }

    public static int Sumar(int x, int y) {
        int resultado = x + y;
        return resultado;
    }

    public static int Sumar(int x, int y, int z) {
        int resultado = x + y + z;
        return resultado;
    }
}
