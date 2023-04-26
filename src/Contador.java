import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String[] strSplit = str.split(" ");
        char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

        for (String palavra : strSplit) {
            for (int i = 0; i <= palavra.length()-1; i++){
                char l = palavra.charAt(i);
                for (char vogal : arrVogais){
                    if (l == vogal){
                        quantVogais++;
                    }
                }
            }
        }
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
        sc.close();
    }
}