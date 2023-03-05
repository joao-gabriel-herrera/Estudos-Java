import java.util.Scanner;
public class verificarValor {
    public static void main(String[] args) {
      int numero;
      Scanner leitorScanner = new Scanner(System.in);
      System.out.println("Digite um valor:");
      numero = leitorScanner.nextInt();
      if (numero >= 100 && numero <= 200){
          System.out.println("Número dentro do intervalo.");
      } else {
          System.out.println("Número fora do intervalo");
      }
      leitorScanner.close();
    }
}
