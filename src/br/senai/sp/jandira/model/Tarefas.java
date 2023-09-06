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

    String titulo, descricao;

    int dataVencimento;

    List<Tarefas> tarefa = new ArrayList<>();

    public void criarTarefas(Tarefas tarefas){
        System.out.println("Qual é o nome da tarefa?");
        titulo = teclado.nextLine();
        System.out.println("Qual a descrição da tarefa?");
        descricao = teclado.nextLine();
        System.out.println("Qual a data de vencimento?");
        dataVencimento = teclado.nextInt();
        teclado.nextLine();
        tarefa.add(tarefas);
        System.out.println();
    }




}
