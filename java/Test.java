class Account {
    private int balance;

    public void setBalance(int b){
        balance = b;
    }

    public int getBalance(){
        return balance;
    }
}

public class Test {
    public static void main(String args[]){
        Account acc = new Account();
System.out.println(acc.getBalance());
        acc.setBalance(5000);  // setting value
        System.out.println(acc.getBalance());  // printing value
    }
}
