import java.util.Scanner;
/*Instrucciones:
Define un saldo inicial de $5000 (como si fuera la billetera del usuario).
Muestra un menú con switch:
Comprar producto
Consultar saldo
Salir
Si elige Comprar producto, pide que ingrese el número del producto:
1 = Pan ($1000)
2 = Leche ($2000)
3 = Café ($3000)
Cualquier otro → "Producto inválido"
Usa if/else para verificar si el usuario tiene saldo suficiente antes de descontarlo.
Si el saldo es suficiente, descuéntalo y muestra "Compra exitosa. Saldo restante: X".
Si no hay saldo suficiente, muestra "Saldo insuficiente".
Si elige Consultar saldo, simplemente muestra el saldo.
Si elige Salir, termina el programa.*/
public class Tarea6 {
    public static void main(String[] args) {

        System.out.println("Veci\n1.Comprar producto\n2.Consultar saldo\n3.Salir");
        Scanner sc = new Scanner(System.in);

        int menu = sc.nextInt();

        int saldo = 5000;

        int valorPan = 1000;
        int valorLeche = 2000;
        int valorCafe = 3000;

        switch (menu) {
            case 1:
                System.out.println("Que quieres comprar?:");
                System.out.println("1.Pan: $" + valorPan + "\n2.Leche: $" + valorLeche + "\n3.Cafe: $" + valorCafe);
                int producto = sc.nextInt();
                switch (producto) {
                    case 1:
                        if (saldo >= valorPan) {
                            saldo = saldo - valorPan;
                            System.out.println("Compra exitosa, saldo restante: " + saldo);
                        } else {
                            System.out.println("No tienes dinero suficiente");
                        }
                        break;
                    case 2:
                        if (saldo >= valorLeche) {
                            saldo = saldo - valorLeche;
                            System.out.println("Compra exitosa, saldo restante: " + saldo);
                        } else {
                            System.out.println("No tienes dinero suficiente");
                        }
                        break;
                    case 3:
                        if (saldo >= valorCafe) {
                            saldo = saldo - valorCafe;
                            System.out.println("Compra exitosa, saldo restante: " + saldo);
                        } else {
                            System.out.println("No tienes dinero suficiente");
                        }
                        break;
                    default:
                        System.out.println("producto inexistente");
                        break;
                }
                break;
            case 2:
                System.out.println("Su saldo es: " + saldo);
                break;
            case 3:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }
}
