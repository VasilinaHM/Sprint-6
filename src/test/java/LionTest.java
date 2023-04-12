import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest  {
    Feline kitten = new Feline();
    Lion alexLion = new Lion("Самец", kitten);

    public LionTest() throws Exception {
    }

    @Test
    public void getKittens() {
        Assert.assertEquals(alexLion.getKittens(), 1);
    }
    @Test
    public void getFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, alexLion.getFood());
    }
}