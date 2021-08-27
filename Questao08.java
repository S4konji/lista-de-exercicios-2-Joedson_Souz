package GITHUB.src;

import java.util.Scanner;

public class Questao08 {
    
    /*8. Calcule a série de Fibonacci para um número inteiro não negativo informado pelo usuário. 
    A  série  de  Fibonacci  inicia  com  os  números  F0  =  0  e  F1  =  1,  e  cada  número  posterior 
    equivale à soma dos dois números anteriores (Fn = Fn-1 + Fn-2). Por exemplo, caso o usuário 
    informe o número 9, o resultado seria: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34. */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, F0 = 0, F1 = 1, Fn = 0;

        System.out.printf("Digite um número não negativo: ");
        n = scan.nextInt();
        
        if(n < 0){
            System.out.println("ERRO! Número Inválido!");
        }else{
            System.out.printf("0, 1, ");
            for(int i = 1; i < n; i++){
                Fn = F1 + F0;
                if (i == n-1) {
                    System.out.printf("%d", Fn);
                }else{
                    System.out.printf("%d, ", Fn);
                }
                F0 = F1;
                F1 = Fn;
            }
        }
        scan.close();

    }

}
