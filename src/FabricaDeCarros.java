import java.util.*;
public class FabricaDeCarros{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print ("Digite o custo de fábrica do carro em R$: ");
        int custoFabrica = scan.nextInt();
        System.out.print ("Digite a porcentagem do distribuidor em %: ");
        int porcentagemDistribuidor = scan.nextInt();
        System.out.print ("Digite o percentual de impostos em %: ");
        int percentualImpostos = scan.nextInt();

        int distribuidor, valorImpostos;
        double custoConsumidor;

        valorImpostos = (custoFabrica * percentualImpostos) / 100;
        distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        custoConsumidor = custoFabrica + distribuidor + valorImpostos;

        System.out.printf("O custo do consumidor será de R$ %.2f", custoConsumidor);
        scan.close();
    }
}