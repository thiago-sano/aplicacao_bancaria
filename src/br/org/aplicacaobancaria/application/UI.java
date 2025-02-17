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

    public static void printMainMenu() {
        clearScreen();
        int option = 0;
        while (option != 3){
            System.out.println("MENU PRINCIPAL");
            System.out.println("1 - ACESSO AGENCIA");
            System.out.println("2 - ACESSO CLIENTE");
            System.out.println("3 - SAIR");
            System.out.print("Digite uma opcao: ");
            option = readMenuOption();
            switch (option){
                case 1: {
                    printBranchMenu();
                    return;
                }
                case 2: {
                    printClientMenu();
                    return;
                }
                case 3: {
                    System.out.println("\nATE LOGO!!");
                    exit(0);
                }
                default:{
                    System.out.println("OPCAO INVALIDA\n");
                    break;
                }
            }
        }
    }


    public static void printBranchMenu(){
        clearScreen();
        int option = 0;
        while (option != 3){
            System.out.println("\nACESSO DE AGENCIA");
            System.out.println("1 - CADASTRAR CONTA");
            System.out.println("2 - ALTERAR LIMITE");
            System.out.println("3 - VOLTAR");
            System.out.print("Digite uma opcao: ");
            option = readMenuOption();
            switch (option){
                case 1: {
                    System.out.println("\nCADASTRO DE CONTA");
                    return;
                }
                case 2: {
                    System.out.println("\nALTERACAO DE LIMITE");
                    return;
                }
                case 3: {
                    System.out.println();
                    printMainMenu();
                    return;
                }
                default:{
                    System.out.println("OPCAO INVALIDA\n");
                    break;
                }
            }
        }

    }

    public static void printClientMenu(){
        clearScreen();
        int option = 0;
        while (option != 3){
            System.out.println("\nACESSO DE CLIENTES");
            System.out.println("1 - EXIBIR INFORMACOES DA CONTA");
            System.out.println("2 - DEPOSITO");
            System.out.println("3 - SAQUE");
            System.out.println("4 - SOLICITAR ALTERACAO DE LIMITE");
            System.out.println("5 - TRANSFERENCIA");
            System.out.println("6 - EXTRATO");
            System.out.println("7 - VOLTAR");
            System.out.print("Digite uma opcao: ");
            option = readMenuOption();
            switch (option) {
                case 1: {
                    System.out.println("\nINFORMACOES DA CONTA");
                    return;
                }
                case 2: {
                    System.out.println("\nDEPOSITO");
                    return;
                }
                case 3: {
                    System.out.println("\nSAQUE");
                    return;
                }
                case 4: {
                    System.out.println("\nALTERACAO DE LIMITE");
                    return;
                }
                case 5: {
                    System.out.println("\nTRANSFERENCIA");
                    return;
                }
                case 6: {
                    System.out.println("\nEXTRATO");
                    return;
                }
                case 7: {
                    System.out.println();
                    printMainMenu();
                    return;
                }
                default: {
                    System.out.println("OPCAO INVALIDA\n");
                    break;
                }
            }
        }
    }

    public static int readMenuOption(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
