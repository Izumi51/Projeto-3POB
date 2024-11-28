package Model;

public class Gerente extends Funcionario implements Gerencia {
    private final String tipo = "Gerente";

    //CONSTRUCTOR
    public Gerente(String nome, double salario, int id) {
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
    public void organizarEquipe() {

    }

    @Override
    public void conduzirReunioes() {

    }
}
