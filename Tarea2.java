import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {

        System.out.println("Digite su edad");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();

        if (edad <= 12) {
            System.out.println("Eres un nino");
        } else if (edad > 12 && edad <= 17) {
            System.out.println("Eres un adolecente");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Eres un adulto");
        } else if (edad >= 65) {
            System.out.println("Eres un adulto mayor");
        }
    }
}
