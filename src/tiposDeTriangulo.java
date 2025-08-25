import java.util.Scanner;
public class tiposDeTriangulo {
    public static void main(String[] args) {
        //area declaração de variaveis//

        double a, b,c;
        double aux, a2, bc;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de a");
        a = sc.nextDouble();
        System.out.println("Digite o valor de b");
        b = sc.nextDouble();
        System.out.println("Digite o valor de c");
        c = sc.nextDouble();

        // verificando se {a} é o maior dos elementos//
        if(b > a ){
            aux = b;
            a = b;
            b = aux;
        }
        if(c > a){
            aux = a;
            a =c;
            c = aux;
        }
        a2 = Math.pow(a, 2);
        bc = Math.pow(b, 2) + Math.pow(c ,2 );

        if (a > b + c){
            System.out.println("NÃO FORMA TRIÂNGULO");
        }
        else {
            // pode formar algum triangulo

            if (a2 > bc){
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            else if (a2 < bc){
                System.out.println("TRIANGULO ACUTANGULO");
            }else {
                System.out.println("TRIANGULO RETANGULO");
            }

            // verificar as arestas
            if (a == b && b == c){
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a==b || a==c || b==c) {
                System.out.println("TRIANGULO ISOCELES");
            }
        }
    }
}
