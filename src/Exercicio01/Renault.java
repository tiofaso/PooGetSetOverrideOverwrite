package Exercicio01;

public class Renault extends Carros {
    public Renault(String marca, int ano, double valor, String cor, int portas, double velocidade) {
        super(marca, ano, valor, cor, portas, velocidade);
    }

    public Renault(String marca, int ano, double valor, String cor, int portas) {
        super(marca, ano, valor, cor, portas);
    }

    @Override
    public void partidaMotor(double velocidade) {
        System.out.printf("\n\nIniciando motort... minha velocidade está em " + velocidade + " km/h");
    }


    @Override
    public void aceleraMotor(double velocidade) {
        System.out.printf("\nAcelerando... minha velocidade está em " + velocidade + "km/h");

    }

    @Override
    public void freiaCarro(double velocidade) {
        System.out.printf("\nFreando... minha velocidade está em " + velocidade + "km/h");
    }

    public void mostraCarro() {
        System.out.printf("INFOS DO CARRO");
        System.out.printf("\nMarca: " + marca);
        System.out.printf("\nAno:" + ano);
        System.out.printf("\nValor: R$" + valor);
        System.out.printf("\nCor: " + cor);
        System.out.printf("\nNúmero de portas: " + portas);
    }
}
