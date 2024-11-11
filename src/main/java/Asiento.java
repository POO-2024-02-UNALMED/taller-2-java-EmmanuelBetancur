package test;

public class Asiento {
    
    //atributos
    String color;
    int precio;
    int registro;
    
    //metodo de cambio de color. debe ser rojo verde amarillo negro o blanco.
    void cambiarColor(String c) {

        if (c.equals("rojo") || c.equals("verde") || c.equals("amarillo") || c.equals("negro") || c.equals("blanco")) {

            this.color = c; 

        }

    } 

}