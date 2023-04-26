import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class PositivoseMedias {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        int cont = 0;
        double media = 0.0, entrada = 0.0, soma = 0.0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Digite um valor: ");
            entrada = scan.nextDouble();
            if (entrada > 0.0){
                cont++;
                soma += entrada;
            }
        }
        media = soma/cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("Média = %.1f", media));

        scan.close();
    }
}