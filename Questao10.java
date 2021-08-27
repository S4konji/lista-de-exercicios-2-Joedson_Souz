package GITHUB.src;

import java.util.Scanner;

public class Questao10 {

    /*10. Calcule o retorno de um investimento financeiro fazendo as contas mês a mês, sem usar a 
    fórmula  de  juros  compostos.  O  usuário  deve  informar  quanto  será  investido  por  mês  e 
    qual será a taxa de juros mensal. O programa deve informar o saldo do investimento após 
    um ano (soma das aplicações mês a mês considerando os juros compostos), e perguntar ao 
    usuário  se  ele  deseja  que  seja  calculado  o  ano  seguinte,  sucessivamente.  Por  exemplo, 
    caso o usuário deseje investir R$ 100,00 por mês, e tenha uma taxa de juros de 1% ao mês, 
    o programa forneceria a seguinte saída: */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String r = "";
        float C;
        double M = 0, s = 0;
        int i;


        System.out.print("Valor a ser investido: ");
        C = scan.nextFloat();
        System.out.print("Taxa de juros mensal: ");
        i = scan.nextInt();
        s = C;

        do{
            for(int a = 1; a <= 12; a++){
                s = s + ((s * i) / 100);
                M = M + s;
            }
            System.out.println("Saldo do investimento após 1 ano: " + M);
            System.out.println("Deseja processar mais um ano? (S/N)");
            r = scan.next();
            s = M;
        }while((r.equals("S")) || (r.equals("s")));
        scan.close();
    }
}