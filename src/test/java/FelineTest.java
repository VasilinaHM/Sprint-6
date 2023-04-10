
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {
    Feline kitten = new Feline();
    @Test
    public void testEatMeat() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, kitten.eatMeat());
    }
    @Test
    public void testGetFamily() {
        Assert.assertEquals(kitten.getFamily(), "Кошачьи");
    }

    @Test
    public void testGetKittens() {
        Assert.assertEquals(kitten.getKittens(), 1);
    }

    @Test
    public void testGetKittensWithParam() {
        Assert.assertEquals(kitten.getKittens(1), 1);
    }

}
