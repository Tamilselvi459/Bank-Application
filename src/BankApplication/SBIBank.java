package BankApplication;

import java.util.UUID;

public class SBIBank implements Bank {
    private String accountNumber;
    private String name;
    private int balance;
    private int password;


    public SBIBank( String name, int balance, int password) {
        this.accountNumber = UUID.randomUUID().toString();
        this.name = name;
        this.balance = balance;
        this.password = password;
    }

    @Override
    public int addMoney(int money) {
        int a = balance + money;
        System.out.println("Avialable balance is : ");
        return a;
    }

    @Override
    public int withdrawMoney(int password, int amount) {
        if(password==this.password){
            if(amount<balance) {
                int bal = balance - amount;
                System.out.println("Amount withdrawn successfully.Available balance is ");
                return bal;
            }
            else System.out.println("Not availabke balance !! please check the balance");
            return 0;
        }
        System.out.println("password is incorrect");
        return 0;
    }

    @Override
    public int checkBalance(int password) {
        if(this.password == password){
            return balance;
        }
        return -1;
    }

    @Override
    public int roi(int years , int password) {
        return (balance * 5 *years)/100;
    }
}
