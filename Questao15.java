package GITHUB.src;

public class Questao15 {

    /*15. Faça um método que calcule a média de um aluno de acordo com o critério definido neste 
    curso. Além disso, faça um outro método que informe o status do aluno de acordo com a 
    tabela a seguir: 
        Nota acima de 6 -> “Aprovado” 
        Nota entre 4 e 6 -> Conceito “Verificação Suplementar” 
        Nota abaixo de 4 ->  Conceito “Reprovado”*/

    private float media;

//MÉTODOS PERSONALIZADO
    public void media(float n1, float n2, int n3){
        float m;
        m = (n1 + n2 + n3) / 3;
        System.out.println("A media do aluno é: " + m);
        this.media = m;
    }


    public void status(){
        if(this.media > 6){
            System.out.println("Aprovado");
        }else if(this.media >= 4 && this.media <= 6){
            System.out.println("Verificação Suplementar");
        }else{
            System.out.println("Reprovado");
        }
    }
}  