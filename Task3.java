import java.util.Scanner;

class Account {
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class ATM {
    Account acc;

    public ATM(Account acc) {
        this.acc = acc;
    }

    public void withdraw(double amount) {
        if (acc.withdraw(amount)) {
            System.out.println("Withdrawal successful! Remaining balance: Rs" + acc.getBalance());
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void deposit(double amount) {
        acc.deposit(amount);
        System.out.println("Deposit successful! New balance: Rs" + acc.getBalance());
    }

    public void checkBalance() {
        System.out.println("Current balance: Rs" + acc.getBalance());
    }

    public void showMenu() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }
}

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account userAcc = new Account(1000);
        ATM atm = new ATM(userAcc);

        while (true) {
            atm.showMenu();
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to withdraw: Rs");
                double amount = sc.nextDouble();
                atm.withdraw(amount);
            } else if (choice == 2) {
                System.out.print("Enter amount to deposit: Rs");
                double amount = sc.nextDouble();
                atm.deposit(amount);
            } else if (choice == 3) {
                atm.checkBalance();
            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
