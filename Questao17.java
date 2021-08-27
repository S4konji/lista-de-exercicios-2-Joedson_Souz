package GITHUB.src;

public class Questao17 {

    /*17. Leia  um  número  decimal  (até  3  dígitos)  e  escreva  o  seu  equivalente  em  numeração 
    romana.  Utilize  métodos  para  obter  cada  dígito  do  número  decimal  e  para  a 
    transformação de numeração decimal para romana (Dica1: 1 = I, 5 = V, 10 = X, 50 = L, 100 = 
    C, 500 = D, 1.000 = M; Dica2: utilize um vetor guardando a tradução para cada um dos 
    dígitos). */

    private int n, n1, n2, n3;
    private int a1, a2, a3;
    private int r1;
    String dr = " ";     //recebe o valor da dezena em n romano
    String ur = " ";     //recebe o valor da unidade em n romano
    String cr = " ";     //recebe o valor da centena em n romano


    public int getNum(){
        return n;
    }

    public void setNum(int num){
        this.n = num;
    }


    //OBTER O VALOR DA UNIDADE EM NÚMEROS ROMANOS
    public void ObtUni(){
        a1 = n/100;     //OBTIVE A CASA DA CENTENA DO NÚMERO
        r1 = n % 100;   //RESTO DA DIVISÃO NECESSÁRIO PARA O PRÓXIMO ALGARISMO
        a2 = r1 / 10;   //OBTIVE A CASA DA DEZENA DO NÚMERO
        a3 = r1 % 10;   //OBTIVE A CASA DA UNIDADE DO NÚMERO

        //DECOMPOSIÇÃO DO NÚMERO//
                        //EXEMPLO: N 123
        n1 = a1 * 100;  //OBTIVE 100
        n2 = a2 * 10;   //OBTIVE 20
        n3 = a3;        //OBTIVE 3

        String [] uni;
        uni = new String[9];
        uni[0] = "I";       //1
        uni[1] = "II";      //2
        uni[2] = "III";     //3
        uni[3] = "IV";      //4
        uni[4] = "V";       //5
        uni[5] = "VI";      //6
        uni[6] = "VII";     //7
        uni[7] = "VIII";    //8
        uni[8] = "IX";      //9

        switch (n3) {
            case 1:
                ur = uni[0];
                break;
            case 2:
                ur = uni[1];
                break;
            case 3:
                ur = uni[2];
                break;
            case 4:
                ur = uni[3];
                break;
            case 5:
                ur = uni[4];
                break;
            case 6:
                ur = uni[5];
                break;
            case 7:
                ur = uni[6];
                break;
            case 8:
                ur = uni[7];
                break;
            case 9:
                ur = uni[8];
                break;
        }
        //System.out.println(this.ur);
    }


    //OBTER O VALOR DA DEZENA EM NÚMEROS ROMANOS//
    public void ObtDez(){
        r1 = n % 100;
        a2 = r1 / 10;   //OBTIVE A CASA DA DEZENA DO NÚMERO
        n2 = a2 * 10;   //OBTIVE 20

        //
        String [] dez;
        dez = new String[9];
        dez[0] = "X";       //10
        dez[1] = "XX";      //20
        dez[2] = "XXX";     //30
        dez[3] = "XL";      //40
        dez[4] = "L";       //50
        dez[5] = "LX";      //60
        dez[6] = "LXX";     //70
        dez[7] = "LXXX";    //80
        dez[8] = "XC";      //90


        switch (n2) {
            case 10:
                dr = dez[0];
                break;
            case 20:
                dr = dez[1];
                break;
            case 30:
                dr = dez[2];
                break;
            case 40:
                dr = dez[3];
                break;
            case 50:
                dr = dez[4];
                break;
            case 60:
                dr = dez[5];
                break;
            case 70:
                dr = dez[6];
                break;
            case 80:
                dr = dez[7];
                break;
            case 90:
                dr = dez[8];
                break;
        }
        //System.out.println(dr + "" + ur);
    }


    //OBTER O VALOR DA CENTENA EM NÚMEROS ROMANOS//
    public void ObtCent(){
        a1 = n/100;     //OBTIVE A CASA DA CENTENA DO NÚMERO
        n1 = a1 * 100;  //OBTIVE 100 CASO a1 SEJA IGUAL A 1

        String [] cent;         //VETOR cent
        cent = new String[9];   //VETOR DE 9 POSIÇÕES
        cent[0] = "C";      //100
        cent[1] = "CC";     //200
        cent[2] = "CCC";    //300
        cent[3] = "CD";     //400
        cent[4] = "C";      //500
        cent[5] = "DC";     //600
        cent[6] = "DCC";    //700
        cent[7] = "DCCC";   //800
        cent[8] = "CM";     //900

        //OBTER CENTENAS EM N ROMANO:

        switch (n1) {       
            case 100:        //SE A CENTENA DO NÚMERO FOR IGUAL A 100, cr será igual a C
                cr = cent[0];
                break;
            case 200:
                cr = cent[1];
                break;
            case 300:
                cr = cent[2];
                break;
            case 400:
                cr = cent[3];
                break;
            case 500:
                cr = cent[4];
                break;
            case 600:
                cr = cent[5];
                break;
            case 700:
                cr = cent[6];
                break;
            case 800:
                cr = cent[7];
                break;
            case 900:
                cr = cent[8];
                break;
        }
        //System.out.println(cr + "" + dr + "" + ur);
    }

    public void mosRom(){
        if(getNum() < 10){
            this.ObtUni();
            System.out.println(ur);
        }else if(getNum() >= 10 && getNum() < 100){
            this.ObtUni();
            this.ObtDez();
            System.out.println(dr + "" + ur);
        }else{
            this.ObtUni();
            this.ObtDez();
            this.ObtCent();
            System.out.println(cr + "" + dr + "" + ur);
        }
    }

}
