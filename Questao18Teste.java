package GITHUB.src;
import java.util.Scanner;

public class Questao18Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        String res = "";

        do{
            System.out.printf("Número que será convertido: ");
            num = scan.nextInt();
            scan.nextLine();
            Questao18 t = new Questao18();

            t.setNum(num);
            t.MosExt();

            System.out.printf("\nDeseja converter mais um número? (S/N) ");
            res = scan.nextLine();
            System.out.println("");
            System.out.println("");

        }while((res.equals("S")) || (res.equals("s")));
        scan.close();
    }
}
