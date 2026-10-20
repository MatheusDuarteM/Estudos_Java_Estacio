class Escola {
    //Atributos
    private String nome, CNPJ;   
    private Endereco endereco;
    private Departamento departamentos [];
    private Aluno discentes [];
    private int nr_discentes , nr_departamentos;
 
    //Métodos
    public Escola ( String nome , String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new Departamento[10];
        this.discentes = new Aluno[1000];
        this.nr_departamentos = 0;
        this.nr_discentes = 0;
    }
    //Métodos
    public void criarDepartamento(String nomeDepartamento){//metodo
        if(nr_departamentos <= 10)//verifica se o numero de departamentos é menor ou igual a 10
        {//cria um novo departamento e adiciona ao array de departamentos
            departamentos[nr_departamentos] = new Departamento ( nomeDepartamento);                
            nr_departamentos++;//incrementa o numero de departamentos
        } else {
            System.out.println ( "Nao e possivel criar outro Departamento." );
       }
    public void matricularAluno ( Aluno novoAluno ) {//metodo
        //adiciona um novo aluno ao array de discentes
       discentes [ nr_discentes ] = novoAluno;
    }
}

class Endereco {
    //Atributos
    private String nome_rua;
    private int numero;
    //Métodos
    public Endereco ( String nome_rua, int numero ) {
        this.nome_rua = nome_rua;
        this.numero = numero;
    }
}