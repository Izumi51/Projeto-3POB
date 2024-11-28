package View;

//Java

import Controller.FuncionarioController;

import java.util.Scanner;

public class FuncionarioView {
    public static void main(String[] args) {
        FuncionarioController control = new FuncionarioController();
        Scanner in = new Scanner(System.in);
        int op;

        int numero;
        String nome;
        double salario;

        do {

            System.out.println("\n---------MENU-----------");
            System.out.println("1: Adicionar Funcionario");
            System.out.println("2: Alterar Funcionario");
            System.out.println("3: Excluir Funcionario");
            System.out.println("4: Listar todos Funcionario");
            System.out.println("0: Sair");
            System.out.println("Selecione uma opcao: ");
            op = in.nextInt();
            System.out.println("------------------------");

            switch(op) {
                case 0:
                    break;
                case 1:
                    System.out.println("\n---------Tipos-----------");
                    System.out.println("1: Gerente ");
                    System.out.println("2: Treinador ");
                    System.out.println("3: Desenvolvedor ");
                    System.out.println("4: Gerente Desenvolvedor ");
                    System.out.println("Selecione uma opcao: ");
                    int opp = in.nextInt();
                    System.out.println("------------------------");
                    in.nextLine();
                    System.out.println("Insira o nome do Funcionario: ");
                    nome = in.nextLine();
                    System.out.println("Insira o salario do Funcionario: ");
                    salario = in.nextDouble();

                    control.adicionarFuncionario(nome, salario, opp);
                    break;

                case 2:
                    in.nextLine();
                    System.out.println("Insira o numero do Funcionario a ser alterado: ");
                    numero = in.nextInt();

                    control.alterarFuncionario(numero);
                    break;

                case 3:
                    in.nextLine();
                    System.out.println("Insira o numero do Funcionario a ser excluido: ");
                    numero = in.nextInt();

                    control.excluirFuncionario(numero);
                    break;

                case 4:
                    control.listarTodosFuncionarios();
                    break;

                default:
                    System.out.println("Opcao invalida!!");
                    break;
            }

        } while(op != 0);

        in.close();
    }
}