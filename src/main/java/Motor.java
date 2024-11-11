package test;

public class Motor {

    //atributos
    int numeroCilindros;
    String tipo;
    int registro;

    //el metodo cambiarRegistro recibe un int que sera el nuevo registro del motor
    void cambiarRegistro(int regnuevo){
        this.registro = regnuevo;
    }

    //el metodo asignarTipo recibe un string que sea el nuevo tipo del motor. solo recibira
    //electrico o gasolina
    void asignarTipo(String tipnuevo){

        if(tipnuevo.equals("electrico") || tipnuevo.equals("gasolina")){
            this.tipo = tipnuevo;
        }

    }

}