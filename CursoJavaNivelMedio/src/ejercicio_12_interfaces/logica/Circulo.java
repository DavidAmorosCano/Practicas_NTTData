package ejercicio_12_interfaces.logica;

import ejercicio_12_interfaces.auxiliar.Proceso;

public class Circulo extends Figura implements Proceso{
    private int radio;

    public Circulo(String color, int radio){
        super(color);
        this.radio = radio;
    }

    @Override
    public double superficie() {
        return Math.PI*radio*radio;
    }

    @Override
    public void imprimir() {
        System.out.println("El radio es: "+radio);
    }

    @Override
    public void aumentar(int c) {
       radio+=c;
    }
}
