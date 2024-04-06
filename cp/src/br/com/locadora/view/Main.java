package br.com.locadora.view;

import br.com.locadora.model.Cliente;
import br.com.locadora.model.Veiculo;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Veiculo x1 = new Veiculo("05042024", "BMW", "X1", 2024);
        Veiculo ferrari = new Veiculo("257522", "Ferrari", "Super Fast", 2024);
        Veiculo Porshe = new Veiculo("417522", "Porshe", "911", 2024);
        Veiculo Mustang = new Veiculo("684644", "Mustang", "GT", 2024);

        // pegar dados do cliente
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente");
        nome = nome.toUpperCase();
        String cpf = JOptionPane.showInputDialog(null, "Digite o cpf do cliente");
        String telefone = JOptionPane.showInputDialog(null, "Digite o telefone do cliente");

        // instanciar o objeto com os dados do usuario, com o construtor que criei
        Cliente cliente = new Cliente(nome, cpf, telefone);

        // mensagem de sucesso do cadastro
        JOptionPane.showMessageDialog(null, "Cliente " + cliente.getNome() + " foi cadastrado com sucesso");

        boolean rodar = true;
        while (rodar) {

            String opcao = JOptionPane.showInputDialog(null, "1 - Alugar Carro\n2 - Devolver Carro\n3 - Sair");

            switch (opcao) {
                case "1":
                    String opcaoCarro = JOptionPane.showInputDialog(null, "Carros disponiveis\n 1 - X1\n 2 - Ferrari Super Fast\n 3 - Porshe 911\n 4 - Mustang GT");
                    switch (opcaoCarro) {
                        case "1":
                            boolean alugadoSucesso = cliente.alugarVeiculo(x1);

                            if (!alugadoSucesso) {
                                JOptionPane.showMessageDialog(null, "Você já possuí um veículo");
                            }
                            break;


                        case "2":
                            alugadoSucesso = cliente.alugarVeiculo(ferrari);

                            if (!alugadoSucesso) {
                                JOptionPane.showMessageDialog(null, "Você já possuí um veículo");
                            }
                            break;


                        case "3":
                        alugadoSucesso = cliente.alugarVeiculo(Porshe);

                         if (!alugadoSucesso) {
                        JOptionPane.showMessageDialog(null, "Você já possuí um veículo");
                         }
                         break;

                         case "4":
                            alugadoSucesso = cliente.alugarVeiculo(Mustang);

                            if (!alugadoSucesso) {
                                JOptionPane.showMessageDialog(null, "Você já possuí um veículo");
                            }
                            break;

                    }




                    break;

                case "2":
                    cliente.devolverVeiculo();
                    break;
                case "3":
                    rodar = false;
                    JOptionPane.showMessageDialog(null, "Obrigado por fazer parte da Locadora Fiap...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Dado inválido, tente novamente");
                    break;
            }
        }
    }
}