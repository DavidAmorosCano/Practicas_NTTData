package aprendizaje;

import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner (System.in);
        // String Datos;
        // Datos = Entrada.nextLine();
        // System.out.println("Este es el contenido ingresado por teclado: " + Datos);
        String Nombre;
        String Profesion;
        int Edad;
        double Sueldo;

        //Preparar el proceso
        System.out.print("Ingresa tú nombre: ");
        Nombre = Entrada.nextLine();

        System.out.print("Ingresa tú profesión: ");
        Profesion = Entrada.nextLine();

        System.out.print("Ingresa tú edad: ");
        Edad = Entrada.nextInt();

        System.out.print("Ingresa tú sueldo: ");
        Sueldo = Entrada.nextDouble();

        System.out.println("Hola " + Nombre + " tú profesion es " + Profesion + ", con edad de " + Edad + " años y un sueldo de " + Sueldo + " euros.");
    }
}
