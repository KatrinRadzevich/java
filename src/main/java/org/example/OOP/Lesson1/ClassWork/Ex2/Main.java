package org.example.OOP.Lesson1.ClassWork.Ex2;

public class Main {
    public static void main(String[] args) {
        CreditAccount creditAccount = new CreditAccount(12, "Ivan", 12.3, 0.5);
        SavingAccount savingAccount = new SavingAccount(10, "qwe", 1000.0, 10.0);
        System.out.println("creditAccount.getBalance() = " + creditAccount.getBalance());
        creditAccount.calculateInterests();
        System.out.println("creditAccount.getBalance() = " + creditAccount.getBalance());
        savingAccount.addInterest();
        System.out.println("savingAccount.getBalance() = " + savingAccount.getBalance());
    }
}
