package aprendizaje;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int Num1, Num2;
        int Resultado;
        Num1 = 15;
        Num2 = 10;
        
        //SUMA
        Resultado = Num1 + Num2;
        System.out.println("Suma: " + Resultado);

        //RESTA
        Resultado = Num1 - Num2;
        System.out.println("Resta: " + Resultado);
    
        //MULTIPLICACION
        Resultado = Num1 * Num2;
        System.out.println("Multiplcación: " + Resultado);

        //DIVISION
        Resultado = Num1 / Num2;
        System.out.println("División: " + Resultado);

        //RESTO
        Resultado = Num1 % Num2;
        System.out.println("Resto: " + Resultado);
    }
}
