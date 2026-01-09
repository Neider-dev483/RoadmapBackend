public class While {  public static void main(String[] args) {

    int num_1 = 0;
    int num_2 = 1;

    int tope = 0;

    System.out.println(num_1);
    System.out.println(num_2);

    while (tope < 10) {
        int numero_siguiente = num_1 + num_2;
        System.out.println(numero_siguiente);
        num_1 = num_2;
        num_2 = numero_siguiente;
        tope++;
    }
}
}
