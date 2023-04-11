package BankApplication;

public interface Bank {

  int addMoney(int money);
   int withdrawMoney(int password , int amount);
   int checkBalance(int password);
   int roi(int years,int password);



}
