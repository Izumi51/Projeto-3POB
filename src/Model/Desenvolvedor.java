package Model;

public class Desenvolvedor extends Funcionario implements Desenvolve {
    private final String tipo = "Desenvolvedor";

    //CONSTRUCTOR
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    //GET
    @Override
    public String getTipo() {
        return this.tipo;
    }

    //METODOS
    @Override
    public void codar() {

    }

    @Override
    public void resolverProblemas() {

    }

    @Override
    public void mostrarDetalhes() {

    }
}
