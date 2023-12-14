package Services;

import Exception.insufficientBalanceException;
import POJO.AccountDetails;
import Exception.InvalidAmount;


public interface BankAccounts {
    public  void init(AccountDetails accountDetails);
    public void deposit(double amount) throws InvalidAmount;
    public void withdraw(double amount) throws InvalidAmount, insufficientBalanceException;
    public void balancenquery();
    public void moneytransfer(BankAccounts account ,double amount) throws InvalidAmount, insufficientBalanceException;
}
