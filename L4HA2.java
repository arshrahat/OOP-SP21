package l4ha2;

public class L4HA2 {

    private int balance;
    private int withdraw;
    private int deposit;

    public L4HA2() {
        balance = 500000;

    }

    public L4HA2(int b, int w, int d) {
        balance = b;
        withdraw = w;
        deposit = d;

    }

    
     public void Withdraw(int w) {
          withdraw = w;
    }

    public void Deposit(int d) {
         deposit = d;
    }

    
    
    
    
    
    
    
    
    
    public int Depositmoney() {
        return (balance = deposit + balance);

    }

    public int Withdrawmoney() {

        return (balance = balance - withdraw);
    }
}

    