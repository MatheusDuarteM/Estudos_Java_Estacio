class Escola{
    //Atributos
    private String nome,CNPJ;   
    private Endereco endereco;
    private List departamentos;
    private List discentes;
    //Métodos
    public Escola(String nome,String CNPJ){
        this.nome=nome;
        this.CNPJ=CNPJ;
        this.departamentos=new ArrayList();
        this.discentes=new ArrayList<>();
    }
    public void criarDepartamento(String nomeDepartamento){//metodo
    //adicionando um novo departamento a lista de departamentos
            departamentos.add(new Departamento(nomeDepartamento));
    }
    public void fecharDepartamento(Departamento departamento){
        //removendo um departamento da lista de departamentos
            departamentos.remove(departamento);
    }
    public void matricularAluno(Aluno novoAluno){
        //adicionando um novo aluno a lista de discentes
            discentes.add(novoAluno);
    }
    public void trancarMatriculaAluno(Aluno aluno){
        //removendo um aluno da lista de discentes
            discentes.remove(aluno);
    }
    public void agruparAlunos() {//metodo
        //agrupando os alunos por naturalidade
            Map<String,List<Aluno>> agrupamento=
            discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade));//agrupando os alunos por naturalidade
            System.out.println("Resultado do agrupamento por naturalidade: ");
            agrupamento.forEach((String chave,List<Aluno> lista)->System.out.println(chave+" = "+lista));//imprimindo o resultado do agrupamento
    }
    public void agruparAlunos(int a) {
    Map<String, Set<Aluno>>agrupamento = 
discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade,Collectors.toSet()));
    System.out.println("Resultado do agrupamento por naturalidade: ");    
    agrupamento.forEach((String chave,Set<Aluno>conjunto)-> System.out.println(chave+" = "+conjunto));
} 
public void agruparAlunos(double a) {
    Map<String,Set<Aluno>> agrupamento=discentes.stream().collect(Collectors.groupingBy(Aluno::recuperarNaturalidade,TreeMap::new,Collectors.toSet()));
    System.out.println("Resultado do agrupamento por naturalidade: ");    
    agrupamento.forEach((String chave,Set<Aluno>conjunto)-> System.out.println(chave+" = "+conjunto));
}

} 