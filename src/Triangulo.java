import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Triangulo { //Teste

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        //double maior;
        double perimetro = A+B+C;
        boolean triangulo = true;
        double area = ((A+B)*C)/2;;

        if (A >= B+C || B >= A+C || C >= A+B ){
            triangulo = false;
        }
        if (triangulo == false) {
            System.out.printf("Area = %.1f", area);
        } else {
            System.out.printf("Perimetro = %.1f", perimetro);
        }

        leitor.close();
    }

}