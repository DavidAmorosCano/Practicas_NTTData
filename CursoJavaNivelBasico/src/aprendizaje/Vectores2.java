package aprendizaje;

import java.util.Scanner;

public class Vectores2 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int cantidadNotas;

        System.out.print("Indica la cantidad de notas a introducir: ");
        cantidadNotas = Entrada.nextInt();

        int [] Notas = new int[cantidadNotas];
        
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Indica la nota para la posicion " + i + ": ");
            Notas[i] = Entrada.nextInt();
        }

        System.out.println("Notas ingresadas");
        for (int a = 0; a < cantidadNotas; a++) {
            System.out.println(Notas[a]);

        }
    }
}
