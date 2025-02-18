package br.org.aplicacaobancaria.application;

import br.org.aplicacaobancaria.bank.Branch;

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
        System.out.println("1 - ACESSO DE BANCO"); // OK
        System.out.println("2 - ACESSO DE AGENCIA"); //
        System.out.println("3 - ACESSO DE CLIENTE");
        System.out.println("4 - SAIR");
        System.out.print("Digite uma opcao: ");
        option = readMenuOption();
        return option;
    }

    public static int printBankMenu(){
        clearScreen();
        int option = 0;
        System.out.println("\nMENU PRINCIPAL / ACESSO DE BANCO");
        System.out.println("1 - CADASTRAR AGENCIA");
        System.out.println("2 - LISTAR AGENCIA");
        System.out.println("3 - VOLTAR");
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

    public static Branch printBranchRegister(){
        Scanner sc = new Scanner(System.in);
        System.out.print("NUMERO DA AGENCIA: ");
        String branchNumber = sc.next();
        System.out.print("NOME DA AGENCIA: ");
        String branchName = sc.next();
        return new Branch(branchNumber, branchName);
    }
    public static int readMenuOption(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
