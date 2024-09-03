public class Account {

    //Properties Declaration
    private long accountNumber;
    private int balance;

    //Default Constructor
    public Account() {
    }

    //Parametrized Constructor
    public Account(long accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //Getter and Setter Method initialization
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //toString method to display the values
    @Override
    public String toString() {
        return "Account{" +
                "Account Number=" + accountNumber +
                ", Balance=" + balance +
                '}';
    }


    //Deposit Method
    public String Deposit(int i) {
        this.setBalance(this.balance + i);
        return "The amount of " + i + " is deposited successfully.";
    }

    //Withdraw Method
    public void Withdraw(int i) {

        if (i > this.balance) {
            System.out.println("Insufficient Balance");
        } else {
            this.setBalance(this.balance - i);
            System.out.println("The amount of " + i + " is withdrawn successfully.");
            System.out.println("Balance after Withdrawal = " + this.balance);
        }

    }

    //Balance Method
    public int Balance() {
        return this.balance;
    }


    public static void main(String[] args) {

        Account a1 = new Account(41254127L, 50000);
        System.out.println(a1);

        //Calling Balance Method
        System.out.println("Balance Amount: " + a1.Balance());
        System.out.println();

        //Calling Deposit Method
        System.out.println(a1.Deposit(10000));
        System.out.println("Balance after Deposit = " + a1.Balance());
        System.out.println();

        //Calling Withdraw Method
        a1.Withdraw(2000);


    }


}
