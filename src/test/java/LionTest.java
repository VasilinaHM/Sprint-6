import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {

    @Mock
    private Lion LionMock;

    Feline Kitten = new Feline();

    Lion AlexLion;

    {
        try {
            AlexLion = new Lion("Самец",Kitten);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public void getKittens() {
        Mockito.when(LionMock.getKittens()).thenReturn(1);
        Assert.assertEquals(AlexLion.getKittens(),LionMock.getKittens());
    }

    @Test
    public void doesHaveManeTrue() {

        Mockito.when(LionMock.doesHaveMane()).thenReturn(true);
        Assert.assertEquals(AlexLion.doesHaveMane(), LionMock.doesHaveMane());

    }

    @Test
    public void doesHaveManeFalse() {

        Lion AlexLionBad;

        {
            try {
                AlexLionBad = new Lion("Оно",Kitten);
                Mockito.when(LionMock.doesHaveMane()).thenReturn(false);
                Assert.assertEquals(AlexLionBad.doesHaveMane(), LionMock.doesHaveMane());
            } catch (Exception e) {
                System.out.println("Используйте допустимые значения пола животного - самец или самка");

            }
        }



    }



    @Test
    public void getFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(LionMock.getFood()).thenReturn(expected);
        Assert.assertEquals(LionMock.getFood(),  AlexLion.getFood());
    }
}