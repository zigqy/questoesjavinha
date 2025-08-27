import java.util.Scanner;

public class uri1012 {
    public static void main(String[] args) {
        //a - area do triangulo retangulo que tem A por base e C por altura
        //b - area do circulo de raio C - pi== 3,14159
        //c - area do trapézio que tem A e B por bases e C por altura
        //d - area do quadrado que tem lado B
        //e - area do retangulo que tem lados A e B

        //precisa ficar 3 digitos após casa decimal
Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        double b = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        double c = sc.nextDouble();
        double pi = 3.14158;
        double trianguloretangulo = (a * c/ 2);
        double circulo = (pi) * Math.pow(2.0 , c);
        double trapezio = ((a + b) * c)/ 2;
        double quadrado = (b * b);
        double retangulo = (a * b);

        System.out.println(String.format("Área do triangulo retangulo é: %.3f" , trianguloretangulo));
        System.out.println(String.format("Área do circulo é: %.3f " , circulo));
        System.out.println(String.format("Área do trapézio é: %.3f", trapezio));
        System.out.println(String.format("Área do quadrado é: %.3f" , quadrado));
        System.out.println(String.format("Área do retangulo é: %.3f" ,  retangulo));
  }
}
