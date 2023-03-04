package InterfaceExample;

public interface Bank {

    public static final int minBalance=5000;
    public static final int withdrawLimit=30000;

    void deposit(int amount);
    void withdraw(int amount);

}
