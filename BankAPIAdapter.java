package Design_Pattern_Adaptor;

public interface BankAPIAdapter {
    public String transfer(String toUserName, String fromUserName, double amount);
    public double checkBalance(String userName);
    public boolean authenicate(String userName);
}
