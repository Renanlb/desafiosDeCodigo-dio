import java.util.*;

public class QuitandaDoSeuZe {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

        int soma = morangos + macas;
        double valorTotal;

        if (morangos <= 5 && macas <=5){
            valorTotal = morangos*2.5 + macas*1.8;
        } else {
            valorTotal = morangos*2.2 + macas*1.5;
        }

        if (valorTotal > 25.00 || soma > 8){
            valorTotal -= valorTotal*0.10;
        }
        System.out.println(valorTotal);
        input.close();
    }
}