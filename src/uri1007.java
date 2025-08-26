import java.util.Scanner;
public class uri1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor de A");
    int a = sc.nextInt();
        System.out.println("Valor de B");
    int b = sc.nextInt();
        System.out.println("Valor de C");
    int c = sc.nextInt();
        System.out.println("Valor de D");
    int d =sc.nextInt();
    int diferenca = (a * b - c * d);
        System.out.println("Essa é a diferença dos valores: " + diferenca);
    }
}
