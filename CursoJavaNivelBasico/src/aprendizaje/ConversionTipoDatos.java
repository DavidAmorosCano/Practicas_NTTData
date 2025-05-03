package aprendizaje;

public class ConversionTipoDatos {
    public static void main(String[] args) {
        
        //PARTE 1
        System.out.println(120+16);
        System.out.println("120"+"16");
        
        //tipodato.parsetipodato(contenido)
        System.out.println(Integer.parseInt("120")+Integer.parseInt("16"));
        
        //PARTE 2
        int NumeroEntero = 15;
        Integer NumeroEntero2 = 15;
        
        double NumreoDouble = 15.0d;
        Double NumreoDouble2 = 15.0d;

        boolean Verdad = true;
        Boolean Verdad2 = false;

        //PARTE 3
        String Numero = "90";
        byte bNumero =  Byte.parseByte(Numero);
        System.out.println(bNumero);

        int iNumero = Integer.parseInt(Numero);
        System.out.println(iNumero);

        float fNumero = Float.parseFloat(Numero);
        System.out.println(fNumero);

        double dNumero = Double.parseDouble(Numero);
        System.out.println(dNumero);

        //PARTE 4
        String cTexto = "Contenido del texto: ";
        byte bNumero2 = 10;
        int iNumero2 = 120;
        float fNumero2 = 15f;
        double dNumero2 = 16d;
        char Cadena = 'a';
        boolean Verdad3 = true;
    
        cTexto+=bNumero2; //podemos añadirele cualquier variable anterior
        System.out.println(cTexto);
    }
}
