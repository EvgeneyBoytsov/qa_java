import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {
    String expectedFamily = "Кошачьи";

    @Spy
    Feline feline;

    @Test
    public void testFelineEatMeat() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void testFelineGetFamily() {
        String actualFamily = feline.getFamily();

        Assert.assertEquals(expectedFamily,actualFamily);
    }

    @Test
    public void testFelineGetKittensByDefault() {
        feline.getKittens();
        Mockito.verify(feline).getKittens(1);
    }

    @Test
    public void testFelineGetKittensCount() {
        int actualKittens = feline.getKittens(12);
        Assert.assertEquals(12, actualKittens);
    }
}

