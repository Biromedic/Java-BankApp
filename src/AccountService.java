import Model.Account;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountService
{
    static List<Account> accountList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public AccountService() {
    }

    public void createAccount()
    {
        System.out.print("Enter account no:");
        String accountNo = scanner.next();
        System.out.print("Enter account type:");
        String accountType = scanner.next() ;
        System.out.print("Enter who has the account:");
        String accountName = scanner.next();
        System.out.print("Enter account balance:");
        long balance = scanner.nextLong() ;

        Account account = new Account(accountNo,accountType,accountName,balance);
        accountList.add(account);
    }

    public void showDetails(String accountNo)
    {
        Account foundAccount = findAccountByNo(accountNo);

        System.out.println(foundAccount.getAccountName()+ " is the owner");
        System.out.println(foundAccount.getAccountType()+ " is the type of the account");
        System.out.println("Balance: " + foundAccount.getBalance());
    }

    public void depositMoney(String accountNo)
    {
        Account foundAccount = findAccountByNo(accountNo);
        Scanner scanner = new Scanner(System.in) ;
        long money = scanner.nextLong();
        foundAccount.setBalance(foundAccount.getBalance() + money);
    }

    public void withdraw(String accountNo)
    {
        long moneyWithdraw;

        for (Account account: accountList )
        {

            if(account.getAccountNo().equals(accountNo))
            {
                System.out.print("The money you want to withdraw: ");
                moneyWithdraw = scanner.nextLong();
                if (moneyWithdraw > account.getBalance())
                {
                    System.out.println("Your balance is not enough to withdraw money");
                }
                else
                {
                    account.setBalance(account.getBalance() - moneyWithdraw);  // setter getter kullanımı
                    System.out.println("New balance is : " + account.getBalance());
                }
            }
        }

    }

    public void getAccountList()
    {
        for(Account account : accountList )
        {
            System.out.println("Account number is " + account.getAccountNo() );
            System.out.println(account.getAccountName()+ " is the owner");
            System.out.println(account.getAccountType()+ " is the type of the account");
            System.out.println("Balance: " + account.getBalance());
            System.out.println("********************************************************");
        }
    }

    public Account findAccountByNo(String accountNo)
    {
        for (Account account: accountList )
        {
            if(account.getAccountNo().equals(accountNo))
            {
                return account ;
            }
        }
        return null ;
    }
}
