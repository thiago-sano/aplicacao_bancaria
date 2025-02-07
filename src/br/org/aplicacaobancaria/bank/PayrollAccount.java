package br.org.aplicacaobancaria.bank;

import br.org.aplicacaobancaria.domain.user.Client;

public class PayrollAccount extends Account{
    public PayrollAccount(String accountNumber, Double balance, AccountType accountType, Client client, Branch branch) {
        super(accountNumber, balance, accountType, client, branch);
    }
}
