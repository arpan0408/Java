class BankAccount {
    double balance;
    BankAccount(double balance){
        this.balance = balance;
    }

    public synchronized void withdraw(double amount){
        if(balance < amount){
            System.out.println("Balance unsufficient! "+"Current balance: "+balance);
            return;
        }
        balance -= amount;
        System.out.println("Amount withdraw successfuly! "+"Current balance: "+balance);
    }

    public synchronized void deposit(double amount){
        balance += amount;
        System.out.println("Amount successfuly deposit! "+"Current balance: "+balance);
    }
}

class ThreadDemo implements Runnable{
    private BankAccount account;
    ThreadDemo(BankAccount account){
        this.account = account;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName());
        account.deposit(5000);
        try{
            Thread.sleep(500);
        }
        catch(Exception e){
            System.out.println(e);
        }
        account.withdraw(15000);
    }
}

public class Demo{
    public static void main(String[] args){
        BankAccount b1 = new BankAccount(500000.00);
        BankAccount b2 = new BankAccount(5000.00);

        Thread t1 = new Thread(new ThreadDemo(b1));
        Thread t2 = new Thread(new ThreadDemo(b2));
        t1.start();
        t2.start();
    }
}
