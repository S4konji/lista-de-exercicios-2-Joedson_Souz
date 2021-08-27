package GITHUB.src;

import java.util.Scanner;

public class Questao04 {

    /*4. Para  cada  produto  informado  (nome,  preço  e  quantidade),  escreva  o  nome  do  produto 
    comprado  e  o  valor  total  a  ser  pago,  considerando  que  são  oferecidos  descontos  pelo 
    número de unidades compradas, segundo a tabela abaixo:  
    a. Até 10 unidades: valor total 
    b. de 11 a 20 unidades: 10% de desconto 
    c. de 21 a 50 unidades: 20% de desconto 
    d. acima de 50 unidades: 25% de desconto*/
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n;
        float p;
        double v;
        int q;

        System.out.printf("Nome: ");
        n = scan.nextLine();
        System.out.printf("Preço: ");
        p = scan.nextFloat();
        System.out.println("Quantidade: ");
        q = scan.nextInt();

        if(q <= 10){
            v = p * q;
            System.out.println("Nome: " + n + "\nValor: R$: " + v);
        }else if(q > 10 && q <= 20){
            v = (p * q) * 0.9;
            System.out.println("Nome: " + n + "\nValor: R$: " + v);
        }else if(q > 20 && q <= 50){
            v = (p * q) * 0.8;
            System.out.println("Nome: " + n + "\nValor: R$: " + v);
        }else{
            v = (p * q) * 0.75;
            System.out.println("Nome: " + n + "\nValor: R$: " + v);
        }
        scan.close();

    }

}
