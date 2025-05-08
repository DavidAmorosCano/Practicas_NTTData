package ejercicio_12_interfaces.varios;

import ejercicio_12_interfaces.auxiliar.Proceso;

public class mesa implements Proceso{
    private int ancho, largo;
    
    public mesa(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public void imprimir() {
        System.out.println("El ancho es "+ ancho + "y el largo es " + largo);
    }

    @Override
    public void aumentar(int c) {
        ancho += c;
        largo += c;
    }
    
}
