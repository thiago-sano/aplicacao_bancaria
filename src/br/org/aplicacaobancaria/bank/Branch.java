package br.org.aplicacaobancaria.bank;

import java.util.Objects;

public class Branch {
    private String number;
    private String name;

    public Branch(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return Objects.equals(getNumber(), branch.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNumber());
    }
}
