
public class AccountDemo {
    public static void main(String[] args){
        SavingsAccount ac1 = new SavingsAccount("Alan Lyne", 3000, 0.05);
        CheckingAccount ac2 = new CheckingAccount("Venus Chee", 500, 150);

        ac1.deposit(300);
        ac1.newBalance();
        ac1.withdraw(345);
        ac1.setInterest(0.01);

        ac2.withdraw(700);
        ac2.setOverdraft(300);
        ac2.withdraw(750);

        ac2.setCustomerName("Venus Lyne");
        System.out.println(ac2.getCustomerName());

        ac1.printDetails();
        System.out.println("Interest Rate: " + ac1.getInterest());

        ac2.printDetails();
        System.out.println("Overdraft Limit: " + ac2.getOverdraft());
    }
}