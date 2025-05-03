package aprendizaje;

public class Matrices {
    public static void main(String[] args) {
        String [][] Personas = new String[4][3];

        Personas[0][0] = "David";
        Personas[0][1] = "Amorós";
        Personas[0][2] = "Cano";

        Personas[1][0] = "Tamara";
        Personas[1][1] = "Garcia";
        Personas[1][2] = "Moreno";

        Personas[2][0] = "Christian";
        Personas[2][1] = "Amorós";
        Personas[2][2] = "Cano";

        Personas[3][0] = "Antonia";
        Personas[3][1] = "Cano";
        Personas[3][2] = "Jimenez";

        for (int a = 0; a <= 3; a++){

            for (int i = 0; i <= 2; i++){
                System.out.println(Personas[a][i]);
            }
            System.out.println("---------------------");
        }
    }
}
