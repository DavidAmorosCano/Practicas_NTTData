package aprendizaje;

class Persona {
    //Atributos
    String Nombre;
    int Edad;
    String Telefono;
    
    static void Saludo(String cNombre) {
        System.out.println("Hola que tal " + cNombre);
    }
}

public class EjempleClases {
    public static void main(String[] args) {
        Persona oAlumno1 = new Persona();
        Persona oAlumno2 = new Persona();
    
        oAlumno1.Nombre = "David";
        oAlumno1.Edad = 32;
        oAlumno1.Telefono = "629521870";

        oAlumno2.Nombre = "Tamara";
        oAlumno2.Edad = 36;
        oAlumno2.Telefono = "68762845";

        System.out.println(oAlumno1.Nombre);

        Persona.Saludo(oAlumno1.Nombre);
    }
}
