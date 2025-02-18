package br.org.aplicacaobancaria.bank;

import br.org.aplicacaobancaria.domain.user.Client;

import java.util.*;

public class BankingSystem {

    Map<String, String> branches = new TreeMap<>();
    List<Account> accounts = new ArrayList<>();
    Set<Client> clients = new HashSet<>();

    public BankingSystem() {
    }

    public void registerBranch(Branch branch){
        branches.put(branch.getNumber(), branch.getName());
    }

    public void listBranches(){

        for (String key : branches.keySet()){
            System.out.println(String.format("%-5s - %s", key, branches.get(key).toUpperCase()));
        }
    }

    public boolean branchLogin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nMENU PRINCIPAL / LOGIN DE AGENCIA");
        System.out.print("INFORME A AGENCIA: ");
        String number = sc.next();

        boolean exists = checkBranch(number);
        if (exists) {
            System.out.println("A filial " + number + " existe.");
        } else {
            System.out.println("A filial " + number + " não existe.\n");
        }
        return exists;
    }

    public void registerClient(Client client){
        clients.add(client);
    }

    public void listClients(){
        for (Client client : clients){
            System.out.println(client);
        }
    }

    public void registerAccount(Account account){
        accounts.add(account);
    }

    public void listAccounts(){
        for (Account account : accounts){
            System.out.println(account);
        }
    }

    public boolean checkBranch(String number){
        return branches.containsKey(number);
    }
}

