public class ciclos {

    public static void main(String[] args) {
        int tope = 10;
        int anterior1 = 0;
        int anterior2 = 1;

        for (int i = 1; i <= tope; i++)  {

            System.out.println("Ejecucion numero: " + i + "  || " + anterior1);

            int siguiente = anterior1 + anterior2;

            anterior1 = anterior2;
            anterior2 = siguiente;
        }
    }
}
