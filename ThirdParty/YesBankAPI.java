package Design_Pattern_Adaptor.ThirdParty;

public class YesBankAPI {
    public char transfer(String fromPerson, String toPerson, int amount){
        System.out.println("Amount transferred..)");
        return 'D';
    }
    public int checkBalance(String accountDetails){
          //logic for checking balance
        return 1000;
    }

    public char authenticate(String accountDetails){
        // logic for authentication
        return 'Y';
    }
}
