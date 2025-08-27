import java.util.Scanner;



public class uri1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = sc.next();
        System.out.println("Salário Fixo: ");
        double salarioFixo = sc.nextDouble();
        System.out.println("Total de vendas em dinheiro: ");
        double  totalVendasemDinheiro = sc.nextDouble();
        // vendedor ganha 15% de comissão
        // informar quanto recebe por mes com 2 casas decimais dps da virgula


        double total = ((totalVendasemDinheiro * 15) / 100) + salarioFixo;

        System.out.printf("O total recebido será de: %.2f", total); //quando for souf = ao invés de colocar + coloque ","


    }
}
