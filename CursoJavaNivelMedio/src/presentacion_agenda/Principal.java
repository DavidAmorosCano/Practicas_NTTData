package presentacion_agenda;

import java.util.Scanner;

import beans_agenda.Contacto;
import logica_agenda.GestionContactos;

public class Principal {
    public static void main(String[] args) {
        GestionContactos gestor = new GestionContactos();
        Scanner sc = new Scanner(System.in);
        int op, edad;
        String nombre, email;
        do{
            System.out.println("1.- Añadir contacto");
            System.out.println("2.- Buscar contacto");
            System.out.println("3.- Eliminar contacto");
            System.out.println("4.- Mostrar todos");
            System.out.println("5.- Salir");

            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    System.out.print("Nombre: ");
                    nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    edad = Integer.parseInt(sc.nextLine());
                    System.out.print("Email: ");
                    email = sc.nextLine();
                    gestor.agregar(nombre, edad, email);
                    break;
                case 2:
                    System.out.println("Email: ");
                    email = sc.nextLine();
                    Contacto c = gestor.buscar(email);
                    //si es null, es que no se ha encontrado
                    if (c == null){
                        System.out.println("No se encontró el contacto.");
                    }else{
                        System.out.println(c.getNombre() + " - " + c.getEdad() + " - " + c.getEmail());
                    }
                    break;
                case 3:
                    System.out.print("Email: ");
                    email = sc.nextLine();
                    if (gestor.eliminar(email)) {
                        System.out.println("Contacto eliminado."); 
                    }else{
                        System.out.println("No se encontró el contacto.");
                    }
                    break;
                case 4:
                    //en la variable se guarda el array devuelto por el método
                    Contacto[] todos = gestor.recuperarContactos();
                    for (Contacto con : todos) {
                        System.out.println(con.getNombre() + " - " + con.getEdad() + " - " + con.getEmail());
                    }
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("El comando no es válido.");
                    break;
            }
        }while (op != 5);
    }
}
