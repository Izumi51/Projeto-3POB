package Controller;

//Classes
import Model.*;
//Java
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class FuncionarioController {
    private ArrayList<Funcionario> funcionarios;
    private final String arqFuncionarios = "src/funcionarios.txt";
    private int maiorId = 0;

    public FuncionarioController(){
        this.funcionarios = new ArrayList<>();
        carregarFuncionarios();
    }

    public void adicionarFuncionario(String nome, double salario, int id, int tipo) {
        Funcionario funcionario = switch (tipo) {
            case 1 -> new Gerente(nome, salario, id);
            case 2 -> new Treinador(nome, salario, id);
            case 3 -> new Desenvolvedor(nome, salario, id);
            case 4 -> new GerenteDesenvolvedor(nome, salario, id);
            default -> null;
        };

        funcionarios.add(funcionario);
        salvarFuncionario();
    }

    public void excluirFuncionario(int numero) {
        Funcionario funcio = buscarFuncionario(numero);

        if (funcio != null) {
            funcionarios.remove(funcio);
            salvarFuncionario();
        } else {
            System.out.println("Funcionario nao encontrado!");
        }
    }

    public void listarTodosFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("lista vazia");
        }else{
            for (Funcionario funcio : funcionarios) {
                funcio.mostrarDetalhes();
            }
        }
    }

    public void alterarFuncionario(int numero) {
        Funcionario funcio = buscarFuncionario(numero);

        if (funcio != null) {
            Scanner in = new Scanner(System.in);

            System.out.println("Insira um novo nome: ");
            String nome = in.nextLine();
            System.out.println("Insira um novo salario: ");
            double salario = in.nextDouble();

            funcio.setNome(nome);
            funcio.setSalario(salario);
            salvarFuncionario();

            in.close();
        } else {
            System.out.println("Funcionarios nao encontrado!");
        }

    }

    private Funcionario buscarFuncionario(int numero) {
        for (Funcionario funcio : funcionarios) {
            if (funcio.getId() == numero){
                return funcio;
            }
        }
        return null;
    }

    public void salvarFuncionario() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arqFuncionarios))) {
            for (Funcionario funcionario : funcionarios) {
                writer.write(funcionario.getId() + ";" + funcionario.getTipo() + ";" + funcionario.getNome() + ";" + funcionario.getSalario());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar funcionarios: " + e.getMessage());
        }
    }
    public void carregarFuncionarios() {
        try (BufferedReader reader = new BufferedReader(new FileReader(arqFuncionarios))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                int id = Integer.parseInt(dados[0]);
                String tipo = dados[1];
                String nome = dados[2];
                double salario = Double.parseDouble(dados[3]);

                switch (tipo) {
                    case "Gerente":
                        funcionarios.add(new Gerente(nome, salario, id));
                        break;
                    case "Treinador":
                        funcionarios.add(new Treinador(nome, salario, id));
                        break;
                    case "Desenvolvedor":
                        funcionarios.add(new Desenvolvedor(nome, salario, id));
                        break;
                    case "GerenteDesenvolvedor":
                        funcionarios.add(new GerenteDesenvolvedor(nome, salario, id));
                        break;
                }

                if (id > maiorId) {
                    maiorId = id;
                }
            }
            maiorId += 1;
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de funcionarios não encontrado. Será criado ao salvar novos funcionarios.");
            maiorId = 1;
        } catch (IOException e) {
            System.out.println("Erro ao carregar funcionarios: " + e.getMessage());
        }
    }
}