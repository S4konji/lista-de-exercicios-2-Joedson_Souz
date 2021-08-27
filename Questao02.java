package GITHUB.src;

import java.util.Scanner;

public class Questao02 {

    //2. Calcule a distância entre dois pontos num espaço de 3 dimensões.
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d, Xa, Ya, Za, Xb, Yb, Zb;

        System.out.println("Digite as coordenadas do Ponto A: ");
        System.out.println("Xa: ");
        Xa = scan.nextDouble();
        System.out.println("Ya: ");
        Ya = scan.nextDouble();
        System.out.println("Za: ");
        Za = scan.nextDouble();

        System.out.println("Digite as coordenadas do Ponto B: ");
        System.out.println("Xb: ");
        Xb = scan.nextDouble();
        System.out.println("Yb: ");
        Yb = scan.nextDouble();
        System.out.println("Zb: ");
        Zb = scan.nextDouble();

        d = Math.sqrt(Math.pow((Xb - Xa), 2) + Math.pow((Yb - Ya), 2) + Math.pow((Zb - Za), 2));   //raiz quadrada de ((Xb - Xa)**2 + (Yb - Ya)**2 + (Zb - Za)**2)
        System.out.printf("A distância entre os pontos é: %f", d);
        scan.close();
    }

}
