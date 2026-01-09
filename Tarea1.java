public class Tarea1 {

    public static void main(String[] args) {

        int alto = 7;
        int ancho = 9;
        int area;
        int perimetro;

        area = alto * ancho;

        String mensajeArea = " EL Area es del rectangulo es: " + area;
        System.out.println(mensajeArea);

        perimetro = 2 * alto + ancho;
        String mensajePerimetro = " EL Perimetro del rectangulo es: " + perimetro;
        System.out.println(mensajePerimetro);
    }
}
