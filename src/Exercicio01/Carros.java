package Exercicio01;

import java.util.Date;

abstract class Carros {
    protected String marca;
    protected int ano;
    protected double valor;
    protected String cor;
    protected int portas;
    protected double velocidade;

    public Carros(String marca, int ano, double valor, String cor, int portas, double velocidade) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.portas = portas;
        this.velocidade = velocidade;
    }

    public Carros(String marca, int ano, double valor, String cor, int portas) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.portas = portas;
    }

    abstract void partidaMotor(double velocidade);

    abstract void aceleraMotor(double velocidade);

    abstract void freiaCarro(double velocidade);

    abstract void mostraCarro();
}
