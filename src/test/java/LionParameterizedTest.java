import com.example.Feline;
import com.example.Lion;
import org.junit.runners.Parameterized;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private Feline feline = Mockito.mock(Feline.class);
    private String sex;
    private Boolean hasMane = true;

    public LionParameterizedTest(String sex, Boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true},
                {"оно", null}
        };
    }

    @Test
    public void testDoesHaveMane() {
        try {
            Lion lion = new Lion(sex, feline);
            assertEquals(hasMane, lion.doesHaveMane());
        } catch (Exception ex) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", ex.getMessage());
        }
    }
}