package test;

public class Auto {

    //atributos
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static String cantidadCreados;

    //El metodo cantidadAsientos recibira un objeto de tipo auto y devolvera el numero de
    //objetos de tipo asiento que hagan parte de el array asientos

    int cantidadAsientos(Auto auto){

        int nasientos; 
        nasientos = size(this.asientos);
        return nasientos; 

    }

    //El metodo verificarIntegridad comparara el numero de registro de los asientos, del motor y
    //del auto para comprobar si son o no originales.

    String verificarIntegridad(Auto auto){

        if (this.registro != (motor.registro && asientos.registro)) {

            return "Las piezas no son originales";

        } else {
            return "Auto original";
        }

    }

}