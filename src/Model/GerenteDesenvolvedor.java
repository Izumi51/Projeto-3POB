package Model;

public class GerenteDesenvolvedor extends Funcionario implements Gerencia, Desenvolve{
    private final String tipo = "GerenteDesenvolvedor";

    //CONSTRUCTOR
    public GerenteDesenvolvedor(String nome, double salario) {
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

    @Override
    public void organizarEquipe() {

    }

    @Override
    public void conduzirReunioes() {

    }
}
