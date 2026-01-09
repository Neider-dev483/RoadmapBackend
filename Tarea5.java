import java.util.Scanner;
/*Instrucciones:
Define una variable saldo inicial con un valor (ej: 1000).
Muestra un menú con switch con estas opciones:
1.Consultar saldo
2.Depositar dinero
3.Retirar dinero
4.Salir
Si elige Depositar, pide el monto y súmalo al saldo.
Usa if para validar que el monto sea mayor que 0
Si elige Retirar, pide el monto y réstalo al saldo.
Usa if para validar que el saldo sea suficiente.
Si elige una opción inválida, muestra un mensaje de error con default.
Ejemplo de ejecución:
Saldo actual: $1000
Seleccione una opción:
Consultar saldo
Depositar dinero
Retirar dinero
Salir
Opción: 3
Ingrese monto a retirar: 1200
Error: Saldo insuficiente. */

public class Tarea5 {
    public static void main(String[] args) {

        int saldo = 1000;

        System.out.println("menu\n1.consultar saldo\n2.Depositar dinero\n3.Retirar dinero\n4.salir");
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();

        switch (menu) {

            case 1:
                System.out.println("Su saldo es: " + saldo);
                break;
            case 2:
                System.out.println("ingrese el Valor a depositar: ");
                int depositar = sc.nextInt();
                if (depositar > 0) {
                    saldo = saldo + depositar;
                    System.out.println("su saldo es: " + saldo);
                } else {
                    System.out.println("Valor a depositar debe ser mayor a 0");
                }
                break;
            case 3:
                System.out.println("Ingrese el valor a retirar");
                int retirar = sc.nextInt();
                if (retirar > 0 && retirar <= saldo) {
                    saldo = saldo - retirar;
                    System.out.println("su saldo es: " + saldo);
                } else if (retirar > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    System.out.println("El valor a Retirar debe ser mayor a 0");
                }

                break;
            case 4:
                System.out.println("Salir");
                break;
            default:
                System.out.println("opcion invalida");
                break;

        }


    }

}

