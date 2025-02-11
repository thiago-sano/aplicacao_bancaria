package br.org.aplicacaobancaria.bank;

import br.org.aplicacaobancaria.domain.user.Client;

import java.util.*;

public class BankingSystem {

    Map<String, String> branches = new TreeMap<>();
    Set<Client> clients = new HashSet<>();

    public BankingSystem() {
    }

    public void registerBranch(Branch branch){
        branches.put(branch.getName(), branch.getNumber());
    }

    public void listBranches(){
        for (String key : branches.keySet()){
            System.out.println(String.format("%s : %s", key, branches.get(key).toUpperCase()));
        }
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
    }

    public List<Account> listAccounts(String number){
        return null;
    }
}
