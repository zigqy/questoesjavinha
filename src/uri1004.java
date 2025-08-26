import  java.util.Scanner;

public class uri1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        int a = sc.nextInt();
        System.out.println("Digite o valor de B");
        int b = sc.nextInt();

        int produto = a * b;
        System.out.println("O valor do produto é: " + produto);
    }
}
