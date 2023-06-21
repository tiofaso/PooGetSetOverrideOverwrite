package Exercicio03;

import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {
    private String nome;
    private Double salario;
    private String dataAdmissao;

    static int identificador;

    //---------------

    public void Funcionario(String nome, Double salario, String dataAdmissao, int identificador){
        this.nome = nome;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.identificador = identificador;
    }

    public void Funcionario(int id){
        identificador = id;
    }

    public void mostraFuncionario(){
        System.out.printf("Nome: " + getNome());
        System.out.printf("\nSalário: R$" + getSalario());
        System.out.printf("\nData de admissão: " + getDataAdmissao());
        System.out.printf("\nID exclusivo: " + identificador + "\n\n");
    }
    //---------------

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //----

    public Double getSalario(){
        return this.salario;
    }

    public void setSalario(Double salario){
        if(salario < 700){
            System.out.printf("\n>> AVISO: Não é possível cadastrar um salário abaixo de R$700!\n");
            this.salario = 0.0;
        }else{this.salario = salario;}
    }

    //----

    public String getDataAdmissao(){
        return this.dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        int[] dataExplodida = new int[3];

        String[] dataOriginal = dataAdmissao.split("/",3);

        dataExplodida[0] = Integer.parseInt(dataOriginal[0]);
        dataExplodida[1] = Integer.parseInt(dataOriginal[1]);
        dataExplodida[2] = Integer.parseInt(dataOriginal[2]);

        Calendar dataAtual = Calendar.getInstance();

        int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);
        int mesAtual = dataAtual.get(Calendar.MONTH)+1;
        int anoAtual = dataAtual.get(Calendar.YEAR);

        int ehFuturo = 0;

        if(anoAtual == dataExplodida[2]){ehFuturo = ehFuturo + 1;}
        if(diaAtual > dataExplodida[0] && mesAtual <= dataExplodida[1]){ehFuturo = ehFuturo + 1;}
        //if(mesAtual <= dataExplodida[1]){ehFuturo = ehFuturo + 1;}


        if(ehFuturo == 2) {
            System.out.printf(">>> AVISO: Você não pode admitir alguém em um dia futuro!\n");
        }else{this.dataAdmissao = dataAdmissao;}
    }
}
