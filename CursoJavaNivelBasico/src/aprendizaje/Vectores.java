package aprendizaje;

public class Vectores {
    public static void main(String[] args) {
        //tipo_dato [] nombre_variable = new tipo_dato[dimensión];
        String [] Nombres = new String[3];

        Nombres[0] = "David";
        Nombres[1] = "Mara";
        Nombres[2] = "Christian";

        for (int i = 0; i <= 2; i++) {
            System.out.println(Nombres[i]);
        }
    }
}
