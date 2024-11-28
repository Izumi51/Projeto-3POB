package Model;

public abstract class Funcionario {
    private String nome;
    private double salario;
    private int id;

    //CONSTRUCTOR
    public Funcionario(String nome, double salario, int id){
        this.nome = nome;
        this.salario = salario;
        this.id = id;
    }

    // GET
    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    //SET
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract String getTipo();

    //METODOS
    public void receberAumento(double aumento) {
        setSalario(aumento + salario);
    }

    public abstract void mostrarDetalhes();
}