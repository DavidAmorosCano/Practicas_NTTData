package aprendizaje;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int Num1, Num2;
        boolean Resultado;

        Num1 = 10;
        Num2 = 15;

        //AND (Los dos verdaderos)
        Resultado = (5 == 5) && (6 == 6);
        System.out.println(Resultado);

        //OR (Uno tiene que ser verdadero)
        Resultado = (Num1 == Num2) || (Num1 < Num2);
        System.out.println(Resultado);

        //NOT (Cambia el estado del operador)
        Resultado = ! (Num1 == Num2);
        System.out.println(Resultado);
    }
}
