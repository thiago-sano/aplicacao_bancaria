package br.org.aplicacaobancaria.domain.user;

public class Business extends Client{
    private Double statedCapital;
    private ClientType clientType;

    public Business(String name, String email, String id, Double statedCapital) {
        super(name, email, id);
        this.statedCapital = statedCapital;
        this.clientType = ClientType.BUSINESS;
    }

    public Double getStatedCapital() {
        return statedCapital;
    }

    public void setStatedCapital(Double statedCapital) {
        this.statedCapital = statedCapital;
    }

    public ClientType getClientType() {
        return clientType;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s - Email: %s - CNPJ: %s - Capital: %,.2f - Tipo: %s", getName(), getEmail(), getId(), getStatedCapital(), getClientType().getNome());
    }
}
