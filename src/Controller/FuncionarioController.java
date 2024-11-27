package Controller;

//Classes
import Model.*;
import jdk.incubator.foreign.FunctionDescriptor;
//Java
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class FuncionarioController {
    private ArrayList<Funcionario> funcionarios;
    private final String arqFuncionarios = "src/funcionarios.txt";
    private int id = 0;

    public FuncionarioController(){
        this.funcionarios = new ArrayList<>();
        carregarFuncionarios();
    }

    public void adicionarFuncionario(String nome, double salario, int tipo) {
        Funcionario funcionario = new Gerente(nome, salario);

        switch (tipo) {
            case 1:
                funcionario = new Gerente(nome, salario);
                break;

            case 2:
                funcionario = new Treinador(nome, salario);
                break;

            case 3:
                funcionario = new Desenvolvedor(nome, salario);
                break;

            case 4:
                funcionario = new GerenteDesenvolvedor(nome, salario);
                break;
        }

        funcionarios.add(funcionario);
        salvarFuncionario();
    }

        public void excluirPaciente(int numero) {
            Funcionario funcio = buscarFuncionario(numero);

            if (funcio != null) {
                Funcionarioss.remove(funcio);
                salvarFuncionarioss();
            } else {
                System.out.println("Funcionarios nao encontrado!");
            }
        }

    public void listarTodosFuncionarios() {
        if (Funcionarioss.isEmpty()) {
            System.out.println("lista vazia");
        }else{
            for (Funcionarios Funcionarios : Funcionarioss) {
                Funcionarios.listarFuncionarios();
            }
        }
    }

    public void listarUmFuncionario(int numero) {
        Funcionarios pacie = buscarFuncionarios(numero);

        if (pacie != null) {
            pacie.listarFuncionarios();
        }else{
            System.out.println("Funcionarios nao encontrado");
        }
    }

    public void alterarFuncionario(int numero) {
        Funcionarios pacie = buscarFuncionarios(numero);

        if (pacie != null) {
            Scanner in = new Scanner(System.in);

            System.out.println("Insira um novo peso: ");
            double peso = in.nextDouble();
            System.out.println("Insira um novo altura: ");
            double altura = in.nextDouble();

            pacie.setPeso(peso);
            pacie.setAltura(altura);
            salvarFuncionarioss();

            in.close();
        } else {
            System.out.println("Funcionarios nao encontrado!");
        }

    }

    private Funcionario buscarFuncionario(int numero) {
        try (BufferedReader reader = new BufferedReader(new FileReader(arqFuncionarios))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                int idTemp = Integer.parseInt(dados[0]);
                if (idTemp == numero){
                    return idTemp;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de funcionarios não encontrado. Será criado ao salvar novos funcionarios.");
        } catch (IOException e) {
            System.out.println("Erro ao carregar funcionarios: " + e.getMessage());
        }

        for (Funcionario funcio : funcionarios) {
            if (funcio.getNumero() == numero){
                return funcio;
            }
        }

        return null;
    }

    public void salvarFuncionario() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arqFuncionarios))) {
            for (Funcionario funcionario : funcionarios) {
                writer.write(this.id + ";" + funcionario.getTipo() + ";" + funcionario.getNome() + ";" + funcionario.getSalario());
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
                int idTemp = Integer.parseInt(dados[0]);
                String nome = dados[1];
                double salario = Double.parseDouble(dados[1]);
                String tipo = dados[2];

                switch (tipo) {
                    case "Gerente":
                        funcionarios.add(new Gerente(nome, salario));
                        break;
                    case "Treinador":
                        funcionarios.add(new Treinador(nome, salario));
                        break;
                    case "Desenvolvedor":
                        funcionarios.add(new Desenvolvedor(nome, salario));
                        break;
                    case "GerenteDesenvolvedor":
                        funcionarios.add(new GerenteDesenvolvedor(nome, salario));
                        break;
                }

                if (idTemp > id) {
                    id = idTemp;
                }
                id += 1;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de funcionarios não encontrado. Será criado ao salvar novos funcionarios.");
            this.id = 1;
        } catch (IOException e) {
            System.out.println("Erro ao carregar funcionarios: " + e.getMessage());
        }
    }
}
