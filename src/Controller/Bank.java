package Controller;
import POJO.AccountDetails;
import Services.BankAccounts;
import Services.hdfc;

import java.util.Objects;
import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Bank account name");
            String bankaccount= sc.next();
            try {
                Class<?>cla=Class.forName(bankaccount);
                Object obj =cla.newInstance();
                BankAccounts bankAccount1=(BankAccounts) obj;
                AccountDetails accountDetails=new AccountDetails();
                System.out.println("Enter account number");
                accountDetails.setAccountno(sc.nextLong());
                System.out.println("Enter username");
                accountDetails.setUsername(sc.next());
                System.out.println("Enter balance");
                accountDetails.setBalance(sc.nextLong());
                bankAccount1.init(accountDetails);
                System.out.println("Welcome you can start your transaction");
                while(true){
                    int option;
                    System.out.println("choose Options");
                    System.out.println("Enter 1 to deposit");
                    System.out.println("enter 2 to withdraw");
                    System.out.println("enter 3 to balance enquery");
                    System.out.println("enter 4 to money transfer");
                    option=sc.nextInt();
                    switch (option){
                        case 1:
                            System.out.println("Enter amount to deposit:");
                            double depositAmount = sc.nextDouble();
                            try {
                                bankAccount1.deposit(depositAmount);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2:
                            System.out.println("Enter amount to withdraw:");
                            double withdrawAmount = sc.nextDouble();
                            try {
                                bankAccount1.withdraw(withdrawAmount);
                            } catch ( Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 3:
                            bankAccount1.balancenquery();
                            break;
                        case 4:
                            System.out.println("Enter amount to transfer:");
                            double transferAmount = sc.nextDouble();
                            try {
                                bankAccount1.moneytransfer(bankAccount1, transferAmount);
                            } catch ( Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;

                        default:
                            System.out.println("Invalid option");
                            break;
                    }
                }

            }catch (ClassNotFoundException e){
                System.out.println(bankaccount +"class file not found");
            }
            catch(IllegalAccessException ex){
                throw new RuntimeException(ex);
            }
            catch (InstantiationException ex){
                throw new RuntimeException(ex);
            }
        }
    }
}
