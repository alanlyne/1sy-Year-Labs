
public class CheckingAccount extends Account {
    public double overdraft;

    public CheckingAccount(String name, double bal, double overdraft){
        super(name, bal);
        this.overdraft = overdraft;
    }

    public double getOverdraft(){
        return this.overdraft;
    }

    public void setOverdraft(double over){
        this.overdraft = over;
    }

    public void withdraw(double val){
        if(val > this.balance + this.overdraft){
            System.out.println("Exceeds overdraft limit");
        }else{
            this.balance -= val;
        }
    }
}