package GITHUB.src;

public class Questao16 {

    /*16. Leia do usuário o tempo em segundos e escreva em horas, minutos e segundos. Utilize 
    cinco  métodos,  para  a  leitura  e  escrita  de  dados  e  para  obtenção  de  horas,  minutos  e 
    segundos a partir do tempo em segundos. */
    
    private int h;
    private int m;
    private int s;

    public void setTempo(int s){
        this.h = s / 3600;
        int r = s % 3600;
        this.m = r / 60;
        r = r % 60;
        this.s = r;
    }

    public int getHoras(){
        return this.h;
    }
    
    public int getMinutos(){
        return this.m;
    }

    public int getSegundos(){
        return this.s;
    }

    public void status(){
        System.out.println("Horas: " +getHoras());
        System.out.println("Minutos: " +getMinutos());
        System.out.println("Segundos: " +getSegundos());
        System.out.println(getHoras() + ":" + getMinutos() + ":" + getSegundos());
    }


}
