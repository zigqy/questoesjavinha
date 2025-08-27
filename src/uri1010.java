import java.util.Scanner;
import java.util.Locale;

public class uri1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Código peça 1: ");
    int codigo = sc.nextInt();
        System.out.println("Número de peças 1 : ");
    int numbPecas = sc.nextInt();
        System.out.println("Valor unitário de cada peça 1: ");
        double valorPecas = sc.nextDouble();

        System.out.println("Código peça 2 ");
        int cod2 = sc.nextInt();
        System.out.println("Número de peças 2: ");
        int numbpecas2= sc.nextInt();
        System.out.println("Valor unitário de cada peça 2: ");
        double valorPecas2 = sc.nextDouble();

        double total = (numbPecas * valorPecas) + (numbpecas2 * valorPecas2);
        System.out.printf("O valor total será de: %.2f" , total);

    }
}
