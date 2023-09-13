package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefas {
    /**************************************************************
     * Objetivo - classe TAREFAS -                                *
     *      Contém os métodos que serão usados pela classe MENU   *
     *      Terão os métodos:                                     *
     *          * CRIAR TAREFAS;                                  *
     *          * ATUALIZAR OU REMOVER TAREFAS;                   *
     *          * LISTAR TAREFAS                                  *
     *          * ATRIBUIR RESPONSÁVEIS (desafio)                 *
    /**************************************************************/

    Scanner teclado = new Scanner(System.in);

    String titulo, descricao, dataVencimento;


    List<Tarefas> listTarefas = new ArrayList<>();


    public Tarefas criarTarefas(){

        Tarefas tarefas = new Tarefas();
        System.out.println("Qual é o nome da tarefa?");
        tarefas.titulo = teclado.nextLine();
        System.out.println("Qual a descrição da tarefa?");
        tarefas.descricao = teclado.nextLine();
        System.out.println("Qual a data de vencimento?");
        tarefas.dataVencimento = teclado.nextLine();

        return tarefas;
    }

    public void adicionarTarefa(Tarefas tarefas){
        listTarefas.add(tarefas);

    }

    public void listarTarefas(){

        for (Tarefas tarefas : listTarefas){
            System.out.println("O nome da tarefa é: " + tarefas.titulo);
            System.out.println("A descrição é: " + tarefas.descricao);
            System.out.println("A data de vencimento é: " + tarefas.dataVencimento);
            System.out.println();
        }
    }

    public void atualizarTarefas(int indice){
        if(indice >= 0 && indice < listTarefas.size()) {
            System.out.println("Digite o número da tarefa que deseja atualizar");
            Tarefas tarefas = listTarefas.get(indice);
            System.out.println("O nome da tarefa que será alterada é: " + tarefas.titulo);
            System.out.println("Informe o novo nome:");
            String novaTarefa = teclado.nextLine();
            tarefas.titulo = novaTarefa;
            listTarefas.set(indice, tarefas);
        }
    }




}
