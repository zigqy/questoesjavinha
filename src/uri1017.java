import java.util.Scanner;
public class uri1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //12 km/l

        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();
        int distancia = velocidade * tempo;

        double media = distancia / 12; // peguei a distancia e dividi por 12, pq o veículo faz 12km/L
        System.out.println(String.format("A quantidade de litros necessárias para fazer a viagem é de: %.3f" , media));
//quantidade de litros para fz uma viagem
        // KM POR LITRO

    }
}
