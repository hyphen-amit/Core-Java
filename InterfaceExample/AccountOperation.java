package InterfaceExample;

import java.util.Scanner;

public class AccountOperation {

    public static void main(String[] args) {
        CustomerAcc acc= new CustomerAcc(200000, "Tony Stark");
        System.out.println(acc);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw - ");
        int with_amt=sc.nextInt();
        acc.withdraw(with_amt);
        System.out.println("Enter amount to deposit - ");
        int dep_amt=sc.nextInt();
        acc.deposit(dep_amt);

        System.out.println(acc);
    }







}
