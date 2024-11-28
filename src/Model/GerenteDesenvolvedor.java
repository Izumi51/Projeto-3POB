package Model;

public class GerenteDesenvolvedor extends Funcionario implements Gerencia, Desenvolve{
    private final String tipo = "GerenteDesenvolvedor";

    //CONSTRUCTOR
    public GerenteDesenvolvedor(String nome, double salario, int id) {
        super(nome, salario, id);
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
        System.out.println("\n\nNome: " + getNome() + "\nTipo: " + getTipo() + "\nSalario: " + getSalario());
    }

    @Override
    public void organizarEquipe() {

    }

    @Override
    public void conduzirReunioes() {

    }
}
