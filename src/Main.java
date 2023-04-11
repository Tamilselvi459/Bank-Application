import BankApplication.Bank;
import BankApplication.SBIBank;

public class Main {
    public static void main(String[] args) {

       Bank SBIbank = new SBIBank( "TAM" , 1000 , 123);
      System.out.println( SBIbank.addMoney(100));
      System.out.println(SBIbank.withdrawMoney(123,2000));
      System.out.println(SBIbank.roi(5,123));
      System.out.println(SBIbank.checkBalance(123));
    }
}