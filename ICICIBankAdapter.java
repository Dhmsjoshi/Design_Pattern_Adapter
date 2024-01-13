package Design_Pattern_Adaptor;

import Design_Pattern_Adaptor.ThirdParty.ICICIBankAPI;

public class ICICIBankAdapter implements BankAPIAdapter{
    private ICICIBankAPI iciciBankAPI;

    public ICICIBankAdapter() {
        this.iciciBankAPI = new ICICIBankAPI();
    }

    @Override
    public String transfer(String toUserName, String fromUserName, double amount) {
        long fromUSerId = returnIdFromUsername(fromUserName);
        long toUserId = returnIdFromUsername(toUserName);

        return iciciBankAPI.doPayment(toUserId, fromUSerId, amount);
    }

    @Override
    public double checkBalance(String userName) {
        return iciciBankAPI.balance(returnIdFromUsername(userName));
    }

    @Override
    public boolean authenicate(String userName) {
        return iciciBankAPI.checkUser(returnIdFromUsername(userName));
    }

    private long returnIdFromUsername(String userName){
        return 0;
    }


}
