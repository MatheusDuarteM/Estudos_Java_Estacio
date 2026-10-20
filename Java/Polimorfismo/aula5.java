//implementando a interface em uma classe abstrata
interface CienciaDeDados{
    void analisarDados();//método abstrato
    void visualizarDados();
}
//classe abstrata que implementa a interface
class AnalistaDeDados implements CienciaDeDados {//método abstrato
    @Override
    public void analisarDados() {// Implementação do método abstrato
        System.out.println("Analisando dados...");
    }

    @Override
    public void visualizarDados() {
        System.out.println("Visualizando dados...");
    }
}

class CientistaDeDados implements CienciaDeDados {
    @Override
    public void analisarDados() {
        System.out.println("Analisando dados complexos...");
    }

    @Override
    public void visualizarDados() {
        System.out.println("Visualizando dados complexos...");
    }
}

public class Main{
    public static void main(String[] args) {
        CienciaDeDados analista = new AnalistaDeDados(); // Cria um objeto do tipo AnalistaDeDados
        CienciaDeDados cientista = new CientistaDeDados(); // Cria um objeto do tipo CientistaDeDados

        analista.analisarDados(); // Chama o método analisarDados do analista
        analista.visualizarDados(); // Chama o método visualizarDados do analista

        cientista.analisarDados(); // Chama o método analisarDados do cientista
        cientista.visualizarDados(); // Chama o método visualizarDados do cientista
    }
}