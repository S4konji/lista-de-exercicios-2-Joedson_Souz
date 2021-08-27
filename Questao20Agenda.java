package GITHUB.src;

public class Questao20Agenda {
    Questao20Contato c1 = new Questao20Contato();
    public void setContato(String nome, String numero, int cod){
        c1.setNome(nome);
        c1.setNum(numero);
        c1.setCod(cod);
    }

    public void status(){
        System.out.println("");
        System.out.println("Dados do contato:");
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Número: " + c1.getNum());
        System.out.println("Código: " + c1.getCod());
        System.out.println("");
    }
}
