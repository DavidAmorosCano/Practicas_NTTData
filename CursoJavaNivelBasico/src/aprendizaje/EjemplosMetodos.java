package aprendizaje;

public class EjemplosMetodos {

    static void Mensaje(String cTexto,String cNombre){
        System.out.println(cTexto);
        System.out.println(cNombre);
    
    }

    static int Sumar(int Valor1, int Valor2){
        return Valor1+Valor2;
    }
    public static void main(String[] args) {
        Mensaje("Este es mi primer método en java", "Mi nombre es David");
        System.out.println(Sumar(5, 8));
    }
}
