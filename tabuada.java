 import java.util.Scanner;
 public class tabuada {
    public static void main(String[] args) {
      int j;
      Scanner leitorScanner = new Scanner(System.in);
      System.out.println("Qual tabuada você precisa?");
      j = leitorScanner.nextInt();
      for (int i = 1; i <= 10; i++){
          int r = j * i;
          String stringf = String.format("%d x %d = %d", j , i , r);
          System.out.println(stringf);
      }
      leitorScanner.close();
    }
}

