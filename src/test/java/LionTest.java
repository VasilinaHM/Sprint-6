import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    Feline kitten = new Feline();
    Lion alexLion;
    {
        try {
            alexLion = new Lion("Самец", kitten);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    Lion lionFemale;
    {
        try {
            lionFemale = new Lion("Самка", kitten);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void getKittens() {
        Assert.assertEquals(alexLion.getKittens(), 1);
    }
    @Test
    public void doesHaveManeTrue() {
        try {
            Assert.assertEquals(alexLion.doesHaveMane(), true);
        } catch (Exception e) {
            System.out.println("Получено значение, отличное от ожидаемого");
        }
    }
    @Test
    public void doesHaveManeFalse() {
        try {
            Assert.assertEquals(lionFemale.doesHaveMane(), false);
        } catch (Exception e) {
            System.out.println("Получено значение, отличное от ожидаемого");
        }
    }
    @Test
    public void getFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, alexLion.getFood());
    }
}