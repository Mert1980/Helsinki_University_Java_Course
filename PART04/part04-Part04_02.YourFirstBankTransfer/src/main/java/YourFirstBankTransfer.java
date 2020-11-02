
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account accountMatthew = new Account("Matthews account", 1000);
        Account accountMert = new Account("My account", 0);
        
        accountMatthew.withdrawal(100);
        accountMert.deposit(100);
        
        System.out.println(accountMatthew);
        System.out.println(accountMert);
    }
}
