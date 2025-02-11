package br.org.aplicacaobancaria.bank;

import br.org.aplicacaobancaria.domain.user.Client;

public class SavingsAccount extends Account{
    private Double limit;
    private Double availableLimit;

    public SavingsAccount(String accountNumber, Double balance, AccountType accountType, Client client, Branch branch) {
        super(accountNumber, balance, accountType, client, branch);
        this.limit = this.availableLimit = 0.0;
    }

    public Double getLimit() {
        return limit;
    }

    public Double getAvailableLimit() {
        return availableLimit;
    }

    @Override
    public String toString() {
        return String.format("AGENCIA: %s | CONTA: %s | CPF/CNPJ: %-15s | TIPO: %s | SALDO: %,.2f | LIMITE: R$%,.2f | LIMITE DISPONIVEL: R$%,.2f", getBranch().getNumber(), getAccountNumber(), getClient().getId(), getAccountType().getNome(), getBalance(), getLimit(), getAvailableLimit());

    }
}
