import java.util.*;

class Account {
    private String name;
    private int number;
    private double balance;
    public Account(String name, int number, double balance) {
        if (balance <= 0) balance = 1; 
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    
    public int getNumber() { return number; }
    public double getBalance() { return balance; }

    
    public void deposit(double amt) {
        if (amt > 0) balance += amt;
    }

    
    public boolean withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            return true;
        }
        return false; 
    }

    
    public String toString() {
        return "Name: " + name + ", Account Number: " + number + ", Balance: " + balance;
    }
}

class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();

    
    public void add(Account a) {
        accounts.add(a);
    }

    
    public void remove(int num) {
        accounts.removeIf(a -> a.getNumber() == num);
    }

    
    public Account get(int num) {
        for (Account a : accounts) {
            if (a.getNumber() == num) {
                return a;
            }
        }
        return null; 
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Add Account  2. Remove Account  3. Deposit  4. Withdraw  5. Show Account  6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                
                System.out.print("Enter account  name: ");
                String name = sc.next();
                System.out.print("account number: ");
                int num = sc.nextInt();
                System.out.print(" initial balance: ");
                double balance = sc.nextDouble();

                bank.add(new Account(name, num, balance));
                System.out.println("Account added successfully.");

            } else if (choice == 2) {
        
                System.out.print("account number  remove: ");
                int num = sc.nextInt();
                bank.remove(num);
                System.out.println("Account removed successfully.");

            } else if (choice == 3) {
                
                System.out.print(" account number: ");
                int num = sc.nextInt();
                System.out.print(" amount  deposit: ");
                double amount = sc.nextDouble();

                Account a = bank.get(num);
                if (a != null) {
                    a.deposit(amount);
                    System.out.println("Amount deposited successfully.");
                } else {
                    System.out.println("Account not found.");
                }

            } else if (choice == 4) {
                
                System.out.print("account number: ");
                int num = sc.nextInt();
                System.out.print(" Amount  withdraw: ");
                double amount = sc.nextDouble();

                Account a = bank.get(num);
                if (a != null) {
                    if (a.withdraw(amount)) {
                        System.out.println("Amount withdrawn successfully.");
                    } else {
                        System.out.println("Insufficient  amount.");
                    }
                } else {
                    System.out.println("Account not found.");
                }

            } else if (choice == 5) {
        
                System.out.print("account number: ");
                int num = sc.nextInt();

                Account a = bank.get(num);
                if (a != null) {
                    System.out.println(a);
                } else {
                    System.out.println("Account not found.");
                }

            } else if (choice == 6) {
                
                System.out.println("Exiting the program");
                break;
            } else {
                System.out.println("Invalid account");
            }
        }
        sc.close();
    }
}
