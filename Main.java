
import Clases.Coche;
import Clases.Moto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coche toyota = new Coche("Toyota", 2025, "Supra ");
        System.out.println("Este coche es de marca " + toyota.getMarca() + " de la linea " + toyota.Linea + " modelo " + toyota.getModelo());
        toyota.Arrancar();

        Coche chevrolet = new Coche("Chevrolet", 2018, "Spark GT");
        System.out.println("Este coche es de marca " + chevrolet.getMarca() + " de la linea " + chevrolet.Linea + " modelo " + chevrolet.getModelo());
        chevrolet.Arrancar();
        chevrolet.Apagar();

        Moto ktm = new Moto(2025, "KTM", "390", 27);
        System.out.println("Esta ese de marca " + ktm.getMarca() + " de la linea" + ktm.Linea + " modelo " + ktm.getModelo());
        ktm.Arrancar();
        ktm.Apagar();
    }

}



