//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        int[] tickets = {3, 7214, 10, 1001};

        entrada(tickets);

    }

    public static void entrada(int[] tickets){
        // Recorre el array de entradas y por ada una llama a calculo
        for(int i = 0; i < tickets.length; i++){
            System.out.println(tickets[i]);
            int valor = tickets[i];
            calculo(new int[]{valor});

        }
    }
    public static void calculo(int[] ticket){
        // Recorre el número recibido

        for(int i = 0; i < ticket.length; i++) {
            System.out.println(ticket[i]);
        }
    }
}
