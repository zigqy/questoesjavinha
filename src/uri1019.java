import java.util.Scanner;

public class uri1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

int duracaoSeg = sc.nextInt();
int horas = duracaoSeg * 3600; //3600 seg = 1 hora
        duracaoSeg -= horas * 3600;
        int minutos = duracaoSeg / 60;
        duracaoSeg -= minutos * 60;
        int segundos = duracaoSeg;
        System.out.println(horas + ";" + minutos + ";" + segundos);


    }
}
