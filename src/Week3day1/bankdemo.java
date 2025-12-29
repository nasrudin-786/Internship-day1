package Week3day1;

public class bankdemo {
    static int balance=300000000;

    static void withdraw(int amount)throws IBE{
        if(amount>balance){
            throw new IBE("Not enough balance to withdraw");
        }
        balance-=amount;
        System.out.println("Withdraw successful");
    }

    public static void main(String [] args){
        try {
            withdraw(50000);
        }
        catch (IBE e){
            System.out.println(e.getMessage());
        }
    }
}
