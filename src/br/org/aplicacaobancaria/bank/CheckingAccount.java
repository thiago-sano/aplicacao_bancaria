package br.org.aplicacaobancaria.bank;

import br.org.aplicacaobancaria.domain.user.Client;

public class CheckingAccount extends Account{
    private Double limit;
    private Double availableLimit;


    public CheckingAccount(String accountNumber, Double balance, AccountType accountType, Client client, Branch branch) {
        super(accountNumber, balance, accountType, client, branch);
        this.availableLimit = 100.0;
        this.limit = availableLimit;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public Double getAvailableLimit() {
        return availableLimit;
    }

    public void setAvailableLimit(Double availableLimit) {
        this.availableLimit = availableLimit;
    }

    @Override
    public String toString() {
        return String.format("AGENCIA: %s | CONTA: %s | CPF/CNPJ: %-15s | TIPO: %s | SALDO: %,.2f | LIMITE: R$%,.2f | LIMITE DISPONIVEL: R$%,.2f", getBranch().getNumber(), getAccountNumber(), getClient().getId(), getAccountType().getNome(), getBalance(), getLimit(), getAvailableLimit());

    }
}
