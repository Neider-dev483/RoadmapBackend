import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        System.out.println("Digite su nota");
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();

        if (nota <= 100 && nota >= 90) {
            System.out.println("Excelente");
        } else if (nota <= 89 && nota >= 80) {
            System.out.println("Muy bueno");
        } else if (nota <= 79 && nota >= 70) {
            System.out.println("Bueno");
        } else if (nota <= 69 && nota >= 60) {
            System.out.println("suficiente");
        } else if (nota < 60 && nota > 0) {
            System.out.println("Reprobado");
        } else if (nota > 100 || nota < 0) {
            System.out.println("Nota invalida");
        }
    }
}
