package Model;

public class Treinador extends Funcionario implements Treina {
    private final String tipo = "Treinador";

    //CONSTRUCTOR
    public Treinador(String nome, double salario, int id) {
        super(nome, salario, id);
    }

    //GET
    @Override
    public String getTipo() {
        return this.tipo;
    }

    //METODOS
    @Override
    public void mostrarDetalhes() {
        System.out.println("\n\nNome: " + getNome() + "\nTipo: " + getTipo() + "\nSalario: " + getSalario());
    }

    @Override
    public void ensinarTecnologia() {

    }

    @Override
    public void motivarEquipe() {

    }
}
