package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
    /**Objetivo - Classe MENU -
    *  Chamar as outras classes que possuem os métodos de:
    *      CRIAR, ATUALIZAR OU REMOVER, LISTAR TAREFAS
    *  Ou seja: inicia o programa, permitindo o usuário escolher
    *           o que ele quer fazer dentro do sistema*/
    /***************************************************************/

        Scanner teclado = new Scanner(System.in);

       Tarefas objTarefa = new Tarefas();


        public void Menu(){
            System.out.println("--- Bem-vindo(a) ao Sistema Gerenciador de Tarefas! ---");

            boolean valida = true;

            while (valida) {

                System.out.println("O que deseja fazer? \n" +
                        "[1 - Criar tarefas]\n" +
                        "[2 - Listar tarefas]\n" +
                        "[3 - Atualizar tarefas]\n" +
                        "[4 - Remover tarefas]\n" +
                        "[5 - Sair]");
                int resposta = teclado.nextInt();
                teclado.nextLine();
                System.out.println();


                switch (resposta) {
                    case 1:
                        Tarefas tarefa = objTarefa.criarTarefas();
                        objTarefa.adicionarTarefa(tarefa);
                        System.out.println("Tarefa criada com sucesso!!");
                        System.out.println();
                        break;

                    case 2:
                        objTarefa.listarTarefas();
                        System.out.println();
                        break;

                    case 3:
                        objTarefa.listarTarefas();
                        int indice = teclado.nextInt() -1;
                        teclado.nextLine();
                        objTarefa.atualizarTarefas(indice);
                        break;


                    case 4:


                    case 5:

                }
            }

        }


}
