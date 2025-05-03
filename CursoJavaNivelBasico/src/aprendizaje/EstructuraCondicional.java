package aprendizaje;

import java.util.Scanner;

public class EstructuraCondicional {
    public static void main(String[] args) {
        int Edad;
        Scanner Entrada = new Scanner(System.in);

        System.out.print("Ingresa tú edad: ");
        Edad = Entrada.nextInt();
        if (Edad < 15) {
            System.out.println("Eres un niño");
        }
        else if (Edad < 17){
            System.out.println("Eres un adolescente");
        }
        else {
            System.out.println("Eres un adulto");
        }
    }
}
