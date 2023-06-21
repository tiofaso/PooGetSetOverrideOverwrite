package Exercicio03;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        //Gerando identificadores únicos para os funcionários
        List<String> idFuncionario = new ArrayList<String>();
        String dataString;

        //FUNCIONÁRIO 1
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Fábio Luiz Sousa Vaz");
        funcionario1.setSalario(2000.0);

        funcionario1.setDataAdmissao("2/5/2023");
        idFuncionario.add(funcionario1.getNome());
        funcionario1.Funcionario(idFuncionario.indexOf("Fábio Luiz Sousa Vaz"));
        funcionario1.mostraFuncionario();

        //--

        //FUNCIONÁRIO 2
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Elisangela Ferreira de Miranda");
        funcionario2.setSalario(4000.0);
        funcionario2.setDataAdmissao("23/12/2015");
        idFuncionario.add(funcionario2.getNome());
        funcionario2.Funcionario(idFuncionario.indexOf("Elisangela Ferreira de Miranda"));
        funcionario2.mostraFuncionario();

        //--

        //FUNCIONÁRIO 3
        Funcionario funcionario3 = new Funcionario();
        funcionario3.setNome("Gustavo de Miranda Sousa");
        funcionario3.setSalario(6000.0);
        funcionario3.setDataAdmissao("20/7/2018");
        idFuncionario.add(funcionario3.getNome());
        funcionario3.Funcionario(idFuncionario.indexOf("Gustavo de Miranda Sousa"));
        funcionario3.mostraFuncionario();

        //FUNCIONÁRIO 4
        Funcionario funcionario4 = new Funcionario();
        funcionario4.setNome("Eustáquio Pimenta Neves");
        funcionario4.setSalario(699.0);
        funcionario4.setDataAdmissao("13/10/2022");
        idFuncionario.add(funcionario4.getNome());
        funcionario4.Funcionario(idFuncionario.indexOf("Eustáquio Pimenta Neves"));
        funcionario4.mostraFuncionario();

        //FUNCIONÁRIO 5
        Funcionario funcionario5 = new Funcionario();
        funcionario5.setNome("Aliamara de Jesus dos Santos");
        funcionario5.setSalario(6000.0);
        funcionario5.setDataAdmissao("15/8/2023");
        idFuncionario.add(funcionario5.getNome());
        funcionario5.Funcionario(idFuncionario.indexOf("Aliamara de Jesus dos Santos"));
        funcionario5.mostraFuncionario();
    }
}

