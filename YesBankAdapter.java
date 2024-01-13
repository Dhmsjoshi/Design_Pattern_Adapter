package Design_Pattern_Adaptor;

import Design_Pattern_Adaptor.ThirdParty.YesBankAPI;

public class YesBankAdapter implements BankAPIAdapter {
    private YesBankAPI yesBankAPI;

    public YesBankAdapter() {
        this.yesBankAPI = new YesBankAPI();
    }

    @Override
    public String transfer(String toUserName, String fromUserName, double amount) {
        char result = yesBankAPI.transfer(toUserName, fromUserName, (int)amount);
        if(result=='D'){
            return "Success";
        }else{
            return "Failure";
        }
    }

    @Override
    public double checkBalance(String userName) {
        return yesBankAPI.checkBalance(userName);
    }

    @Override
    public boolean authenicate(String userName) {
        return yesBankAPI.authenticate(userName)=='Y'?true:false;
    }
}
