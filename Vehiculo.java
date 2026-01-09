package Clases;

public class Vehiculo {

    private String Modelo;
    private String Marca;
    public String Linea;
    public int CantidadRuedas;

    public Vehiculo(int _Modelo, String _Marca, String _Linea) {
        setModelo(_Modelo);
        setMarca(_Marca);
        Linea = _Linea;
    }


    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setModelo(int modelo) {
        if (modelo > 2000 && modelo <= 2026) {
            Modelo = Integer.toString(modelo);
        } else {
            System.out.println("El mododelo del vehiculo no puede ser menor a 2000 y tiene que ser mayor a 2026 ");
        }

    }

    public void Arrancar() {
        System.out.println("El " + Linea + " ha arrancado");
    }

    public void Apagar() {
        System.out.println("El " + Linea + " Se ha pagado");
    }

}
