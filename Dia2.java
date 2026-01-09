public class Dia2 {

    public static void Concidionales() {
        //CONDICIONALES
        if (1 == 1) {
            System.out.println("Es verdadero");
        } else {
            System.out.println("Es falso");
        }

        int dinero = 2000;

        int valorHamburguesa = 7500;

        int valorPerro = 5000;

        boolean tieneCebolla = false;

        boolean tienePepinillos = true;


        if (dinero >= valorHamburguesa) {
            System.out.println("compro Hamburguesa");
        } else if (dinero >= valorPerro) {
            System.out.println("compro perro");
        } else {
            System.out.println("No compro nadota");
        }

        if ("1" == "1") {
        }

        if ((dinero >= valorHamburguesa && tieneCebolla == true) || (dinero >= valorHamburguesa && tienePepinillos == true)) {
            System.out.println("compro Hamburguesa");
        }

        int dia = 1;
        if (dia == 1) {
            System.out.println("Lunes");
        } else if (dia == 2) {
            System.out.println("Martes");
        } else if (dia == 3) {
            System.out.println("Miercoles");
        } else if (dia == 4) {
            System.out.println("Jueves");
        } else if (dia == 5) {
            System.out.println("Viernes");
        } else if (dia == 6) {
            System.out.println("Sabado");
        } else if (dia == 7) {
            System.out.println("Domingo");
        }

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }

}
