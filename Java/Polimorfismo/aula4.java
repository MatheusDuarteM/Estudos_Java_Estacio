abstract class Veiculo {
    protected String modelo; // Atributo protegido
    public Veiculo(String modelo) { // Construtor
        this.modelo = modelo; // Atribui valor ao atributo
    }
    public abstract void acelerar(); // Método abstrato
    public abstract void frear(); // Método abstrato
    public abstract void atualizarModelo(String modelo); // Método abstrato
    public String recuperarModelo() { // Método concreto
        return this.modelo; // Retorna o valor do atributo
    }
}

class Carro extends Veiculo {
    public Carro(String modelo) { // Construtor
        super(modelo); // Chama o construtor da classe base
    }
    @Override
    public void acelerar() { // Implementação do método abstrato
        System.out.println("O carro " + modelo + " está acelerando.");
    }
    @Override
    public void frear() { // Implementação do método abstrato
        System.out.println("O carro " + modelo + " está freando.");
    }
    @Override
    public void atualizarModelo(String modelo) { // Implementação do método abstrato
        this.modelo = modelo; // Atualiza o valor do atributo
    }
}

class Moto extends Veiculo {
    public Moto(String modelo) { // Construtor
        super(modelo); // Chama o construtor da classe base
    }
    @Override
    public void acelerar() { // Implementação do método abstrato
        System.out.println("A moto " + modelo + " está acelerando.");
    }
    @Override
    public void frear() { // Implementação do método abstrato
        System.out.println("A moto " + modelo + " está freando.");
    }
    @Override
    public void atualizarModelo(String modelo) { // Implementação do método abstrato
        this.modelo = modelo; // Atualiza o valor do atributo
    }
}

public class Principal {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Fusca"); // Cria um objeto do tipo Carro
        Veiculo moto = new Moto("Honda"); // Cria um objeto do tipo Moto

        carro.acelerar(); // Chama o método acelerar do carro
        carro.frear(); // Chama o método frear do carro
        System.out.println("Modelo do carro: " + carro.recuperarModelo()); // Recupera o modelo do carro

        moto.acelerar(); // Chama o método acelerar da moto
        moto.frear(); // Chama o método frear da moto
        System.out.println("Modelo da moto: " + moto.recuperarModelo()); // Recupera o modelo da moto

        carro.atualizarModelo("Chevette"); // Atualiza o modelo do carro
        System.out.println("Novo modelo do carro: " + carro.recuperarModelo()); // Recupera o novo modelo do carro
    }
}