package aprendizaje;

public class OperadorCondicional {
    public static void main(String[] args) {
        //exp1 ? exp2 : exp3 
        int Num1, Num2;
        String Respuesta = "";

        Num1 = 6;
        Num2 = 5;

        Respuesta = (Num1 > Num2) ? "Es mayor" : "Es menor";
        System.out.println(Respuesta);
    }
}
