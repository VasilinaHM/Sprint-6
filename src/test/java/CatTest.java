import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline kitten;

    @Test
    public void GetSound() {
        String expected = "Мяу";
        Cat cat;
        cat = new Cat(kitten);
        String actual = cat.getSound();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(kitten.eatMeat()).thenReturn(expected);
        Cat cat = new Cat(kitten);
        List<String> actual = cat.getFood();
        Assert.assertEquals(expected, actual);
    }
}