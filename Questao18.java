package GITHUB.src;

public class Questao18 {
    private int n;
    private int a1, a2, a3, a4, a5, a6, a7, a8, a9;
    private int r1, r2, r3, r4, r5, r6, r7;
    private int n1, n2, n3, n4, n5, n6, n7, n8, n9;

    private String centmilhoes[] = {" CEM ", " DUZENTOS ", " TREZENTOS ", " QUATROCENTOS ", " QUINHENTOS ", " SEISCENTOS ", " SETECENTOS ", " OITOCENTOS ", " NOVECENTOS "};
    private String dezmilhoes[] = {" DEZ ", " VINTE ", " TRINTA ", " QUARENTA ", " CINQUENTA ", " SESSENTA ", " SETENTA ", " OITENTA ", " NOVENTA "};
    private String unimilhoes[] = {" UM MILHÕES ", " DOIS MILHÕES ", " TRÊS MILHÕES ", " QUATRO MILHÕES ", " CINCO MILHÕES ", " SEIS MILHÕES ", " SETE MILHÕES ", " OITO MILHÕES ", " NOVE MILHÕES "};
    private String centmilhar[] = {" CEM ", " DUZENTOS ", " TREZENTOS ", " QUATROCENTOS ", " QUINHENTOS ", " SEISCENTOS ", " SETECENTOS ", " OITOCENTOS ", " NOVECENTOS "};
    private String dezmilhar[] = {" DEZ ", " VINTE ", " TRINTA ", " QUARENTA ", " CINQUENTA ", " SESSENTA ", " SETENTA ", " OITENTA ", " NOVENTA "};
    private String unimilhar[] = {" UM MIL ", " DOIS MIL ", " TRÊS MIL ", " QUATRO MIL ", " CINCO MIL ", " SEIS MIL ", " SETE MIL ", " OITO MIL ", " NOVE MIL "};
    private String cent[] = {" CEM ", " DUZENTOS ", " TREZENTOS ", " QUATROCENTOS ", " QUINHENTOS ", " SEISCENTOS ", " SETECENTOS ", " OITOCENTOS ", " NOVECENTOS "};
    private String dez[] = {" DEZ ", " VINTE ", " TRINTA ", " QUARENTA ", " CINQUENTA ", " SESSENTA ", " SETENTA ", " OITENTA ", " NOVENTA "};
    private String uni[] = {" UM ", " DOIS ", " TRÊS ", " QUATRO ", " CINCO ", " SEIS ", " SETE ", " OITO ", " NOVE "};

    String cmilhoes = " ";      //recebe o valor da centena de milhão, por extenso
    String dmilhoes = " ";      //recebe o valor da dezena de milhão, por extenso
    String umilhoes = " ";      //recebe o valor da unidade de milhão, por extenso
    String cmilhar = " ";       //recebe o valor da centena de milhar, por extenso
    String dmilhar = " ";       //recebe o valor da centena de milhar, por extenso
    String umilhar = " ";       //recebe o valor da unidade de milhar, por extenso
    String ce = " ";            //recebe o valor da centena, por extenso
    String de = " ";            //recebe o valor da dezena, por extenso
    String un = " ";            //recebe o valor da unidade, por extenso

    public int getNum(){
        return n;
    }

    public void setNum(int num){
        this.n = num;
    }

    public void decomporNum(){
        this.a1 = this.n / 100000000;
        this.r1 = this.n % 100000000;
        this.a2 = this.r1 / 10000000;
        this.r2 = this.r1 % 10000000;
        this.a3 = this.r2 / 1000000;
        this.r3 = this.r2 % 1000000;
        this.a4 = this.r3 / 100000;
        this.r4 = this.r3 % 100000;
        this.a5 = this.r4 / 10000;
        this.r5 = this.r4 % 10000;
        this.a6 = this.r5 / 1000;
        this.r6 = this.r5 % 1000;
        this.a7 = this.r6 / 100;
        this.r7 = this.r6 % 100;
        this.a8 = this.r7 / 10;
        this.a9 = this.r7 % 10;

        this.n1 = this.a1 * 100000000;
        this.n2 = this.a2 * 10000000;
        this.n3 = this.a3 * 1000000;
        this.n4 = this.a4 * 100000;
        this.n5 = this.a5 * 10000;
        this.n6 = this.a6 * 1000;
        this.n7 = this.a7 * 100;
        this.n8 = this.a8 * 10;
        this.n9 = this.a9;
    }
    

