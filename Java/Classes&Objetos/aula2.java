public class Aluno {
    private String nome; //atributo
    public void inserirNome(String nn) {//metodo
        nome = nn;//atributo recebe o valor do parametro
        //atributado nome recebe o valor de nn
    }
    public String recuperarNome() {//metodo
        return nome;//retorna o valor do atributo
    }
    public static void main(String args[]){//metodo main
        //criando um objeto da classe Aluno de nome a
        Aluno a = new Aluno(); //instancia da classe
        //chamada do metodo inserirNome
        a.inserirNome ("Pessoa");//chamada do metodo
        //atribuindo o valor "Pessoa" ao atributo nome
        System.out.println("saida: "+a.recuperarNome());//chamada do metodo
    }
}
//classe abstrata
@Deprecated @SuppressWarnings ("deprecation") public abstract strictfp class Aluno extends Pai implements Idealizacao, Sonho {
    private String nome;//atributo
    public void inserirNome(String nn){//metodo
        nome = nn;
    }
    public String recuperarNome(){//metodo
       return nome;
    }
    ...//outros métodos ocultados por simplicidade    
}