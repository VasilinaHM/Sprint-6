
import java.util.List;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {
    @Mock
    private Feline MockKitten;

    Feline Kitten = new Feline();


    @Test
    public void testEatMeat() throws Exception {
             List<String> expected = List.of("Животные", "Птицы", "Рыба");
             Mockito.when(MockKitten.eatMeat()).thenReturn(expected);
             Assert.assertEquals(MockKitten.eatMeat(), Kitten.eatMeat());
    }



    @Test
    public void testGetFamily() {
        Mockito.when(MockKitten.getFamily()).thenReturn("Кошачьи");
        Assert.assertEquals(Kitten.getFamily(), MockKitten.getFamily());

    }

    @Test
    public void testGetKittens() {

        Mockito.when(MockKitten.getKittens()).thenReturn(1);
        Assert.assertEquals(Kitten.getKittens(), MockKitten.getKittens());
    }

    @Test
    public void testGetKittensWhithParam() {

        Mockito.when(MockKitten.getKittens(1)).thenReturn(1);
        Assert.assertEquals(Kitten.getKittens(1), MockKitten.getKittens(1));
    }

}
