public class Dia1 {
    //SEMANA1

    //TIPOSDEDATOS

    int numeros; //datos numericos
    String texto; //texto
    boolean true_false;
    double decimales;
    long numeros_largos; //aumenta la memoria
    short numeros_cortos; //aumenta redimiento de memoria
    float numeros_decimales_cortos;
    char alfanumerico; //un solo una letra o numero

    //VARIABLES

    int pirmerNumero = 2;
    int segundoNumero = 3;

    int resultado;

    //var cualquiera = false;

    //OPERADORES
    public void suma() {
        resultado = pirmerNumero + segundoNumero;

        String mensajeResultado = "La suma de " + pirmerNumero + " y " + segundoNumero + " es: " + resultado;

        System.out.println(mensajeResultado);
    }

}
