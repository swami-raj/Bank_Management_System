package Services;

import POJO.AccountDetails;
import Exception.InvalidAmount;
import Exception.insufficientBalanceException;

public class sbi implements BankAccounts{
    private long accountno;
    private String username;
    private double balance;

    @Override
    public void init(AccountDetails accountDetails) {
        this.accountno=accountDetails.getAccountno();
        this.username=accountDetails.getUsername();
        this.balance=accountDetails.getBalance();
        System.out.println("SBI rocket");
    }

    @Override
    public void deposit(double amount)throws InvalidAmount {
        if(amount<=0){
            throw new InvalidAmount("Enter amount grater than 0");
        }
        balance=balance+amount;
        System.out.println("Amount debited from SBI");

    }

    @Override
    public void withdraw(double amount) throws InvalidAmount,insufficientBalanceException {
        if(amount<=0){
            throw new InvalidAmount("Enter amount grater than 0");
        }
        if(amount>balance){
            throw new insufficientBalanceException("Insufficient balance");
        }
        balance=balance-amount;
        System.out.println("Amount debited from SBI");

    }

    @Override
    public void balancenquery() {
        System.out.println(balance);
        System.out.println("Operation Done on SBI");
    }

    @Override
    public void moneytransfer(BankAccounts account,double amount)throws InvalidAmount,insufficientBalanceException {
        withdraw(amount);

        deposit(amount);
        System.out.println("Operation done on SBI Account");

    }
}
