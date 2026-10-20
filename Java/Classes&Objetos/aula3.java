import java.util.Random;//extensão para gerar numeros aleatorios
    //Classe
    public class Pessoa {//Classe
    //Atributos
    private String nome;
    private double codigo_identificador;
    private Random aleatorio;   
    //Métodos
    public Pessoa (String nome){
         aleatorio = new Random();
         this.setNome(nome);
         this.codigo_identificador = aleatorio.nextDouble();
    }
    private void setNome (String nome) {//metodo
         this.nome = nome;//atributo recebe o valor do parametro
    }  
    public String getNome () {//metodo
         return this.nome;//retorna o valor do atributo
    }
    public double getCodigoIdentificador (){//metodo
         return this.codigo_identificador;//retorna o valor do atributo
    }   
    public static void main(String args[]){//metodo main
     Pessoa p1 = new Pessoa("Teste A");
     Pessoa p2 = new Pessoa("Teste B");
     System.out.println("[Pessoa 1] nome: "+p1.getNome()+", Código Identificador: "+p1.getCodigoIdentificador());
     System.out.println("[Pessoa 2] nome: "+p2.getNome()+", Código Identificador: "+p2.getCodigoIdentificador());
}
    
}