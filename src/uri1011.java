import java.util.Scanner;
public class uri1011 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
// calcular vol da esfera == 3/4 * pi * r3
        // pi = 3,14159

        double pi = 3.14159;
        System.out.println("Qual valor do raio? ");
        double raio = sc.nextDouble();

        double calculo = (4.0 / 3) * pi * (raio * raio * raio);
        System.out.printf("O volume da esfera é: %.2f" , calculo);

    }
}
