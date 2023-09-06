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

        Tarefas tarefas = new Tarefas();

        public void Menu(){
            System.out.println("--- Bem-vindo(a) ao Sistema Gerenciador de Tarefas! ---");
            System.out.println("O que deseja fazer? \n" +
                    "[1 - Criar tarefas]\n" +
                    "[2 - Atualizar tarefas]\n" +
                    "[3 - Remover tarefas]\n" +
                    "[4 - Listar tarefas]");
            int resposta = teclado.nextInt();
            teclado.nextLine();

            switch (resposta){
                case 1:
                    tarefas.criarTarefas(tarefas);
                    break;
            }
        }


}
