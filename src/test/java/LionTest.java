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

    @Test
    public void getKittens() {
        try {
            Lion alexLion = new Lion("Самец", kitten);
            Assert.assertEquals(alexLion.getKittens(), 1);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Test
    public void getFood() throws Exception {
        try {
            Lion alexLion = new Lion("Самец", kitten);
            List<String> expected = List.of("Животные", "Птицы", "Рыба");
            Assert.assertEquals(expected, alexLion.getFood());
        } catch (Exception e) {
            e.getMessage();
        }
    }
}