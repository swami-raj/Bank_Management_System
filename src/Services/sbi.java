package Services;

import POJO.AccountDetails;

public class sbi implements BankAccounts{
    private long accountno;
    private String username;
    private double balance;

    @Override
    public void init(AccountDetails accountDetails) {

    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) {

    }

    @Override
    public void balancenquery() {

    }

    @Override
    public void moneytransfer(BankAccounts account,double amount) {

    }
}
