package aprendizaje;

public class OperadoresComparacion {
    public static void main(String[] args) {
        int Num1, Num2;
        boolean Resultado;

        Num1 = 120;
        Num2 = 50;

        //IGUAL
        Resultado = Num1 == Num2;
        System.out.println(Resultado);

        //DISTINTO
        Resultado = Num1 != Num2;
        System.out.println(Resultado);

        //MAYOR QUE 
        Resultado = Num1 > Num2;
        System.out.println(Resultado);

        //MENOR QUE
        Resultado = Num1 < Num2;
        System.out.println(Resultado);
    }
}
