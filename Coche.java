package Clases;

public class Coche extends Vehiculo {

    public int CaballosFuerza;

    public Coche(String _Marca, int _Modelo, String _Linea) {

        super(_Modelo, _Marca, _Linea);

    }

    @Override
    public void Arrancar() {
        System.out.println("Se gira la llave para encender el coche");
    }
}
