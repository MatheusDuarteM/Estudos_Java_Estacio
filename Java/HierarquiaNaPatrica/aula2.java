public class Pessoa {
    //Atributos
    protected String nome , naturalidade , nacionalidade , identificador;
    private Calendar data_inicio_existencia;
    private int idade;
    private Endereco endereco;
    
    //Métodos
    public Pessoa ( String nome , Calendar data_inicio_existencia, String identificador , Endereco endereco , String nacionalidade , String naturalidade ) {
        this.nome = nome;
        this.data_inicio_existencia = data_inicio_existencia;
        this.identificador = identificador;
        this.endereco = endereco;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
    }
...
public String toString (){//Métodos
        return "Objeto:" + "\n\t- Classe: " + getClass().getName() + "\n\t- Hash: " + Integer.toHexString(hashCode()) + "\n\t- Nome: " + nome + "\n\t- Identificador: " 
+ identificador;//Métodos
    }
}

public class Fisica extends Pessoa {
    //Atributos
    
    //Métodos
    public Fisica ( String nome , Calendar data_nascimento , String CPF , Endereco endereco , String nacionalidade , String naturalidade ) {
        super ( nome , data_nascimento, CPF , endereco , nacionalidade , naturalidade );
        atualizarIdade ();
    }
}

public class Principal {
    private static Pessoa grupo [];
    public static void main (String args[]) {
        grupo = new Pessoa [2];//Atributos
        grupo [0] = new Fisica ( "Marco Antônio" , data_nasc , “365.586.875-45”, null , "Brasil" , "Rio de Janeiro" );//Atributos
        grupo [1] = new Pessoa ("Escola Novo Mundo Ltda" , data_nasc , “43.186.666/0026-32” , null , "Brasil" , "Rio de Janeiro");
        for ( int i = 0 ; i <= 1 ; i++ )//Atributos
        System.out.println( "grupo[" + i + “]: “ + grupo[i].toString() );
    }
}