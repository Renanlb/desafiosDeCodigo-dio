import java.util.Scanner;

public class SomaDeHComNTermos {

    public static void main(String[] Args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double somaTermos = 0;

        for (int i = 1; i <= n; i++) {
            h = 1.0/i;
            somaTermos = somaTermos + h;
        }
        System.out.println(Math.round(somaTermos));
    }
}