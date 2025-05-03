package aprendizaje;

import java.util.Scanner;

public class TrabajandoConSwitch {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int nDia;
        String cResultado;
        System.out.print("Indique el numero del dia de la semana: ");
        nDia = Entrada.nextInt();
        switch (nDia) {
            case 1:
                cResultado = "Lunes";
                break;
            case 2:
                cResultado = "Martes";
                break;
            case 3:
                cResultado = "Miercoles";
                break;
            case 4:
                cResultado = "Jueves";
                break;
            case 5:
                cResultado = "Viernes";
                break;
            case 6:
                cResultado = "Sábado";
                break;
            case 7:
                cResultado = "Domingo";
                break;
            default:
                cResultado = "El número de dia no es válido.";
                break;
        }
        System.out.println(cResultado);
    }
}
