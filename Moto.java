package Clases;

public class Moto extends Vehiculo {

    public int Torque;

    public Moto(int _modelo, String _marca, String _linea, int _torque) {

        super(_modelo, _marca, _linea);

    }

    @Override
    public void Arrancar() {
        System.out.println("Se oprime el boton para arrancar la moto");
    }
}
