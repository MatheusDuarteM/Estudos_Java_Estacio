public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private Calendar data_nascimento;
    private long CPF;
    private Endereco endereco;
    //Métodos
    public Pessoa(String nome, Calendar data_nascimento, long CPF, Endereco endereco){
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.CPF = CPF;
        this.endereco = endereco;
        atualizarIdade();
    }
    protected void atualizarNome(String nome){
        this.nome = nome;
    }
    protected String recuperarNome(){
        return this.nome;
    }
    protected void atualizarIdade(){
        this.idade = calcularIdade();
    }
    protected int recuperarIdade() {
        return this.idade;
    }
    protected void atualizarCPF(long CPF){
        this.CPF = CPF;
    }
    protected long recuperarCPF(){
        return this.CPF;
    }
    protected void atualizarEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    protected Endereco recuperarEndereco(){
        return this.endereco;
    }
    private int calcularIdade(){
        int lapso;
        Calendar hoje = Calendar.getInstance();
        lapso = hoje.get(YEAR) - data_nascimento.get(YEAR);
        if ((data_nascimento.get(MONTH) > hoje.get(MONTH)) || ( data_nascimento.get(MONTH) ==                 
        hoje.get(MONTH) && data_nascimento.get(DATE) > hoje.get(DATE)))
            lapso--;
        return lapso;
    }
}

public class Aluno extends Pessoa {
    //Atributos    
    private String matricula;
    //Métodos
    public Aluno(String nome, Calendar data_nascimento, long CPF, Endereco endereco){
        super (nome, data_nascimento, CPF, endereco);
    }
}

public class Empregado extends Pessoa {
    //Atributos
    protected String matricula;
    private Calendar data_admissao , data_demissao;
    //Métodos
    public Empregado(String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
        super(nome, data_nascimento, CPF, endereco);
        this.matricula = gerarMatricula ();
        data_admissao = Calendar.getInstance();
    }
    public void demitirEmpregado () {
        data_demissao = Calendar.getInstance();
    }
    protected void gerarMatricula () {
        this.matricula = "Matrícula não definida.";
    }
    protected String recuperarMatricula () {
        return this.matricula;
    }
}