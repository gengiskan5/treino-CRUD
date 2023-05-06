package Cadastros;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        PessoaDao pd = new PessoaDao();
        /*
        try {
            //Incluir uma pessoa
            Pessoa p2 = new Pessoa(2, "Jose", "jose@gmail.com");
            Pessoa p3 = new Pessoa(3, "Joao", "joao@gmail.com");
            Pessoa p4 = new Pessoa(4, "Alex", "alex@gmail.com");
            Pessoa p5 = new Pessoa(5, "Maria", "maria@gmail.com");
            pd.incluirPessoa(p2);
            pd.incluirPessoa(p3);
            pd.incluirPessoa(p4);
            pd.incluirPessoa(p5);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        /*
        // Alterar uma pessoa
        Pessoa pes = pd.consultarPessoaIndividual(1);
        if (pes != null){
            pes.setEmail("Jose2@gmail.com");
            // chamar o metodo que contém o comando updated
            pd.alterarPessoa(pes);

            //Listando todas as pessoas
            List<Pessoa> listaPessoas = pd.ListarPessoas();
            for (Pessoa p : listaPessoas){
                System.out.println(p);
            }
        }



        //Excluir uma pessoa
        //verificar se a pessoa existe por código
        Pessoa pes = pd.consultarPessoaIndividual(2);
        // chmara o método que contém o comando delete
        pd.excluirPessoa(pes);
        //Listando todas as pessoas
        List<Pessoa> listaPessoas = pd.ListarPessoas();

        for (Pessoa p : listaPessoas){
            System.out.println(p);
        }



        Pessoa pes1 = pd.consultarPessoaIndividual(1);
        System.out.println("Código ....: " + pes1.getIdPessoa());
        System.out.println("Nome....: " + pes1.getNomePessoa());
        System.out.println("email ....: " + pes1.getEmail());

         */

        List<Pessoa> listaDePessoas = pd.ListarPessoas();
        for (Pessoa p: listaDePessoas
             ) {
            System.out.println("Código...." + p.getIdPessoa());
            System.out.println("Nome...." + p.getNomePessoa());
            System.out.println("email...." + p.getEmail());
            System.out.println("-------------------");

        }
    }




    }
