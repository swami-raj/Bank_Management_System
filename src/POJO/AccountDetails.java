package POJO;

public class AccountDetails {
    private long accountno;

    public long getAccountno() {
        return accountno;
    }

    public void setAccountno(long accountno) {
        this.accountno = accountno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private String username;
    private double balance;

    @Override
    public String toString() {
        return "AccountDetails{" +
                "accountno=" + accountno +
                ", username='" + username + '\'' +
                ", balance=" + balance +
                '}';
    }
}
