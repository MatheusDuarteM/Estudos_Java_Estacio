import com.mycompany.GereEscola.Pessoa;//Pacotes
//Classe
class Derivada extends Pessoa {//Atributos
    public Derivada ( String nome , String id ) {//Métodos
        super ( nome , id );
    }
    public String getNome ( ) {//Métodos
        return recuperarNome ( );
    }
}
public class Principal {//Classe
     public static void main ( String args [ ] ) {//Métodos
        Derivada Der = new Derivada ( "Marcos" , "A1" );//Instanciando a classe derivada
        System.out.println ( Der.getNome() );//Chamando o método da classe derivada
     }
}


class Externa { //Classe
   void getPosClasse () {//Métodos
       System.out.println( "Externa" );//Chamando o método da classe externa
   }
    class Intermediaria {  //Classe
        void getPosClasse () {//Métodos
            System.out.println( "Intermediaria" );//Chamando o método da classe intermediária
        }
        class Interna {  //Classe
            void getPosClasse () {//Métodos
                System.out.println( "Interna" );//Chamando o método da classe interna
            }
        }
    }
    class IntermediariaEstendida extends Intermediaria {//Classe
        void getPosClasse () {//Métodos
            super.getPosClasse();//Chamando o método da classe intermediária
            System.out.println( "Intermediaria Estendida" );//Chamando o método da classe intermediáriaEstendida
        }
    }
}
public class Principal {//Classe
    public static void main ( String args [ ] ) {//Métodos
        Externa.IntermediariaEstendida in = new Externa().new IntermediariaEstendida();//Instanciando a classe intermediária estendida
        in.getPosClasse();//Chamando o método da classe intermediáriaEstendida
    }    
}