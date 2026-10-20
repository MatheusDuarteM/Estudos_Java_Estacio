public class Principal {
    //Atributos
    private static Pessoa p1, p3;
    private static Fisica p2;
    //Métodos
    public static void main (String args[]) {
        Calendar data_nasc = Calendar.getInstance();
        data_nasc.set(1980, 10, 23);
        p1 = new Fisica ( "Marco Antônio" , data_nasc , "365.586.875-45" , null , "Brasil" , "Rio de Janeiro" );
        p2 = new Fisica ( "Marco Antônio" , data_nasc , "365.586.875-45" , null , "Brasil" , "Rio de Janeiro" );
        p3 = new Pessoa ( "Classe Pessoa" , null , null , null , "Brasil" , "Rio de Janeiro");
    if ( p1 instanceof Pessoa )
       System.out.println("p1 é instância do tipo Pessoa.");
    else
       System.out.println("p1 não é instância do tipo Pessoa.");
    if ( p2 instanceof Pessoa )
       System.out.println("p2 é instância do tipo Pessoa.");
    else
       System.out.println("p2 não é instância do tipo Pessoa.");
    if ( p3 instanceof Pessoa )
       System.out.println("p3 é instância do tipo Pessoa.");
    else
       System.out.println("p3 não é instância do tipo Pessoa.");
    if ( p3 instanceof Fisica )
      System.out.println("p3 é instância do tipo Fisica.");
    else
         System.out.println("p3 não é instância do tipo Fisica.");
    }
}

//Comentário
//Segundo a documentação da linguagem, a semântica de “equals” na classe Object é retornar verdade se, 
//e somente se, estivermos comparando o mesmo objeto: “this method returns true if and only if x and y refer to the same object (x == y has the value true)” (ORACLE INC., s.d.). 
//Mas diferentemente do operador “==”, o método “equals” realiza a comparação com base na implementação realizada, 
//o que permite dar-lhe outra semântica, isto é, retornar “true” se o os conteúdos dos objetos comparados forem iguais, por exemplo.