package presentacion_notas;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

import logica_notas.GestionNotas;

public class Principal {
    public static void main(String[] args) {
        GestionNotas gnotas = new GestionNotas();
        int op; //opcion elegida por el usuario
        Scanner sc = new Scanner(System.in);
        double nota;
        do{
            //presentamos menú
            System.out.println("1.- Añadir nota");
            System.out.println("2.- Ver media");
            System.out.println("3.- Ver aprobados");
            System.out.println("4.- Salir");
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    System.out.print("Introduce nota: ");
                    nota = Double.parseDouble(sc.nextLine());
                    gnotas.guardarNota(nota);
                    break;
                case 2:
                    System.out.println("Media actual: " + gnotas.media());
                    break;
                case 3:
                    System.out.println("Aprobados: " + gnotas.aprobados());
                case 4:
                    System.out.println("Saliendo");
                default:
                    System.out.println("Comando no existente");
                    break;
            }
        }while(op != 4);
    }
}
