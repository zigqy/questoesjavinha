import java.util.Locale;
import java.util.Scanner;
public class uri1008 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Código do funcionário");
        int numb = sc.nextInt();
        System.out.println("Informe a quantidade de horas trabalhadas");
        int htrab = sc.nextInt();
        System.out.println("Informe o valor recebido por hora");
        double valorphora = sc.nextDouble();

        System.out.println("O funcionário com o código " + numb);
        double salario = htrab * valorphora;
        System.out.printf("Ficará com o salário é de $: %.2fn" , salario);

    }
}
