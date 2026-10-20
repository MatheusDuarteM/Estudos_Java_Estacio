
abstract class Pessoa {
    protected int identificador; // Atributo protegido
    public Pessoa(int identificador) { // Construtor
        this.identificador = identificador; // Atribui valor ao atributo
    }

    public abstract void atualizarID(int identificador); // Método abstrato
    public int recuperarID() { // Método concreto
        return this.identificador; // Retorna o valor do atributo
    }
}
final class PessoaFisica extends Pessoa{
    public PessoaFisica(int identificador) { // Construtor
        super(identificador); // Chama o construtor da superclasse
    }

    @Override
    public void atualizarID(int identificador) { // Sobrescreve o método da superclasse
        this.identificador += 1; // Atribui valor ao atributo
    }
}

public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica(123); // Cria uma instância de PessoaFisica
        System.out.println("ID Recuperado: " + pessoaFisica.recuperarID()); // Chama o método da superclasse
        pessoaFisica.atualizarID(456); // Chama o método sobrescrito
        System.out.println("ID Atualizado: " + pessoaFisica.recuperarID()); // Chama o método da superclasse novamente
    }
}