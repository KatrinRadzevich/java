package org.example.OOP.Lesson1.ClassWork.Ex2;

public class CreditAccount extends Account{
    private Double prossent;

    public CreditAccount(Integer numAccount, String owner, Double balance, Double prossent) {
        super(numAccount, owner, balance);
        this.prossent = prossent;
    }

    public CreditAccount(Double prossent) {
        this.prossent = prossent;
    }

    public CreditAccount() {
    }
    protected void calculateInterests() {
        Double result = getBalance() + prossent / 100;
        withdraw(result);
    }
}
