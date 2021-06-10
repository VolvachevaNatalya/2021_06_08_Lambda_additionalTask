import java.util.ArrayList;
import java.util.List;

public class Filter {

    public static List<Account> filter(List<Account> accounts) {
        List<Account> newAccount=new ArrayList<>();
        for (Account account : accounts) {
            if(account.getBalance() > 0 && !account.isLocked()) {
                newAccount.add(account);
            }

        }
return newAccount;
    }
}
