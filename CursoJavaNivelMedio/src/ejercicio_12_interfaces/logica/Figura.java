package ejercicio_12_interfaces.logica;

public abstract class Figura {
    private String color;

    public Figura(String color){
        this.color = color;
    }

    public abstract double superficie();
}
