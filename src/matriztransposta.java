import java.util.Random;
public class matriztransposta {

    static int[][] criacaoMatriz(int N, int M) {
        int[][] matriz = new int[N][M];
        Random gerador = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = gerador.nextInt(100);
            }
        }
        return matriz;
    }

    static void imprimeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t"); //tabulação = "\t"
            }
            System.out.println("\n");
        }
    }
    static int [][] transposta(int [][] matriz){
        int[][] MTransposta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < MTransposta.length; i++) {
            for (int j = 0; j < MTransposta[0].length; j++) {
                MTransposta[i][j] = matriz[j][i];
            }
        }
        return MTransposta;
    }

    public static void main(String[] args) {
        int[][] matriz = criacaoMatriz(3, 4);
        imprimeMatriz(matriz);

        System.out.println();
        int[][] transposta = transposta(matriz);
            imprimeMatriz(transposta);
    }
}