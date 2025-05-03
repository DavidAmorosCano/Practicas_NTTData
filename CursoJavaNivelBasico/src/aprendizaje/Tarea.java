package aprendizaje;

import aprendizaje.EjempleClases;

public class Tarea {
    public static void main(String[] args) {
        Persona oPer1 = new Persona();

        oPer1.Nombre = "David";
        oPer1.Edad = 32;
        oPer1.Telefono = "629521870";

        Persona.Saludo(oPer1.Nombre);
    }
}
