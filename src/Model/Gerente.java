package Model;

public class Gerente extends Funcionario implements Gerencia {
    private final String tipo = "Gerente";

    //CONSTRUCTOR
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    //GET
    @Override
    public String getTipo() {
        return this.tipo;
    }

    //METODOS
    @Override
    public void mostrarDetalhes() {

    }

    @Override
    public void organizarEquipe() {

    }

    @Override
    public void conduzirReunioes() {

    }
}
