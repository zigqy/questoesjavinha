import java.util.Scanner;
public class uri1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int idadeDia = sc.nextInt();
            int anos = idadeDia / 365;
            idadeDia -= anos * 365;
            int idadeMeses = idadeDia / 30;
            idadeDia -= idadeMeses * 30;
            int dias = idadeDia;
        System.out.println(anos + " ano(s)");
        System.out.println(idadeMeses + " mês(es)");
        System.out.println(idadeDia + " dia(s)");
    }
}
