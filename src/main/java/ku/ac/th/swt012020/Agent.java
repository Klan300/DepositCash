package ku.ac.th.swt012020;
import java.util.Arrays;

public class Agent {

    private float maximumDepositPerTime = 30000.00f;
    private float maximumDepositPerDay = 50000.00f;
    private String[] Account = {"123456789","234567890" , "345678901"};
    private String[] InvalidAccount = {"234567890" , "345678901"};

    private float getMinimumDeposit(String depositType) {
        if (depositType == "cash") {
            return 100.00f;
        }
        return 0.00f;
    }

    public boolean canDepositPerTransaction(float depositCash) {
        return depositCash <= this.maximumDepositPerTime;
    }

    public boolean canDepositPerDay(float depositCash) {
        return  depositCash <= this.maximumDepositPerDay;
    }

    public boolean isValidAccount(String accountId) {
        return Arrays.asList(this.Account).contains(accountId) && !Arrays.asList(this.InvalidAccount).contains(accountId);
    }

    public boolean overMinimumPerTransaction(String Type,float depositCash){
        return depositCash >= this.getMinimumDeposit(Type);
    }

}


