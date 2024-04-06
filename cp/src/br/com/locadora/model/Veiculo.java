package br.com.locadora.model;

public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private boolean disponivel = true; // Valor padrão true, pois todos os veiculos no inicio estão disponivel

    public Veiculo(){}
    public Veiculo(String placa, String marca, String modelo, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // getters e setters

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }
}