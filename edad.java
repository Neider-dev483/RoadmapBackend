import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
        int anoActual = 2025;
        System.out.println("Ingrese su año de nacimiento: ");
        Scanner sc = new Scanner(System.in);
        int anoNacimiento = sc.nextInt();
        int resultadoEdad = CalcularEdad(anoActual, anoNacimiento);
        ImprimirEddad(resultadoEdad);
    }

    public static int CalcularEdad(int anoActual, int anoNacimiento) {
        int edad = anoActual - anoNacimiento;
        return edad;
    }

    public static void ImprimirEddad(int edad) {
        System.out.println("Su edad es: " + edad);
    }
}
