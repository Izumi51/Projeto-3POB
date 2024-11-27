package Model;

public abstract class Funcionario {
    private String nome;
    private double salario;

    //CONSTRUCTOR
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    // GET
    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    //SET
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract String getTipo();

    //METODOS
    public void receberAumento(double aumento) {
        setSalario(aumento + salario);
    }

    public abstract void mostrarDetalhes();
}