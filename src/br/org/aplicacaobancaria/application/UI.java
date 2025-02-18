package br.org.aplicacaobancaria.application;

import java.util.Scanner;

import static java.lang.System.exit;

public class UI {

    Scanner sc = new Scanner(System.in);
    public UI() {
    }

    // https://stackoverflow.com/questions/2979383/java-clear-the-console
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int printMainMenu() {
        clearScreen();
        int option = 0;
        System.out.println("MENU PRINCIPAL");
        System.out.println("1 - ACESSO AGENCIA");
        System.out.println("2 - ACESSO CLIENTE");
        System.out.println("3 - SAIR");
        System.out.print("Digite uma opcao: ");
        option = readMenuOption();
        return option;
    }


    public static int printBranchMenu(){
        clearScreen();
        int option = 0;
        System.out.println("\nMENU PRINCIPAL / ACESSO DE AGENCIA");
        System.out.println("1 - CADASTRAR CONTA");
        System.out.println("2 - ALTERAR LIMITE");
        System.out.println("3 - VOLTAR");
        System.out.print("Digite uma opcao: ");
        option = readMenuOption();
        return option;
    }

    public static int printClientMenu(){
        clearScreen();
        int option = 0;
        System.out.println("\nMENU PRINCIPAL / ACESSO DE CLIENTES");
        System.out.println("1 - EXIBIR INFORMACOES DA CONTA");
        System.out.println("2 - DEPOSITO");
        System.out.println("3 - SAQUE");
        System.out.println("4 - SOLICITAR ALTERACAO DE LIMITE");
        System.out.println("5 - TRANSFERENCIA");
        System.out.println("6 - EXTRATO");
        System.out.println("7 - VOLTAR");
        System.out.print("Digite uma opcao: ");
        option = readMenuOption();
        return option;
    }

    public static int readMenuOption(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
