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

    int cantidadAsientos(){

        int nasientos = 0; 
        for(int i = 0; i < asientos.length; i = i+1) {
            if(asientos[i] != null){
                nasientos++;
            }
        }
        return nasientos; 

    }

    //El metodo verificarIntegridad comparara el numero de registro de los asientos, del motor y
    //del auto para comprobar si son o no originales.

    String verificarIntegridad(){

    if (this.registro == this.motor.registro) {

        for(int i = 0; i < this.asientos.length; i = i+1) {

            if (asientos[i] != null){

                if (this.registro != asientos[i].registro) {         
                    return "Las piezas no son originales";
                }
        
            }

        } return "Auto original";

    } else {return "Las piezas no son originales";}

    }

}