import java.util.Scanner;
public class uri1015 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();


        double distancia = Math.sqrt(Math.pow(x2 - x1, 2)+ Math.pow(y2 -y1, 2 )); //Math.sqrt =tirar a raiz quadrada e Math.pow é elevar ao quadrado
        System.out.println(String.format("Distancia percorrida é de: %.4f" , distancia));
    }
}
