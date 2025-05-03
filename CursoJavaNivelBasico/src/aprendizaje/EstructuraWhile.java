package aprendizaje;

import java.util.Scanner;

public class EstructuraWhile {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int nroTablaMultiplicar; 
        int nSecuencia = 1;

        System.out.print("Indica el numero que quieres saber su tabla de multiplicar: ");
        nroTablaMultiplicar = Entrada.nextInt();

        while (nSecuencia <= 10) {
            System.out.println(nroTablaMultiplicar + " x " + nSecuencia + " = " + (nroTablaMultiplicar*nSecuencia));
            nSecuencia ++;
        }
    }
}
