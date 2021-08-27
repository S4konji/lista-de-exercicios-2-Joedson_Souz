package GITHUB.src;

import java.util.Scanner;

public class Questao01 {

    //1. Determine  as  raízes  de  uma  equação  de  2º  grau:  ax2  +  bx  +  c  =  0  (recordar  que  o discriminante Δ = b2 – 4ac, e que a raiz r = (–b ± √Δ)/2a).
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, c, d, x1, x2;

        System.out.println("Digite o valor de a: ");
        a = scan.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = scan.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = scan.nextDouble();

        d = Math.pow(b, 2) - (4 * a * c);

        if(d < 0){
            System.out.println("A equação não tem raízes.");
        }else if(d == 0){
            x1 = (-b) / (2*a);
            System.out.println("A única raiz da equação é: " + x1);
        }else{
            x1 = (-b + Math.sqrt(d))/(2*a);
            x2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("As raizes da equação serão: " + x1 + " e " +x2);
            scan.close();
        }

    }

}
