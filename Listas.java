public class Listas {
    public static void main(String[] args) {

        String hola = "Hola mundo";
        System.out.println(hola.length());

        for (int i = 0; i < hola.length(); i++) {
            System.out.println(hola.charAt(i));
        }

        String[] arreglo1 = {"Neider", "Bryan", "Jose", "Carlos"};
        for (int i = 0; i < arreglo1.length; i++) {
            if (arreglo1[i] == "Carlos") {
                System.out.println(arreglo1[i]);
                System.out.println("Esta en la posicion " + i);
            }
        }

    }
}
