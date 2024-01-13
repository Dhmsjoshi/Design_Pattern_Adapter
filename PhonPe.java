package Design_Pattern_Adaptor;

import Design_Pattern_Adaptor.ThirdParty.ICICIBankAPI;
import Design_Pattern_Adaptor.ThirdParty.YesBankAPI;

public class PhonPe {

    private BankAPIAdapter bankAPIAdapter ;

    public PhonPe() {
        bankAPIAdapter = new YesBankAdapter();

    }

    public String transferMoney(String fromUserName, String toUserName, double amount){
        String result = bankAPIAdapter.transfer(fromUserName, toUserName,amount);
        return result;
    }

    public double checkBalance(String userName){
        return bankAPIAdapter.checkBalance(userName);

    }

    public boolean logIn(String userName){
        return bankAPIAdapter.authenicate(userName);
    }
}
