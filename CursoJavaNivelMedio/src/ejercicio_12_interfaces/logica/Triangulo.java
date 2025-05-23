package ejercicio_12_interfaces.logica;

import ejercicio_12_interfaces.logica.Figura;

public class Triangulo extends Figura {
    private int base;
    private int altura;
    
    public Triangulo(String color, int base, int altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

}

@Override
public double superficie(){
    return base*altura/2;
}