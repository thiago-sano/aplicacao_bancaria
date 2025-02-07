package br.org.aplicacaobancaria.bank;

import br.org.aplicacaobancaria.domain.user.Client;

public abstract class Account {
    private String accountNumber;
    private Double balance;
    private AccountType accountType;
    private Client client;
    private Branch branch;

    public Account(String accountNumber, Double balance, AccountType accountType, Client client, Branch branch) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.client = client;
        this.branch = branch;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
