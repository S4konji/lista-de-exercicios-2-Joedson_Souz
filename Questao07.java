package GITHUB.src;

/*Considere  os  programas  a  seguir,  que  leem  um  código  repetidamente  e  imprimem  o 
  código lido até que o código lido seja igual a -1. O código -1 não deve ser impresso.  
    a. Qual das duas soluções é a correta? 
        R.: A SOLUÇÃO 1 É A CORRETA;
    b. Como a solução incorreta poderia ser corrigida? 
        R.: PODERIA SE UTILIZAR UMA ESTRUTURA DE DECISÃO COMO O if DENTRO DO LAÇO DE REPETIÇÃO, 
        SE UM VALOR DIFERENTE DE -1 FOR DIGITADO, ELE MOSTRARÁ O CÓDIGO, CASO -1 SEJA DIGITADO, 
        ELE FECHARÁ O PROGRAMA. PODERIA TAMBÉM, SIMPLESMENTE UTILIZAR O LAÇO DE REPETIÇÃO "while".*/


import java.util.Scanner;
public class Questao07 {
    
    public static void main(String[] args) {

        //PROGRAMA A
        /*Scanner teclado = new Scanner(System.in); 
        int codigo; 
         
        System.out.println("Informe o código: "); 
        codigo = teclado.nextInt(); 
        while (codigo != -1) { 
            System.out.println("Código: " + codigo); 
            System.out.println("Informe o código: "); 
            codigo = teclado.nextInt();
        }*/

        //PROGRAMA B
        Scanner teclado = new Scanner(System.in); 
        int codigo;  
        do { 
            System.out.print("Informe o código: "); 
            codigo = teclado.nextInt();
            if(codigo != -1){       //MANEIRA DE CORRIGIR O CÓDIGO
                System.out.println("Código: " + codigo); 
            }
            
        } while (codigo != -1);
        teclado.close();
    }

}
