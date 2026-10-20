public class Principal {
    //Atributos
    private static Empregado empregado, diretor;
    //Método main
    public static void main(String args[]) {
        Calendar data = Calendar.getInstance();
        data.set(1980, 10, 23);
        empregado = new Empregado("Clara Silva", data , 211456937 , null);
        empregado.gerarMatricula();
        diretor = new Diretor ("Marco Antônio", data , 901564098 , null);
        diretor.gerarMatricula();
        System.out.println ("A matrícula do Diretor é: " + diretor.recuperarMatricula());
        System.out.println ("A matrícula do Empregado é: " + empregado.recuperarMatricula());
    }
}



public class Diretor extends Empregado {
   //Métodos
    public Diretor(String nome, Calendar data_nascimento, long CPF, Endereco endereco){
            super(nome, data_nascimento, CPF, endereco);    
   }    
   protected void gerarMatricula(){
            matricula = "E-" + UUID.randomUUID().toString();  
   }
    protected void alterarMatricula(){
            gerarMatricula();
    }
    protected void alterarMatricula(String matricula){
            this.matricula = matricula;
    }
}