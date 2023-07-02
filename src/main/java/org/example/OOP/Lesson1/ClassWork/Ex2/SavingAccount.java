package org.example.OOP.Lesson1.ClassWork.Ex2;

public class SavingAccount extends Account{
    private Double savingProssent;

    public SavingAccount(Integer numAccount, String owner, Double balance, Double savingProssent) {
        super(numAccount, owner, balance);
        this.savingProssent = savingProssent;
    }

    public SavingAccount() {
    }

    protected void addInterest() {
      Double result = getBalance() * savingProssent / 100;
deposit(result);
    }
}
