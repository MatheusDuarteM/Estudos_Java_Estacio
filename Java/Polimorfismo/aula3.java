public class Base{
    protected int var_base;
    public Base () {
        var_base = -1;
    }

    protected void atualizarVarBase(int var_base) {
        this.var_base = var_base;
    }

    protected void imprimirVarBase() {
        System.out.println("Valor da variável da classe base: " + var_base);
    }

    protected void atualizarVarSub(int var_sub) {
        ((Derivada)this).var_sub = var_sub;
    }

    protected void imprimirVarSub() {
        System.out.println("Valor da variável da classe derivada: " + ((Derivada)this).var_sub);
    }
}

public class Derivada extends Base {
    protected int var_sub;

    public Derivada() {
        super();
        var_sub = -1;
    }

    @Override
    protected void atualizarVarBase(int var_base) {
        super.atualizarVarBase(var_base);
    }

    @Override
    protected void imprimirVarBase() {
        super.imprimirVarBase();
    }

    @Override
    protected void atualizarVarSub(int var_sub) {
        this.var_sub = var_sub;
    }

    @Override
    protected void imprimirVarSub() {
        System.out.println("Valor da variável da classe derivada: " + var_sub);
    }
}

public class Principal{
    private static Derivada objDerivada;

    public static void main(String[] args) {
        objDerivada = new Derivada();
        System.out.println("Valores iniciais:");
        objDerivada.imprimirVarBase();
        objDerivada.imprimirVarSub();
        System.out.println("Valor da variável da classe derivada: " + objDerivada.var_sub);
        System.out.println("\nValores atualizados:");
        objDerivada.atualizarVarBase(10);
        objDerivada.atualizarVarSub(20);

        
    }
}