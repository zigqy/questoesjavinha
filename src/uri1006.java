import java.util.Scanner;
public class uri1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // QUESTÃO
        // Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de
        // um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem
        // peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada
        // nota pode ir de 0 até 10.0, sempre com uma casa decimal.

        System.out.println("Valor de A");
        double a = sc.nextDouble();
        System.out.println("Valor de B");
        double b =sc.nextDouble();
        System.out.println("Valor de C");
        double c =sc.nextDouble();

        double media = ((a * 2) + (b * 3) + (c * 5) / 10);
        System.out.println("A média do aluno é: " + media);
    }
}
