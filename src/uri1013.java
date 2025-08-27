import java.util.Scanner;
public class uri1013 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor 1:");
        int valor1 = sc.nextInt();
        System.out.println("Digite o valor 2:");
        int valor2 = sc.nextInt();
        System.out.println("Digite o valor 3:");
        int valor3 = sc.nextInt();

        if (valor1 > valor2 && valor1 > valor3){
            System.out.println("Valor 1 é o maior!");
        }else if (valor2 > valor3){
            System.out.println("Valor 2 é o maior!");
        }else{
            System.out.println("Valor 3 é o maior!");
        }


    }
}
