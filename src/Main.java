import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Account> accountList = Arrays.asList(
                new Account("1", 12000L, false),
                new Account("2", -5000L, true),
                new Account("3", 12000L, false),
                new Account("4", -2000L, false)
        );

        System.out.println(filter(accountList));
    }

    public static List<Account> filter(List<Account> accountList) {
        UnaryOperator<List<Account>> newAcc = (n) -> (Filter.filter(n));
        return (newAcc.apply(accountList));
    }
}
