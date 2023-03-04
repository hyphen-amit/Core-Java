package InterfaceExample;

public class CustomerAcc implements Bank{

    private int balance;
    private String name;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerAcc(int balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    @Override
    public void deposit(int amount) {
        balance+=amount;
    }

    @Override
    public void withdraw(int amount) {
        if(balance-amount<=minBalance){
            System.err.println("Insufficient balance!");
        }else{
            balance-=amount;
        }
    }

    @Override
    public String toString() {
        return "CustomerAcc{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                '}';
    }
}
