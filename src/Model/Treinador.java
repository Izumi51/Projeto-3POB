package Model;

public class Treinador extends Funcionario implements Treina {
    private final String tipo = "Treinador";

    //CONSTRUCTOR
    public Treinador(String nome, double salario) {
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
    public void ensinarTecnologia() {

    }

    @Override
    public void motivarEquipe() {

    }
}
