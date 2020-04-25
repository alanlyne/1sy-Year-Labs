
public class Account {
    protected String customerName;
    protected double balance;
    protected int accountID;

    private static int counter = 1001;

    public Account(String name, double balance){
        this.customerName = name;
        if(balance > 0){
            this.balance = balance;
        }else{
            this.balance = 0;
        }
        this.accountID = counter++;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setCustomerName(String name){
        this.customerName = name;
    }

    public double getBalance(){
        return this.balance;
    }

    public int getAccountID(){
        return this.accountID;
    }

    public void deposit(double val){
        this.balance += val;
    }

    public void withdraw(double val){
        if(val > this.balance){
            System.out.println("Exceeds a/c limit");
        }else{
            this.balance -= val;
        }
    }
    public void printDetails(){
        System.out.println("A/C Name: " + this.customerName);
        System.out.println("A/C Number: " + this.accountID);
        System.out.println("Balance: " + this.balance);
    }
}