    public void ObtCentMilhoes(){
        this.decomporNum();
        switch (n1) {       
            case 100000000:         //SE A CENTENA DE MILHÃO DO NÚMERO FOR IGUAL A 100 000 000, cmilhoes será igual a cem milhões;
                this.cmilhoes = this.centmilhoes[0];
                break;
            case 200000000:
                this.cmilhoes = this.centmilhoes[1];
                break;
            case 300000000:
                this.cmilhoes = this.centmilhoes[2];
                break;
            case 400000000:
                this.cmilhoes = this.centmilhoes[3];
                break;
            case 500000000:
                this.cmilhoes = this.centmilhoes[4];
                break;
            case 600000000:
                this.cmilhoes = this.centmilhoes[5];
                break;
            case 700000000:
                this.cmilhoes = this.centmilhoes[6];
                break;
            case 800000000:
                this.cmilhoes = this.centmilhoes[7];
                break;
            case 900000000:
                this.cmilhoes = this.centmilhoes[8];
                break;
        }
    }

    public void ObtDezMilhoes(){
        this.decomporNum();
        switch (n2) {       
            case 10000000:          //SE A DEZENA DE MILHÃO DO NÚMERO FOR IGUAL A 10 000 000, dmilhoes será igual a dez milhões;
                this.dmilhoes = this.dezmilhoes[0];
                break;
            case 20000000:
                this.dmilhoes = this.dezmilhoes[1];
                break;
            case 30000000:
                this.dmilhoes = this.dezmilhoes[2];
                break;
            case 40000000:
                this.dmilhoes = this.dezmilhoes[3];
                break;
            case 50000000:
                this.dmilhoes = this.dezmilhoes[4];
                break;
            case 60000000:
                this.dmilhoes = this.dezmilhoes[5];
                break;
            case 70000000:
                this.dmilhoes = this.dezmilhoes[6];
                break;
            case 80000000:
                this.dmilhoes = this.dezmilhoes[7];
                break;
            case 90000000:
                this.dmilhoes = this.dezmilhoes[8];
                break;
        }
    }

    public void ObtUniMilhoes(){
        this.decomporNum();
        switch (n3) {       
            case 1000000:           //SE A UNIDADE DE MILHÃO DO NÚMERO FOR IGUAL A 1 000 000, umilhoes será igual a um milhão;
                this.umilhoes = this.unimilhoes[0];
                break;
            case 2000000:
                this.umilhoes = this.unimilhoes[1];
                break;
            case 3000000:
                this.umilhoes = this.unimilhoes[2];
                break;
            case 4000000:
                this.umilhoes = this.unimilhoes[3];
                break;
            case 5000000:
                this.umilhoes = this.unimilhoes[4];
                break;
            case 6000000:
                this.umilhoes = this.unimilhoes[5];
                break;
            case 7000000:
                this.umilhoes = this.unimilhoes[6];
                break;
            case 8000000:
                this.umilhoes = this.unimilhoes[7];
                break;
            case 9000000:
                this.umilhoes = this.unimilhoes[8];
                break;
        }
    }

    public void ObtCentMilhar(){
        this.decomporNum();
        switch (n4) {       
            case 100000:            //SE A CENTENA DE MILHAR DO NÚMERO FOR IGUAL A 100 000, cmilhar será igual a cem mil;
                this.cmilhar = this.centmilhar[0];
                break;
            case 200000:
                this.cmilhar = this.centmilhar[1];
                break;
            case 300000:
                this.cmilhar = this.centmilhar[2];
                break;
            case 400000:
                this.cmilhar = this.centmilhar[3];
                break;
            case 500000:
                this.cmilhar = this.centmilhar[4];
                break;
            case 600000:
                this.cmilhar = this.centmilhar[5];
                break;
            case 700000:
                this.cmilhar = this.centmilhar[6];
                break;
            case 800000:
                this.cmilhar = this.centmilhar[7];
                break;
            case 900000:
                this.cmilhar = this.centmilhar[8];
                break;
        }
    }

