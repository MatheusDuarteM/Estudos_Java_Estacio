package com.mycompany.PctBravo;//Pacotes
class Externa {//Classe
    private String id;//Atributos
    public Externa ( ) {//Métodos
        id = "PctBravo.Externa";//Atributos
        System.out.println( "PctBravo.Externa instanciada." );//Chamando o método da classe externa
    }
    public String getId () {//Métodos
       return id;//Retornando o id da classe externa
    }
    class Interna {//Classe
        public Interna ( ) {//Métodos
        id = "PctBravo.Externa.Interna";//Atributos
        System.out.println( "PctBravo.Externa.Interna instanciada." );//Chamando o método da classe interna
        }
        public String getId () {//Métodos
            return id;//Retornando o id da classe interna
        }
    }
}
public class Base extends Externa.Interna {//Classe
    private String id;//Atributos
    public Base ( ) {//Métodos
        new Externa().super();//Instanciando a classe externa
        id="PctBravo.Base";//Atributos
        System.out.println( "PctBravo.Base instanciada." );//Chamando o método da classe base
    }
}

package com.mycompany.PctAlfa;
import com.mycompany.PctBravo.*;//Pacotes
class Execucao {//Classe
    private String id;//Atributos
    public Execucao ( ) {//Métodos
        id="PctAlfa.Execucao";//Atributos
        System.out.println( "PctAlfa.Execucao instanciada." );//Chamando o método da classe execução
    }
}
public class Principal {//Classe
    static Execucao ex;//Atributos
    static Base bs;//Atributos
    public static void main(String[] args) {//Métodos
        ex = new Execucao ();//Instanciando a classe execução
        bs = new Base ();//Instanciando a classe base
        System.out.println ( bs.getId() );//Chamando o método da classe base
    }
} 