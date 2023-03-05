import java.util.Scanner;
public class laçoCondicional {
    public static void main(String[] args) {
        Scanner leitorScanner = new Scanner(System.in);

        char continuar = 'S';
        while (continuar == 'S' || continuar == 's') {

            System.out.println("Insira um valor:");
            int j = leitorScanner.nextInt();
            if (j == 0) {
                System.out.println("Você inseriu 0!");
            } else {
                if (j < 0) {
                    System.out.println("Você inseriu um número negativo!");
                } else {
                    System.out.println("Você inseriu um número positivo");
                }

            }
            System.out.println("Deseja continjuar(S/N)?");
            continuar = leitorScanner.next().charAt(0);
        }
        leitorScanner.close();
}
}