
public class SavingsAccount extends Account {
    public double interest;

    public SavingsAccount(String name, double balance, double interest){
        super(name, balance);
        this.interest = interest;
    }

    public double getInterest(){
        return this.interest;
    }

    public void setInterest(double interest){
        this.interest = interest;
    }

    public void newBalance(){
        this.balance += this.balance * this.interest;
    }
}