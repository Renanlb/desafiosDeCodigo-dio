import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ImpostoDeRenda {//DIO
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        double renda = leitor.nextDouble();
        double valorIR1 = (renda-2000.00)*0.08;
        double valorIR2 = 1000*0.08 + (renda - 3000.00)*0.18;
        double valorIR3 = 1000*0.08 + 1500*0.18 + (renda - 4500.00)*0.28;

        NumberFormat formatado = NumberFormat.getInstance();
        formatado.setMaximumFractionDigits(2);
        String numeroFormatado = formatado.format(renda);

        if (renda <= 2000.00){
            System.out.println("Isento");
        } else if (renda >= 2000.01 && renda <= 3000.00) {
            System.out.printf("R$ %.2f", valorIR1);
        } else if (renda >= 3000.01 && renda <= 4500.00) {
            System.out.printf("R$ %.2f", valorIR2);
        } else if (renda > 4500.00) {
            System.out.printf("R$ %.2f", valorIR3);
        }
        leitor.close();
    }
}