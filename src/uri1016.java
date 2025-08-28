import java.util.Scanner;
public class uri1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 hr c Y distancia 30km do X
        // Y roda 1 km a cada 2 minutos

        int km = sc.nextInt();

        int minutos = (60 * km) / 30; // Colocar hora vezes a quilometragem e dps dividir por 30

        System.out.println("O tempo para o carro Y tomar a distância é de: " + minutos);






    }
}
