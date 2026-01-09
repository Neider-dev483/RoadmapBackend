public class CiclosFor {
    public static void main(String[] args) {

        int numeros = 100;
        int numeroPares = 0;


        for (int i = 0; i <= numeros; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
                numeroPares = numeroPares + i;
            }
        }
        System.out.println("la suma total de los numeros pares es:" + numeroPares);

        numeroPares = 0;

        System.out.println("");
        for (int i = 0; i <= numeros; i += 2) {
            System.out.print(i + ",");
            numeroPares += i;
        }
        System.out.println("la suma total de los numeros pares es:" + numeroPares);
    }
}
