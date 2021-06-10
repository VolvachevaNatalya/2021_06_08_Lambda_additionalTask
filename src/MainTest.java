import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    List<Account> accountList = Arrays.asList(
            new Account("1", 12000L, false),
            new Account("2", -5000L, true),
            new Account("3", 12000L, false),
            new Account("4", -2000L, false)
    );
    @Test
    public void test_ok_res() {
        assertEquals(4, accountList.size());
        assertEquals(2, Main.filter(accountList).size());
    }

    @Test
    public void test_add_one_negative() {
        List<Account> accountList = Arrays.asList(
                new Account("1", 12000L, true)
        );
        assertTrue(Main.filter(accountList).isEmpty());
    }

    @Test
    public void test_add_one_positive() {
        List<Account> accountList = Arrays.asList(
                new Account("1", 12000L, false)
        );
        assertFalse(Main.filter(accountList).isEmpty());
        assertEquals(1, Main.filter(accountList).size());
    }

    @Test
    public void test_add_several_negative() {
        List<Account> accountList = Arrays.asList(
                new Account("1", 12000L, true),
                new Account("1", -5000L, false),
                new Account("1", 12000L, true)
        );
        assertTrue(Main.filter(accountList).isEmpty());
    }
}