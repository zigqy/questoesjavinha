import java.sql.SQLOutput;
import java.util.Scanner;

public class uri1001 {
    public static void main(String[] args) {
        /*

 QUESTÃO
 Leia 2 valores inteiros e armazene-os nas variáveis A e B.
 Efetue a soma de A e B atribuindo o seu resultado na variável X.
 Imprima X conforme exemplo apresentado abaixo. Não apresente
 mensagem alguma além daquilo que está sendo especificado.

 ENTRADA
 A entrada contém 2 valores inteiros.

 SAÍDA
 Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor
 da variável X e pelo final de linha. Cuide para que tenha um espaço
 antes e depois do sinal de igualdade, conforme o exemplo abaixo.

*/
Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor de A");
int a = sc.nextInt();
        System.out.println("Insira o valor de B");
int b = sc.nextInt();
        int c = a + b;
        System.out.println("O valor é: " + c);
    }
}
