package Design_Pattern_Adaptor.ThirdParty;

public class ICICIBankAPI {
    public String doPayment(long fromId, long toId, double amount){
        System.out.println("Amount transferred..)");
        return "Success";
    }
    public double balance(long accountId){
        //logic for checking balance
        return 1000;
    }

    public boolean checkUser(long accountId){
        // logic for authentication
        return true;
    }
}
