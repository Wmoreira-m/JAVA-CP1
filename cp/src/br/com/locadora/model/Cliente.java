package br.com.locadora.model;

import javax.swing.*;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private Veiculo veiculoAlugado; // quando esta vazio se torna null

    public Cliente(){}
    public Cliente(String nome, String cpf, String telefone){
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
    }

    public boolean alugarVeiculo(Veiculo veiculo){
        if (veiculo.isDisponivel() && this.veiculoAlugado == null) {
            veiculo.setDisponivel(false);
            this.veiculoAlugado = veiculo;
            JOptionPane.showMessageDialog(null, nome + " alugou o veiculo " + veiculo.getMarca() + " " + veiculo.getModelo());
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível alugar o " + veiculo.getMarca() + " " + veiculo.getModelo() + " para " + nome);
            return false;
        }
    }

    public void devolverVeiculo() {
        if (this.veiculoAlugado != null) {
            this.veiculoAlugado.setDisponivel(true);
            JOptionPane.showMessageDialog(null, nome + " devolveu o veiculo " + this.veiculoAlugado.getMarca() + " " + this.veiculoAlugado.getModelo());
            this.veiculoAlugado = null;
        }else {
        JOptionPane.showMessageDialog(null, "Não foi possível devolver um carro!\n" + nome + ", você não alugou um carro");
        }

    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }
}
