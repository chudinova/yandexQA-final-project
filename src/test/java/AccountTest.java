
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AccountTest {
    private final String name;
    private final boolean expected;


    public AccountTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Тестовые данные: имя \"{0}\", результат - {1}")
        public static Object[][] getName() {
            return new Object[][] {
                    {"a a", true},
                    {"A a", true},
                    {"Name Surename", true},
                    {"name surename", true},
                    {"NAME SURENAME", true},
                    {"Name Surenameeeeeee", true},
                    {"Name Surenameeeeeeee", false},
                    {"a", false},
                    {"aa", false},
                    {" namesurename", false},
                    {"namesurename ", false},
                    {"name sure name", false},
                    {"namesurenamenamesurename namesurename", false},
            };
        }

        @Test
        public void checkNameToEmbossTest() {
            Account account = new Account(name);
            boolean actual = account.checkNameToEmboss();
            assertEquals(expected, actual);

    }
}