    public void ObtDezMilhar(){
        this.decomporNum();
        switch (n5) {       
            case 10000:             //SE A DEZENA DE MILHAR DO NÚMERO FOR IGUAL A 10 000, dmilhar será igual a dez mil;
                this.dmilhar = this.dezmilhar[0];
                break;
            case 20000:
                this.dmilhar = this.dezmilhar[1];
                break;
            case 30000:
                this.dmilhar = this.dezmilhar[2];
                break;
            case 40000:
                this.dmilhar = this.dezmilhar[3];
                break;
            case 50000:
                this.dmilhar = this.dezmilhar[4];
                break;
            case 60000:
                this.dmilhar = this.dezmilhar[5];
                break;
            case 70000:
                this.dmilhar = this.dezmilhar[6];
                break;
            case 80000:
                this.dmilhar = this.dezmilhar[7];
                break;
            case 90000:
                this.dmilhar = this.dezmilhar[8];
                break;
        }
    }

    public void ObtUniMilhar(){
        this.decomporNum();
        switch (n6) {       
            case 1000:              //SE A UNIDADE DE MILHAR DO NÚMERO FOR IGUAL A 1 000, umilhar será igual a um mil;
                this.umilhar = this.unimilhar[0];
                break;
            case 2000:
                this.umilhar = this.unimilhar[1];
                break;
            case 3000:
                this.umilhar = this.unimilhar[2];
                break;
            case 4000:
                this.umilhar = this.unimilhar[3];
                break;
            case 5000:
                this.umilhar = this.unimilhar[4];
                break;
            case 6000:
                this.umilhar = this.unimilhar[5];
                break;
            case 7000:
                this.umilhar = this.unimilhar[6];
                break;
            case 8000:
                this.umilhar = this.unimilhar[7];
                break;
            case 9000:
                this.umilhar = this.unimilhar[8];
                break;
        }
    }

    public void ObtCent(){
        this.decomporNum();
        switch (n7) {       
            case 100:           //SE A CENTENA DO NÚMERO FOR IGUAL A 100, ce será igual a cem;
                this.ce = this.cent[0];
                break;
            case 200:
                this.ce = this.cent[1];
                break;
            case 300:
                this.ce = this.cent[2];
                break;
            case 400:
                this.ce = this.cent[3];
                break;
            case 500:
                this.ce = this.cent[4];
                break;
            case 600:
                this.ce = this.cent[5];
                break;
            case 700:
                this.ce = this.cent[6];
                break;
            case 800:
                this.ce = this.cent[7];
                break;
            case 900:
                this.ce = this.cent[8];
                break;
        }
    }

    public void ObtDez(){
        this.decomporNum();
        switch (n8) {       
            case 10:            //SE A DEZENA DO NÚMERO FOR IGUAL A 10, de será igual a dez;
                this.de = this.dez[0];
                break;
            case 20:
                this.de = this.dez[1];
                break;
            case 30:
                this.de = this.dez[2];
                break;
            case 40:
                this.de = this.dez[3];
                break;
            case 50:
                this.de = this.dez[4];
                break;
            case 60:
                this.de = this.dez[5];
                break;
            case 70:
                this.de = this.dez[6];
                break;
            case 80:
                this.de = this.dez[7];
                break;
            case 90:
                this.de = this.dez[8];
                break;
        }
    }

    public void ObtUni(){
        this.decomporNum();
        switch (n9) {       
            case 1:             //SE A UNIDADE DO NÚMERO FOR IGUAL A 1, un será igual a 1;
                this.un = this.uni[0];
                break;
            case 2:
                this.un = this.uni[1];
                break;
            case 3:
                this.un = this.uni[2];
                break;
            case 4:
                this.un = this.uni[3];
                break;
            case 5:
                this.un = this.uni[4];
                break;
            case 6:
                this.un = this.uni[5];
                break;
            case 7:
                this.un = this.uni[6];
                break;
            case 8:
                this.un = this.uni[7];
                break;
            case 9:
                this.un = this.uni[8];
                break;
        }
    }

    public void MosExt(){
        this.ObtCentMilhoes();
        this.ObtDezMilhoes();
        this.ObtUniMilhoes();
        this.ObtCentMilhar();
        this.ObtDezMilhar();
        this.ObtUniMilhar();
        this.ObtCent();
        this.ObtDez();
        this.ObtUni();
        System.out.println(this.cmilhoes + "" + this.dmilhoes + "" + this.umilhoes + "" + this.cmilhar + "" + this.dmilhar + "" + this.umilhar + "" + this.ce + "" + this.de + "" + this.un);
    }

}