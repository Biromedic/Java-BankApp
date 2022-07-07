package Model;

public class Account
{
    private String accountNo ;
    private String accountType ;
    private String accountName ;
    private long balance ;


    public Account(String accountNo, String accountType, String accountName, long balance)
    {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accountName = accountName;
        this.balance = balance;
    }

    public Account(){
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
