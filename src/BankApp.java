import java.util.Scanner;
public class BankApp
{
    public static void main(String[] args)
    {
        AccountService accountService  = new AccountService() ;
        Scanner scanner = new Scanner(System.in);
        int x;
        String accountNumber;
        do {
            System.out.println("Welcome to Bank App v0.1");
            System.out.println("1. Create account \n2. Display all account details \n 3. Search by Account number \n4. Deposit the amount \n 5. Withdraw the amount \n 6.Exit ");
            System.out.print("Please enter your choice: ");
            x = scanner.nextInt() ;
            switch (x) {
                case 1 -> accountService.createAccount();
                case 2 -> {
                    System.out.print("Enter account number that you want to search: ");
                    accountService.getAccountList();
                }
                case 3 -> {
                    System.out.println("Enter the account number: ");
                    accountNumber = scanner.next();
                    accountService.showDetails(accountNumber);
                }
                case 4 -> {
                    System.out.print("Enter the account number: ");
                    accountNumber = scanner.next();
                    accountService.depositMoney(accountNumber);
                }
                case 5 ->{System.out.print("Enter the account number: ");
                    accountNumber = scanner.next();
                    accountService.withdraw(accountNumber);}
                case 6 -> System.out.println("see you.");
            }
        }
        while (x != 6);
    }
}