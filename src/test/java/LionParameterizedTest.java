import com.example.Feline;
import com.example.Lion;
import org.junit.runners.Parameterized;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class LionParameterizedTest {
   private Lion lionTest = Mockito.mock(Lion.class);
   private Feline feline = Mockito.mock(Feline.class);
   private String sex;
   private Boolean hasMane = true;

    public LionParameterizedTest(String sex , Boolean hasMane)
    {
        this.sex = sex;
        this.hasMane = hasMane;
    }
    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true}
        };
    }
    @Test
    public void testDoesHaveMane() {
        try {
            Lion lion = new Lion(sex,feline);
            boolean actual = lion.doesHaveMane();
            Mockito.when(lionTest.doesHaveMane()).thenReturn(hasMane);
            assertEquals(lionTest.doesHaveMane(),lion.doesHaveMane());
        } catch (Exception ex) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", ex.getMessage());
        }
    }
}