package aprendizaje;

import java.util.Scanner;

public class EstructuraFor {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int nroTablaMultiplicar; 
        
        System.out.print("Indica el numero que quieres saber su tabla de multiplicar: ");
        nroTablaMultiplicar = Entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(nroTablaMultiplicar + " x " + i + " = " + (nroTablaMultiplicar*i));
        }
        
    }
}
