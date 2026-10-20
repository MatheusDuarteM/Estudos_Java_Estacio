public class PessoaFisica {//Classe
    protected String CPF;//Atributos
    protected String nome;//Atributos
        
    public PessoaFisica ( String nome , String CPF ) {//Métodos
        this.nome = nome;//Atributos
        setCPF ( CPF );//Atributos
    }
    protected void setNome ( String nome ) {//Métodos
        this.nome = nome;//Atributos
    }
    protected String getNome ( ) {//Métodos
        return nome;//Atributos
    }
    protected void setCPF ( String CPF ) {//Métodos 
        if ( validarCPF ( CPF ) )//Atributos
            this.CPF = CPF;//Atributos
        else
            System.out.println ( "CPF invalido!" );//Atributos
    }
    protected String getCPF ( ) {//Métodos
        return CPF;//Atributos
    }    
    private boolean validarCPF ( String CPF ) {//Métodos
        
        
        //verifica sequência de dígitos iguais e tamanho (11 dígitos)
        if ( ! ( CPF.chars ( ).allMatch ( Character::isDigit ) ) ) {//Atributos
            System.out.println ( "CPF possui caracteres não numéricos!" );//Atributos
            return false;//Atributos
        } 
        else if ( ( CPF.length() != 11 ) || CPF.matches( "[0]{11}|[1]{11}|[2]{11}|[3]{11}|[4]{11}|[5]{11}|[6]{11}|[7]{11}|[8]{11}|[9]{11}" ) )
            return false;
        return true;
    }
}

//imports
import java.util.Comparator;
        
    public class ComparaPessoa implements Comparator<PessoaFisica> {
    @Override
    public int compare ( PessoaFisica obj1 , PessoaFisica obj2 )
    {
        return obj1.getNome ().compareToIgnoreCase ( obj2.getNome ( ) ); //retorna zero se os nomes são iguais. Desconsidera a caixa.
    }    
}

public class Aluno extends PessoaFisica {
    String matricula;
    
    public Aluno ( String nome , String CPF , String matricula ) {
        super ( nome , CPF );
        this.matricula = matricula;
    }    
    public void setMatricula ( String matricula ) {
        this.matricula = matricula;
    }    
    public String getMatricula ( ) {
        return matricula;
    }    
    @Override
    public String toString () {
        return String.format("ObjID: %s => Nome:%s | CPF:%s | Matricula: %S\n" , Integer.toHexString ( this.hashCode() ) , nome , CPF , matricula );
    }
}

//imports
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Principal {
    //Atributos
    private static SortedSet<Aluno> cj_ordenado;
    public static void main(String[] args) {
        cj_ordenado = new TreeSet<Aluno> ( new ComparaPessoa () );
        cj_ordenado.add ( new Aluno ( "Martins" , "12345678912" , "M1" ) );
        cj_ordenado.add ( new Aluno ( "Paula" , "12345678912" , "M2" ) );
        cj_ordenado.add ( new Aluno ( "Carla" , "36925814774" , "M3" ) );
        cj_ordenado.add ( new Aluno ( "Martins" , "45678912336" , "M4" ) );
        System.out.println( cj_ordenado );
    }
}