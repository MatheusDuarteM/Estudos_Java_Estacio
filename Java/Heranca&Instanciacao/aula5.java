var a;
console.log('O tipo de a eh: '+ typeof(a));
a = 1;
console.log('O tipo de a eh: '+ typeof(a));
a = "Palavra";
console.log('O tipo de a eh: '+ typeof(a));
a = false;
console.log('O tipo de a eh: '+ typeof(a));
a = [];
console.log('O tipo de a eh: '+ typeof(a));

// Saída:
// O tipo de a eh: undefined
// O tipo de a eh: number
// O tipo de a eh: string
// O tipo de a eh: boolean
// O tipo de a eh: object

public class Principal {
    private static Pessoa grupo [];
    ...
    grupo = new Pessoa [3];
    grupo [0] = new Fisica ( "Marco Antônio" , data_nasc , null , null , "Brasil" , "Rio de Janeiro" );
    grupo [1] = new Juridica ("Escola Novo Mundo Ltda" , data_nasc , null , null , "Brasil" , "Rio de Janeiro");
    grupo [2] = new Pessoa ( null , null , null , null , "Brasil" , "Rio de Janeiro");
    for ( int i = 0 ; i <= 2 ; i++ )
    System.out.println( grupo [i].retornaTipo ( ) );
    ...
}