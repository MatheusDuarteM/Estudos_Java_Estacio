      import java.util.Random;//extensão para gerar numeros aleatorios
      public class Aluno{//Classe
      //Atributos
      private String nome;
      private int idade;
      private double codigo_identificador;
      private Random aleatorio;
      //Construtor
      public Aluno(String nome, int idade){
           aleatorio = new Random();//instancia da classe Random
           this.nome = nome;//atributo recebe o valor do parametro
           this.idade = idade;//atributo recebe o valor do parametro
           this.codigo_identificador = aleatorio.nextDouble();//atributo recebe um valor aleatorio
      }
      //Métodos
      public void definirNome(String nome){//metodo
           this.nome = nome;//atributo recebe o valor do parametro
      }  
      public void definirIdade( int idade){//metodo
           this.idade = idade;//atributo recebe o valor do parametro
      }
    }