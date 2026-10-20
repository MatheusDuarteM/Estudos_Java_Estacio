//Classe abstrata
abstract class Pessoa {
    ...
    private String identificador;//Atributo
    ...
    protected void atualizarID ( String identificador ) {//Método
        this.identificador = identificador;//Atribui valor ao atributo
    }
    protected String recuperarID ( ) {//Método
        return this.identificador;//Chama o valor do atributo
    }
    ...
}

class Fisica extends Pessoa {
    ...
    private String cpf;//Atributo
    ...
    public Fisica ( String nome , Calendar data_nasc , String cpf , String rg , String pais , String cidade ) {//Construtor
        super ( nome , data_nasc , rg , pais , cidade );//Chama o construtor da superclasse
        this.cpf = cpf;//Atribui valor ao atributo
        this.atualizarID ( cpf );//Chama o método da superclasse
    }

    @Override
    public void atualizarID ( String cpf ) {//Sobrescreve o método da superclasse
        this.cpf = cpf;//Atribui valor ao atributo
    }
    public String recuperarID ( ) {//Sobrescreve o método da superclasse
        return this.cpf;//Chama o valor do atributo
    }
    
}

public class Main{
    public static void main(String[] args) {
        Fisica pessoaFisica = new Fisica("João", Calendar.getInstance(), "123.456.789-00", "MG-12.345.678", "Brasil", "Belo Horizonte");
        
        System.out.println("ID Recuperado: " + pessoaFisica.recuperarID());
    }
}