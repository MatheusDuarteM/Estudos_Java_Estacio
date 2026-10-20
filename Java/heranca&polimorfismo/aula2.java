//default: define a visibilidade como restrita ao pacote do java

//privado: a visibilidade dos atributos e metodos fica restrita á classe

//protegido: a visibilidade é restrita ao pacote e a todas as subclasses.

//publico: não há restrição de visibilidade

import java.util.Scanner;//extensão para entrada de dados

class MyClass {
    public static void main(String args[]) {
        //1° criei a instancia entrada para receber os dados do usuario
        //2° criei a variavel nome para receber o valor digitado pelo usuario
        //3° criei a variavel idade para receber o valor digitado pelo usuario
        //4° criei a instancia a da classe Aluno para receber os valores digitados pelo usuario para nome e idade
        Scanner entrada = new Scanner(System.in);//instancia da classe Scanner
        System.out.println("Digite o nome do aluno: ");//saida de dados
        String nome = entrada.nextLine();//entrada de dados
        System.out.println("Digite a idade do aluno: ");//saida de dados
        int idade = entrada.nextInt();//entrada de dados
        Aluno a = new Aluno(nome, idade);//instancia da classe Aluno
        System.out.println("Nome: " + a.recuperarNome());//saida de dados
        System.out.println("Idade: " + a.recuperarIdade());//saida de dados
    }
}

package meu_pacote;//definindo o pacote do java
class MinhaClasse {
    public static void main(String args[]) {
        Aluno a = new Aluno("Pessoa", 20);//instancia da classe Aluno
        System.out.println("Nome: " + a.recuperarNome());//saida de dados
        System.out.println("Idade: " + a.recuperarIdade());//saida de dados
    }
}