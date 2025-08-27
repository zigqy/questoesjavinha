import java.util.Scanner;
public class uri1014 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //calcular consumo médio de um automovel sendo fornecido distancia total em km e o total gasto em L de combustivel

        System.out.println("Distancia percorrida em KM: ");
        double distancia = sc.nextDouble();
        System.out.println("Combustível gasto em L: ");
        double combustivelgasto= sc.nextDouble();
        double consumo = combustivelgasto / distancia;


        System.out.println(String.format("O consumo médio é de %.3f:" , consumo));
    }
}
